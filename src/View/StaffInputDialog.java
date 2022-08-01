package View;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import net.miginfocom.swing.MigLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;

public class StaffInputDialog extends JDialog {
	private JPanel topPanel;
	private JPanel inputPanel;
	private JPanel buttonPanel;
	private MigLayout layout;
	
	public StaffInputDialog() {
		setUndecorated(true);
		setSize(325,450);
		layout=new MigLayout("fill", "0[fill]0", "0[]10[fill]0[grow]0");
		getContentPane().setLayout(layout);
		
		topPanel = new JPanel();
		topPanel.setBackground(new Color(128, 0, 0));
		getContentPane().add(topPanel, "cell 0 0,height 40!");
		topPanel.setLayout(null);
		
		JPanel inputPanel = new JPanel();
		getContentPane().add(inputPanel, "cell 0 1,height 300!");
		
		JPanel buttonPanel = new JPanel();
		getContentPane().add(buttonPanel, "cell 0 2,grow,height 75!");
		

	}
}