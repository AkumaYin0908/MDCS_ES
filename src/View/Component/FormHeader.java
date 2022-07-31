package View.Component;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormHeader extends JPanel {
	
	private JButton btnClose;
	private MigLayout layout;
	public FormHeader() {
		setBackground(new Color(128, 0, 0));
		layout=new MigLayout("", "[][450,grow,trailing]", "[]");
		setLayout(layout);
		
		
		ImageIcon icon=new ImageIcon(getClass().getResource("/icons/cancel2.gif"));
		Image exitIcon=icon.getImage().getScaledInstance(24,24,Image.SCALE_SMOOTH);
		
		ImageIcon iconHover=new ImageIcon(getClass().getResource("/icons/hover.gif"));
		Image exitIconHover=iconHover.getImage().getScaledInstance(24,24,Image.SCALE_DEFAULT);
		
		btnClose=new JButton();
		btnClose.setBorder(null);
		btnClose.setContentAreaFilled(false);
		btnClose.setIcon(new ImageIcon(exitIcon));
		btnClose.setRolloverIcon(new ImageIcon(exitIconHover));
		btnClose.setMargin(new Insets(0, 0, 0, 0));
		btnClose.setForeground(Color.WHITE);
		btnClose.setFont(new Font("Roboto", Font.BOLD, 12));
		btnClose.setBackground(new Color(128, 0, 0));
		add(btnClose, "cell 1 0,alignx right");
	}
	
	public JButton CloseButton() {
		return btnClose;
	}

}
