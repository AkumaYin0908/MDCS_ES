package View.StudentForm.Component;

import javax.swing.*;
import java.awt.*;


public class ButtonPanel extends JPanel {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton btnEnroll,btnPrint;
	
	
	public ButtonPanel() {
		setOpaque(false);
		setLayout(null);
		
		btnEnroll = new JButton("Enroll");
		btnEnroll.setBounds(132, 5, 90, 45);
		btnEnroll.setPreferredSize(new Dimension(90, 45));
		btnEnroll.setMargin(new Insets(2, 14, 2, 2));
		btnEnroll.setHorizontalAlignment(SwingConstants.LEFT);
		btnEnroll.setForeground(Color.WHITE);
		btnEnroll.setFont(new Font("Roboto", Font.BOLD, 12));
		btnEnroll.setBackground(new Color(128, 0, 0));
		add(btnEnroll);
		
		btnPrint = new JButton("Print");
		btnPrint.setBounds(227, 5, 90, 45);
		btnPrint.setPreferredSize(new Dimension(90, 45));
		btnPrint.setMargin(new Insets(2, 14, 2, 2));
		btnPrint.setHorizontalAlignment(SwingConstants.LEFT);
		btnPrint.setForeground(Color.WHITE);
		btnPrint.setFont(new Font("Roboto", Font.BOLD, 12));
		btnPrint.setEnabled(false);
		btnPrint.setBackground(new Color(128, 0, 0));
		add(btnPrint);

	}

	public JButton getBtnEnroll() {
		return btnEnroll;
	}

	public JButton getBtnPrint() {
		return btnPrint;
	}
	

}
