package View;

import javax.swing.*;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Component;
import java.awt.SystemColor;
import java.awt.FlowLayout;
import javax.swing.JTable;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.border.TitledBorder;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import java.awt.Font;
import javax.swing.ListSelectionModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.Insets;
import OtherGUIFunctionalities.DragListener;
import View.MainFrame.MainFrame;
import View.MainFrame.Event.EventMenuSelected;

import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import javax.swing.border.LineBorder;
import javax.swing.border.EmptyBorder;


public class UserForm extends JDialog {


	private static final long serialVersionUID = 1L;
	private JTable table;
	private JLabel lblUserID;
	private JTextField txtLastName;
	private JTextField txtFirstName;
	private JTextField txtMidName;
	private JTextField txtUserName;
	private JPasswordField txtPassword;
	private JLabel lblRePass;
	private JPasswordField txtRePass;
	private JComboBox<String> cbxDesignation;
	private JButton btnAdd;
	private JButton btnEdit;
	private JButton btnSave;
	private JButton btnDelete;
	private JPanel infoPanel;
	private JPanel buttonPanel;
	DragListener drag;
	private DefaultTableModel tableModel;
	
	
	/**************************************************	USERFORM CONSTRUCTOR ****************************************/
	public UserForm() {
		setModal(true);
		getContentPane().setBackground(Color.DARK_GRAY);
		drag=new DragListener();
		addMouseListener(drag);
		addMouseMotionListener(drag);
		setUndecorated(true);
		setBounds(100, 100, 480, 420);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		getRootPane().setBorder(BorderFactory.createLineBorder(new Color(128,0,0)));
		
		/**************************************************	TABLE PANEL ****************************************/
		
		
		
		JPanel tablePanel = new JPanel();
		tablePanel.setOpaque(false);
		tablePanel.setBorder(null);
		tablePanel.setBackground(Color.WHITE);
		tablePanel.setBounds(10, 42, 465, 310);
		getContentPane().add(tablePanel);
		tablePanel.setLayout(null);
		
		tableModel=new DefaultTableModel(new Object[][] {
			},
			new String[] {
				"User ID", "Name", "User Name", "Designation"
			}
		);
		
		table = new JTable() {
			public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
	            Component comp = super.prepareRenderer(renderer, row, column);
	            Color alternateColor = new Color(201,201,201);
	            Color whiteColor = Color.WHITE;
	            if(!comp.getBackground().equals(getSelectionBackground())) {
	               Color bg = (row % 2 == 0 ? alternateColor : whiteColor);
	               comp.setBackground(bg);
	               bg = null;
	            }
	            return comp;
	         }
		};
		table.setOpaque(false);
		table.setBorder(null);
		table.setShowHorizontalLines(false);
		table.setShowGrid(false);
		table.setShowVerticalLines(false);
		table.setFocusTraversalKeysEnabled(false);
		table.setFillsViewportHeight(true);
		table.setSelectionForeground(Color.WHITE);
		table.setRowHeight(20);
		table.setRowMargin(0);
		table.setIntercellSpacing(new Dimension(0, 0));
		table.setFocusable(false);
		table.setGridColor(new Color(128, 0, 0));
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setSelectionBackground(new Color(165, 42, 42));
		table.setForeground(SystemColor.desktop);
		table.setFont(new Font("Roboto", Font.PLAIN, 12));
		table.setBackground(Color.DARK_GRAY);
		table.setModel(tableModel);
		table.getColumnModel().getColumn(0).setPreferredWidth(5);
		table.getColumnModel().getColumn(1).setPreferredWidth(100);
		
		
		
		
		DefaultTableCellRenderer r = new DefaultTableCellRenderer() {
		    /**
			 * 
			 */
			private static final long serialVersionUID = 1L;
			Font font = new Font("Roboto",Font.BOLD,12);

		    @Override
		    public Component getTableCellRendererComponent(JTable table,
		            Object value, boolean isSelected, boolean hasFocus,
		            int row, int column) {
		        super.getTableCellRendererComponent(table, value, isSelected, hasFocus,
		                row, column);
		        
		        setBorder(null);
		        setFont(font);
		        setBackground(new Color(128,0,0));
		        setForeground(Color.white);
		        setPreferredSize(new Dimension(10,25));
		        setHorizontalAlignment(JLabel.CENTER);
		        return this;
		    }

		};
		
		table.getTableHeader().setDefaultRenderer(r);
		table.getTableHeader().setReorderingAllowed(false);
		DefaultTableCellRenderer toCenter = new DefaultTableCellRenderer();
		toCenter.setHorizontalAlignment(JLabel.CENTER);
		for(int i=0;i<table.getColumnCount();i++) {
			table.getColumnModel().getColumn(i).setCellRenderer(toCenter);
		}
		
		JScrollPane scroll = new JScrollPane(table);
		scroll.setOpaque(false);
		scroll.setBorder(new EmptyBorder(0, 0, 0, 0));
		scroll.setBounds(10, 10, 450, 290);
		tablePanel.add(scroll);

		
		/**************************************************	BUTTON PANEL ****************************************/
		
		
		buttonPanel = new JPanel();
		buttonPanel.setBackground(Color.DARK_GRAY);
		buttonPanel.setBounds(10, 350, 465, 70);
		getContentPane().add(buttonPanel);
		buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		
		ImageIcon forAddIcon=new ImageIcon(getClass().getResource("/icons/adduser.gif"));
		Image addIcon=forAddIcon.getImage().getScaledInstance(24,24,Image.SCALE_SMOOTH);
		
		
		ImageIcon forEditIcon=new ImageIcon(getClass().getResource("/icons/edituser.gif"));
		Image editIcon=forEditIcon.getImage().getScaledInstance(24,24,Image.SCALE_SMOOTH);
		
		
		ImageIcon forDeleteIcon=new ImageIcon(getClass().getResource("/icons/deleteuser.gif"));
		Image deleteIcon=forDeleteIcon.getImage().getScaledInstance(24,24,Image.SCALE_SMOOTH);
		
		
		
		ImageIcon forSaveIcon=new ImageIcon(getClass().getResource("/icons/save.gif"));
		Image saveIcon=forSaveIcon.getImage().getScaledInstance(24,24,Image.SCALE_SMOOTH);
		
		btnAdd = new JButton("Add");
		btnAdd.setMargin(new Insets(2, 14, 2, 2));
		btnAdd.setHorizontalAlignment(SwingConstants.LEFT);
		btnAdd.setForeground(new Color(255, 255, 255));
		btnAdd.setBackground(new Color(128, 0, 0));
		btnAdd.setFont(new Font("Roboto", Font.BOLD, 12));
		btnAdd.setIcon(new ImageIcon(addIcon));
		btnAdd.setPreferredSize(new Dimension(90,45));
		buttonPanel.add(btnAdd);
		
		btnEdit = new JButton("Edit");
		btnEdit.setEnabled(false);
		btnEdit.setIcon(new ImageIcon(editIcon));
		btnEdit.setMargin(new Insets(2, 14, 2, 2));
		btnEdit.setHorizontalAlignment(SwingConstants.LEFT);
		btnEdit.setForeground(Color.WHITE);
		btnEdit.setFont(new Font("Roboto", Font.BOLD, 12));
		btnEdit.setBackground(new Color(128, 0, 0));
		btnEdit.setPreferredSize(new Dimension(90,45));
		buttonPanel.add(btnEdit);
		
		btnSave = new JButton("Save");
		btnSave.setEnabled(false);
		btnSave.setIcon(new ImageIcon(saveIcon));
		btnSave.setMargin(new Insets(2, 14, 2, 2));
		btnSave.setHorizontalAlignment(SwingConstants.LEFT);
		btnSave.setForeground(Color.WHITE);
		btnSave.setFont(new Font("Roboto", Font.BOLD, 12));
		btnSave.setBackground(new Color(128, 0, 0));
		btnSave.setPreferredSize(new Dimension(90,45));
		buttonPanel.add(btnSave);
		
		btnDelete = new JButton("Delete");
		btnDelete.setEnabled(false);
	
		btnDelete.setIcon(new ImageIcon(deleteIcon));
		btnDelete.setMargin(new Insets(2, 14, 2, 2));
		btnDelete.setHorizontalAlignment(SwingConstants.LEFT);
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setFont(new Font("Roboto", Font.BOLD, 12));
		btnDelete.setBackground(new Color(128, 0, 0));
		btnDelete.setPreferredSize(new Dimension(90,45));
		buttonPanel.add(btnDelete);
		
		
		/**************************************************	TOP PANEL ****************************************/
		
		JPanel topPanel = new JPanel();
		topPanel.setBounds(0, 0, 485, 40);
		topPanel.setBackground(new Color(128, 0, 0));
		getContentPane().add(topPanel);
		topPanel.setLayout(null);
		
		JButton btnClose = new JButton();
		
		
		btnClose.setBorder(null);
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
		
		ImageIcon icon=new ImageIcon(getClass().getResource("/icons/cancel2.gif"));
		Image exitIcon=icon.getImage().getScaledInstance(24,24,Image.SCALE_SMOOTH);
		
		
		ImageIcon iconHover=new ImageIcon(getClass().getResource("/icons/hover.gif"));
		Image exitIconHover=iconHover.getImage().getScaledInstance(24,24,Image.SCALE_DEFAULT);
		
		
		btnClose.setContentAreaFilled(false);
		btnClose.setIcon(new ImageIcon(exitIcon));
		btnClose.setRolloverIcon(new ImageIcon(exitIconHover));
		btnClose.setMargin(new Insets(0, 0, 0, 0));
		btnClose.setForeground(Color.WHITE);
		btnClose.setFont(new Font("Roboto", Font.BOLD, 12));
		btnClose.setBackground(new Color(128, 0, 0));
		btnClose.setBounds(450, 7, 24, 24);
		topPanel.add(btnClose);
		
		
		
		/**************************************************	USER INFORMATION PANEL ****************************************/
		
		infoPanel = new JPanel();
		infoPanel.setBackground(Color.DARK_GRAY);
		infoPanel.setFocusTraversalPolicyProvider(true);
		infoPanel.setVisible(false);
		infoPanel.setBounds(20, 348, 450, 155);
		infoPanel.setFont(new Font("Roboto", infoPanel.getFont().getStyle(), 12));
		infoPanel.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255)), "User Info", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		getContentPane().add(infoPanel);
		
		JLabel lblUserIDCaption = new JLabel("User ID");
		lblUserIDCaption.setForeground(Color.WHITE);
		lblUserIDCaption.setFont(new Font("Roboto", Font.PLAIN, 12));
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setForeground(Color.WHITE);
		lblLastName.setFont(new Font("Roboto", Font.PLAIN, 12));
		
		txtLastName = new JTextField();
		lblLastName.setLabelFor(txtLastName);
		txtLastName.setColumns(10);
		
		txtFirstName = new JTextField();
		txtFirstName.setColumns(10);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setForeground(Color.WHITE);
		lblFirstName.setLabelFor(txtFirstName);
		lblFirstName.setFont(new Font("Roboto", Font.PLAIN, 12));
		
		JLabel lblMidName = new JLabel("Middle Name");
		lblMidName.setForeground(Color.WHITE);
		lblMidName.setFont(new Font("Roboto", Font.PLAIN, 12));
		
		txtMidName = new JTextField();
		lblMidName.setLabelFor(txtMidName);
		txtMidName.setColumns(10);
		
		JLabel lblUserName = new JLabel("User Name");
		lblUserName.setForeground(Color.WHITE);
		lblUserName.setFont(new Font("Roboto", Font.PLAIN, 12));
		
		txtUserName = new JTextField();
		lblUserName.setLabelFor(txtUserName);
		txtUserName.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setForeground(Color.WHITE);
		lblPassword.setLabelFor(lblPassword);
		lblPassword.setFont(new Font("Roboto", Font.PLAIN, 12));
		
		lblRePass = new JLabel("Verify Pass");
		lblRePass.setForeground(Color.WHITE);
		lblRePass.setVisible(false);
		lblRePass.setEnabled(false);
		lblRePass.setFont(new Font("Roboto", Font.PLAIN, 12));
		
		txtPassword = new JPasswordField();
		
		txtRePass = new JPasswordField();
		txtRePass.setVisible(false);
		txtRePass.setEnabled(false);
		lblRePass.setLabelFor(txtRePass);
		
		JLabel lblDesignation = new JLabel("Designation");
		lblDesignation.setForeground(Color.WHITE);
		lblDesignation.setFont(new Font("Roboto", Font.PLAIN, 12));
		String[] designation= {"Administrator","Cashier","Registrar"};
		ComboBoxModel<String> cbxMDesignation=new DefaultComboBoxModel<>(designation);
		cbxDesignation = new JComboBox<>(cbxMDesignation);
		lblDesignation.setLabelFor(cbxDesignation);
		
		lblUserID = new JLabel("");
		lblUserID.setOpaque(true);
		lblUserID.setForeground(Color.WHITE);
		lblUserID.setBackground(new Color(128, 0, 0));
		lblUserID.setFont(new Font("Roboto", Font.PLAIN, 18));
		lblUserID.setHorizontalAlignment(JLabel.CENTER);
		GroupLayout gl_panel = new GroupLayout(infoPanel);
		gl_panel.setHorizontalGroup(
			gl_panel.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_panel.createSequentialGroup()
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_panel.createSequentialGroup()
							.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
								.addComponent(lblLastName, GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
								.addComponent(lblMidName, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblFirstName, GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE))
							.addPreferredGap(ComponentPlacement.RELATED))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblUserIDCaption)
							.addGap(38)))
					.addGroup(gl_panel.createParallelGroup(Alignment.LEADING)
						.addComponent(lblUserID, GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
							.addComponent(txtMidName, GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
							.addComponent(txtFirstName, GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
							.addComponent(txtLastName)))
					.addGap(26)
					.addGroup(gl_panel.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_panel.createParallelGroup(Alignment.LEADING, false)
							.addGroup(gl_panel.createSequentialGroup()
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(lblUserName, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(txtUserName, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_panel.createSequentialGroup()
								.addComponent(lblPassword, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(txtPassword, GroupLayout.PREFERRED_SIZE, 118, GroupLayout.PREFERRED_SIZE))
							.addGroup(gl_panel.createSequentialGroup()
								.addComponent(lblDesignation, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
								.addPreferredGap(ComponentPlacement.RELATED)
								.addComponent(cbxDesignation, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
						.addGroup(gl_panel.createSequentialGroup()
							.addComponent(lblRePass, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtRePass, GroupLayout.PREFERRED_SIZE, 117, GroupLayout.PREFERRED_SIZE)
							.addGap(1)))
					.addGap(25))
		);
		gl_panel.setVerticalGroup(
			gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_panel.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblUserIDCaption)
						.addComponent(lblUserName, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtUserName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblUserID, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE))
					.addGap(11)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblLastName, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtLastName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPassword, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtPassword, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtFirstName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblFirstName, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblRePass, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtRePass, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_panel.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtMidName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblMidName, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblDesignation, GroupLayout.PREFERRED_SIZE, 15, GroupLayout.PREFERRED_SIZE)
						.addComponent(cbxDesignation, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(38))
		);
		infoPanel.setLayout(gl_panel);
		
	}
	
	/***********************	GETTERS AND SETTERS OF INFO PANEL COMPONENTS *********************/
	
	public JLabel getUserID() {
		return lblUserID;
	}
	
	public JTextField getLastName() {
		return txtLastName;
	}
	
	
	public JTextField getFirstName() {
		return txtFirstName;
	}
	
	
	public JTextField getMidName() {
		return txtMidName;
	}
	
	
	public JTextField getUserName() {
		return txtUserName;
	}
	
	
	public JTextField getPassword() {
		return txtPassword;
	}
	
	public JLabel getLabelRePass() {
		return lblRePass;
	}
	public JTextField getRePass() {
		return txtRePass;
	}
	
	
	public JComboBox<String> getDesignation() {
		return cbxDesignation;
	}
	
	
	/***********************	GETTERS OF TABLE PANEL COMPONENTS *********************/
	
	
	
	public JTable getTable() {
		return table;
	}
	
	
	public DefaultTableModel getTableModel() {
		return tableModel;
	}

	
	/***********************	GETTERS AND SETTERS OF BUTTON PANEL COMPONENTS *********************/
	
	public JButton getAddButton() {
		return btnAdd;
	}
	public JButton getEditButton() {
		return btnEdit;
	}
	
	
	public JButton getSaveButton() {
		return btnSave;
	}
	public JButton getDeleteButton() {
		return btnDelete;
	}
	
	/***********************	GETTERS AND SETTERS OF PANELS *********************/
	
	public JPanel getInfoPanel() {
		return infoPanel;
	}
	public JPanel getbuttonPanel() {
		return buttonPanel;
	}
	
	
	
}
