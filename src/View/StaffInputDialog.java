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
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import javax.swing.SwingConstants;
import java.awt.Dimension;
import java.awt.CardLayout;
import javax.swing.SpringLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.border.BevelBorder;

public class StaffInputDialog extends JDialog {
	private JPanel topPanel;
	private JPanel inputPanel;
	private JPanel buttonPanel;
	private MigLayout layout;
	private JTextField txtStaffID;
	private JTextField txtLastName;
	private JTextField txtFirstName;
	private JTextField txtMidName;
	private JTextField txtPosition;
	private JButton btnSave;
	private JButton btnBack;
	
	/**************************************************	STAFF INPUT DIALOG CONSTRUCTOR ****************************************/
	
	public StaffInputDialog() {
		setUndecorated(true);
		setSize(325,435);
		layout=new MigLayout("fill", "0[fill]0", "0[]10[fill]0[grow]0");
		getContentPane().setLayout(layout);
		
		/**************************************************	TOP PANEL ****************************************/
		topPanel = new JPanel();
		topPanel.setBackground(new Color(128, 0, 0));
		getContentPane().add(topPanel, "cell 0 0,height 40!");
		topPanel.setLayout(null);
		
		/**************************************************	INPUT PANEL ****************************************/
		inputPanel = new JPanel();
		getContentPane().add(inputPanel, "cell 0 1,height 300!");
		GridBagLayout gbl_inputPanel = new GridBagLayout();
		gbl_inputPanel.columnWidths = new int[]{46, 0};
		gbl_inputPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_inputPanel.columnWeights = new double[]{1.0, Double.MIN_VALUE};
		gbl_inputPanel.rowWeights = new double[]{1.0, 1.0, 1.0, 1.0, 1.0, Double.MIN_VALUE};
		inputPanel.setLayout(gbl_inputPanel);
		
		txtStaffID = new JTextField();
		txtStaffID.setOpaque(false);
		txtStaffID.setBorder(new TitledBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(128, 0, 0)), "Staff ID", TitledBorder.LEADING, TitledBorder.TOP, new Font("Roboto", Font.PLAIN,14), new Color(128, 0, 0)));
		txtStaffID.setFont(new Font("Roboto", Font.PLAIN, 16));
		GridBagConstraints gbc_txtStaffID = new GridBagConstraints();
		gbc_txtStaffID.insets = new Insets(5, 20, 5, 20);
		gbc_txtStaffID.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtStaffID.gridx = 0;
		gbc_txtStaffID.gridy = 0;
		inputPanel.add(txtStaffID, gbc_txtStaffID);
		txtStaffID.setColumns(10);
		
		txtLastName = new JTextField();
		txtLastName.setOpaque(false);
		txtLastName.setFont(new Font("Roboto", Font.PLAIN, 16));
		txtLastName.setColumns(10);
		txtLastName.setBorder(new TitledBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(128, 0, 0)), "Last Name", TitledBorder.LEADING, TitledBorder.TOP, new Font("Roboto", Font.PLAIN,14), new Color(128, 0, 0)));
		GridBagConstraints gbc_txtLastName = new GridBagConstraints();
		gbc_txtLastName.insets = new Insets(5, 20, 5, 20);
		gbc_txtLastName.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtLastName.gridx = 0;
		gbc_txtLastName.gridy = 1;
		inputPanel.add(txtLastName, gbc_txtLastName);
		
		txtFirstName = new JTextField();
		txtFirstName.setOpaque(false);
		txtFirstName.setFont(new Font("Roboto", Font.PLAIN, 16));
		txtFirstName.setColumns(10);
		txtFirstName.setBorder(new TitledBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(128, 0, 0)), "First Name", TitledBorder.LEADING, TitledBorder.TOP, new Font("Roboto", Font.PLAIN,14), new Color(128, 0, 0)));
		GridBagConstraints gbc_txtFirstName = new GridBagConstraints();
		gbc_txtFirstName.insets = new Insets(5, 20, 5, 20);
		gbc_txtFirstName.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtFirstName.gridx = 0;
		gbc_txtFirstName.gridy = 2;
		inputPanel.add(txtFirstName, gbc_txtFirstName);
		
		txtMidName = new JTextField();
		txtMidName.setOpaque(false);
		txtMidName.setFont(new Font("Roboto", Font.PLAIN, 16));
		txtMidName.setColumns(10);
		txtMidName.setBorder(new TitledBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(128, 0, 0)), "Middle Name", TitledBorder.LEADING, TitledBorder.TOP, new Font("Roboto", Font.PLAIN,14), new Color(128, 0, 0)));
		GridBagConstraints gbc_txtMidName = new GridBagConstraints();
		gbc_txtMidName.insets = new Insets(5, 20, 5, 20);
		gbc_txtMidName.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtMidName.gridx = 0;
		gbc_txtMidName.gridy = 3;
		inputPanel.add(txtMidName, gbc_txtMidName);
		
		txtPosition = new JTextField();
		txtPosition.setOpaque(false);
		txtPosition.setFont(new Font("Roboto", Font.PLAIN, 16));
		txtPosition.setColumns(10);
		txtPosition.setBorder(new TitledBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(128, 0, 0)), "Position", TitledBorder.LEADING, TitledBorder.TOP, new Font("Roboto", Font.PLAIN,14), new Color(128, 0, 0)));
		GridBagConstraints gbc_txtPosition = new GridBagConstraints();
		gbc_txtPosition.insets = new Insets(5, 20, 5, 20);
		gbc_txtPosition.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtPosition.gridx = 0;
		gbc_txtPosition.gridy = 4;
		inputPanel.add(txtPosition, gbc_txtPosition);
		
		/**************************************************	BUTTON PANEL ****************************************/
		
		buttonPanel = new JPanel();
		getContentPane().add(buttonPanel, "cell 0 2,height 75!");
		buttonPanel.setLayout(new MigLayout("fill", "50[100!,grow]20[100!,grow]50", "[50]"));
		
		
		btnSave = new JButton("Save");
		btnSave.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnSave.setHorizontalTextPosition(SwingConstants.CENTER);
		btnSave.setPreferredSize(new Dimension(90, 45));
		btnSave.setMargin(new Insets(2, 14, 2, 2));
		btnSave.setForeground(Color.WHITE);
		btnSave.setFont(new Font("Roboto", Font.BOLD, 12));
		btnSave.setBackground(new Color(128, 0, 0));
		buttonPanel.add(btnSave, "cell 0 0,height 50!");
		
		btnBack = new JButton("Back");
		btnBack.setBorder(new EmptyBorder(0, 0, 0, 0));
		btnBack.setHorizontalTextPosition(SwingConstants.CENTER);
		btnBack.setPreferredSize(new Dimension(90, 45));
		btnBack.setMargin(new Insets(2, 14, 2, 2));
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Roboto", Font.BOLD, 12));
		btnBack.setBackground(new Color(128, 0, 0));
		buttonPanel.add(btnBack, "cell 1 0,height 50!");
		
	}
	
	/**************************************************	GETTERS METHOD ****************************************/

	public JTextField getTxtStaffID() {
		return txtStaffID;
	}

	public JTextField getTxtLastName() {
		return txtLastName;
	}

	public JTextField getTxtFirstName() {
		return txtFirstName;
	}

	public JTextField getTxtMidName() {
		return txtMidName;
	}

	public JTextField getTxtPosition() {
		return txtPosition;
	}

	public JButton getBtnSave() {
		return btnSave;
	}

	public JButton getBtnBack() {
		return btnBack;
	}
	
	
}