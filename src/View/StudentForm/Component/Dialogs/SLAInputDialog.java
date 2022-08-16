package View.StudentForm.Component.Dialogs;



import javax.swing.*;
import javax.swing.border.EmptyBorder;
import net.miginfocom.swing.MigLayout;
import java.awt.Color;
import java.awt.Insets;
import java.awt.Font;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;

import OtherGUIFunctionalities.DragListener;
import View.StudentForm.Component.SLAPanel;

import java.awt.Dimension;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

public class SLAInputDialog extends JDialog {
	private SLAPanel slaPanel;
	private DefaultTableModel tableModel;
	private JPanel topPanel;
	private JPanel inputPanel;
	private JPanel buttonPanel;
	private MigLayout layout;
	private JTextField txtSchool;
	private JButton btnSave;
	private JButton btnBack;

	private JPanel addPanel;
	private JComboBox<String> cbxProvince,cbxMunCity,cbxBarangay;
	DragListener drag;
	private JTextField txtStreet;
	private JPanel periodPanel;
	private JComboBox<String> cbxYFrom,cbxYTo;
	
	/**************************************************	STAFF INPUT DIALOG CONSTRUCTOR ****************************************/
	
	public SLAInputDialog(SLAPanel slaPanel) {
		this.slaPanel=slaPanel;
		this.tableModel=slaPanel.getTableModel();
		
		initialize();
		init();
	}
	
	/**************************************************	INIT METHOD ****************************************/
	
	public void init() {
		
		/**************************************************	TOP PANEL ****************************************/
		topPanel = new JPanel();
		topPanel.setBackground(new Color(128, 0, 0));
		getContentPane().add(topPanel, "cell 0 0,height 40!");
		topPanel.setLayout(null);
		
		/**************************************************	INPUT PANEL ****************************************/
		inputPanel = new JPanel();
		getContentPane().add(inputPanel, "cell 0 1,height 250!");
		inputPanel.setLayout(new MigLayout("fillx", "[grow,fill]", "10[]10[]10[]10"));
		
		txtSchool = new JTextField();
		txtSchool.setHorizontalAlignment(SwingConstants.CENTER);
		txtSchool.setFocusable(false);
		txtSchool.setOpaque(false);
		txtSchool.setBorder(new TitledBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(128, 0, 0)), "Name of School", TitledBorder.LEADING, TitledBorder.TOP, new Font("Roboto", Font.PLAIN,14), new Color(128, 0, 0)));
		txtSchool.setFont(new Font("Roboto", Font.PLAIN, 16));
		inputPanel.add(txtSchool, "cell 0 0,growx,aligny center");
		txtSchool.setColumns(10);
	
		
		addPanel = new JPanel();
		addPanel.setForeground(new Color(128, 0, 0));
		addPanel.setSize(new Dimension(300, 35));
		addPanel.setOpaque(false);
		addPanel.setBorder(new TitledBorder(new TitledBorder(new EmptyBorder(0, 0, 0, 0), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)), "Address", TitledBorder.LEADING, TitledBorder.TOP,new Font("Roboto", Font.PLAIN,14), new Color(128, 0, 0)));
		inputPanel.add(addPanel, "cell 0 1,grow");
		addPanel.setLayout(new MigLayout("fillx", "[][grow][grow]", "[]10[]"));
		
		txtStreet = new JTextField();
		txtStreet.setOpaque(false);
		txtStreet.setText("sdfdsf");
		txtStreet.setBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(128, 0, 0)));
		txtStreet.setFont(new Font("Roboto", Font.PLAIN, 12));
		addPanel.add(txtStreet, "cell 0 0,alignx left,aligny center");
		txtStreet.setColumns(10);
		
		cbxBarangay = new JComboBox<String>();
		cbxBarangay.setRequestFocusEnabled(false);
		cbxBarangay.setForeground(Color.WHITE);
		cbxBarangay.setFont(new Font("Roboto", Font.PLAIN, 12));
		cbxBarangay.setBackground(Color.DARK_GRAY);
		cbxBarangay.setBorder(null);
		cbxBarangay.setFocusable(false);
		cbxBarangay.setOpaque(false);
		cbxBarangay.setPreferredSize(new Dimension(100,25));
		addPanel.add(cbxBarangay, "cell 1 0");
		
		cbxMunCity = new JComboBox<String>();
		cbxMunCity.setRequestFocusEnabled(false);
		cbxMunCity.setForeground(Color.WHITE);
		cbxMunCity.setFont(new Font("Roboto", Font.PLAIN, 12));
		cbxMunCity.setBackground(Color.DARK_GRAY);
		cbxMunCity.setBorder(null);
		cbxMunCity.setFocusable(false);
		cbxMunCity.setOpaque(false);
		cbxMunCity.setPreferredSize(new Dimension(100,25));
		addPanel.add(cbxMunCity, "cell 2 0");
		
		cbxProvince = new JComboBox<String>();
		cbxProvince.setRequestFocusEnabled(false);
		cbxProvince.setForeground(Color.WHITE);
		cbxProvince.setFont(new Font("Roboto", Font.PLAIN, 12));
		cbxProvince.setBackground(Color.DARK_GRAY);
		cbxProvince.setBorder(null);
		cbxProvince.setFocusable(false);
		cbxProvince.setOpaque(false);
		cbxProvince.setPreferredSize(new Dimension(100,25));
		addPanel.add(cbxProvince, "cell 1 1 2 1,alignx center");
		
		periodPanel = new JPanel();
		periodPanel.setSize(new Dimension(300, 35));
		periodPanel.setOpaque(false);
		periodPanel.setForeground(new Color(128, 0, 0));
		periodPanel.setBorder(new TitledBorder(new TitledBorder(new EmptyBorder(0, 0, 0, 0), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)), 
				"Period Covered", TitledBorder.LEADING, TitledBorder.TOP, new Font("Roboto",Font.PLAIN,14), new Color(128, 0, 0)));
		
		inputPanel.add(periodPanel, "cell 0 2,grow");
		periodPanel.setLayout(new MigLayout("fillx", "[][]", "[][]"));
		
		cbxYFrom = new JComboBox<String>();
		cbxYFrom.setRequestFocusEnabled(false);
		cbxYFrom.setPreferredSize(new Dimension(100, 25));
		cbxYFrom.setOpaque(false);
		cbxYFrom.setForeground(Color.WHITE);
		cbxYFrom.setFont(new Font("Roboto", Font.PLAIN, 12));
		cbxYFrom.setFocusable(false);
		cbxYFrom.setBorder(new TitledBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(128, 0, 0)), "From", TitledBorder.LEADING, TitledBorder.TOP, new Font("Roboto",Font.PLAIN,12), new Color(128, 0, 0)));
		cbxYFrom.setBackground(Color.DARK_GRAY);
		periodPanel.add(cbxYFrom, "cell 0 0,growx");
		
		cbxYTo = new JComboBox<String>();
		cbxYTo.setRequestFocusEnabled(false);
		cbxYTo.setPreferredSize(new Dimension(100, 25));
		cbxYTo.setOpaque(false);
		cbxYTo.setForeground(Color.WHITE);
		cbxYTo.setFont(new Font("Roboto", Font.PLAIN, 12));
		cbxYTo.setFocusable(false);
		cbxYTo.setBorder(new TitledBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(128, 0, 0)), "To", TitledBorder.LEADING, TitledBorder.TOP, new Font("Roboto",Font.PLAIN,12), new Color(128, 0, 0)));
		cbxYTo.setBackground(Color.DARK_GRAY);
		periodPanel.add(cbxYTo, "cell 1 0,growx");
		/**************************************************	BUTTON PANEL ****************************************/
		
		buttonPanel = new JPanel();
		getContentPane().add(buttonPanel, "cell 0 2,height 75!");
		buttonPanel.setLayout(new MigLayout("fill", "50[100!,grow]20[100!,grow]50", "[50]"));
		
		
		btnSave = new JButton();
		btnSave.setText("Save");
		btnSave.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnSave.setHorizontalTextPosition(SwingConstants.CENTER);
		btnSave.setPreferredSize(new Dimension(90, 45));
		btnSave.setMargin(new Insets(2, 14, 2, 2));
		btnSave.setForeground(Color.WHITE);
		btnSave.setFont(new Font("Roboto", Font.BOLD, 14));
		btnSave.setBackground(new Color(128, 0, 0));
		buttonPanel.add(btnSave, "cell 0 0,height 50!");
	
		btnBack = new JButton();
		btnBack.setText("Back");
		btnBack.setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		btnBack.setHorizontalTextPosition(SwingConstants.CENTER);
		btnBack.setPreferredSize(new Dimension(90, 45));
		btnBack.setMargin(new Insets(2, 14, 2, 2));
		btnBack.setForeground(Color.WHITE);
		btnBack.setFont(new Font("Roboto", Font.BOLD, 14));
		btnBack.setBackground(new Color(128, 0, 0));
		buttonPanel.add(btnBack, "cell 1 0,height 50!");
		
	}
	
	/**************************************************	INITIALIZE METHOD ****************************************/
	public void initialize() {
		setModal(true);
		setUndecorated(true);
		setSize(325,375);
		setLocationRelativeTo(null);
		drag=new DragListener();
		addMouseListener(drag);
		addMouseMotionListener(drag);
		layout=new MigLayout("fill", "0[fill]0", "0[]0[]0[grow]0");
		getContentPane().setLayout(layout);
	}

	public DefaultTableModel getTableModel() {
		return tableModel;
	}

	public JTextField getTxtSchool() {
		return txtSchool;
	}

	public JButton getBtnSave() {
		return btnSave;
	}

	public JButton getBtnBack() {
		return btnBack;
	}

	public JComboBox getCbxProvince() {
		return cbxProvince;
	}

	public JComboBox getCbxMunCity() {
		return cbxMunCity;
	}

	public JComboBox getCbxBarangay() {
		return cbxBarangay;
	}

	public JTextField getTxtStreet() {
		return txtStreet;
	}

	public JComboBox<String> getCbxYFrom() {
		return cbxYFrom;
	}

	public JComboBox<String> getCbxYTo() {
		return cbxYTo;
	}
	
	/**************************************************	GETTERS METHOD ****************************************/
	
	
}