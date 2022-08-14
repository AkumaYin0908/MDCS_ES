package View.StudentForm.Component;

import javax.swing.JPanel;
import java.awt.Color;
import net.miginfocom.swing.MigLayout;
import javax.swing.border.LineBorder;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.border.MatteBorder;
import java.awt.Font;
import java.awt.Dimension;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import java.awt.Rectangle;
import javax.swing.border.CompoundBorder;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class ParInfoPanel extends JPanel {
	private JTextField txtFLastName;
	private JTextField txtFMidName;
	private JTextField txtFFirstName;
	private JTextField txtFResNo;
	private JTextField txtFOStreet;
	private JTextField txtFOffNo;
	private JTextField txtFMobNo;
	private JTextField txtFEmail;
	private JTextField txtFOcc;
	private JTextField txtMLastName;
	private JTextField txtMMiddleName;
	private JTextField txtMResNo;
	private JTextField txtMFirstName;
	private JTextField txtMMobNo;
	private JTextField txtMOffNo;
	private JTextField txtMEmail;
	private JTextField txtMOcc;
	private JTextField txtFStreet;
	private JTextField txtMStreet;
	private JTextField txtMOStreet;
	private JPanel otherPanel;
	private JTextField textField;

	/**
	 * Create the panel.
	 */
	public ParInfoPanel() {
		setOpaque(false);
		setBackground(Color.DARK_GRAY);
		setLayout(null);
		
		JPanel parInfoPanel = new JPanel();
		parInfoPanel.setPreferredSize(new Dimension(680, 560));
		parInfoPanel.setOpaque(false);
		parInfoPanel.setBorder(new LineBorder(new Color(128, 0, 0)));
		parInfoPanel.setBounds(10, 11, 680, 693);
		add(parInfoPanel);
		parInfoPanel.setLayout(null);
		
		JPanel fatherPanel = new JPanel();
		fatherPanel.setOpaque(false);
		fatherPanel.setBackground(Color.DARK_GRAY);
		fatherPanel.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255)), "Father's Information", TitledBorder.LEADING, TitledBorder.TOP, new Font("Roboto",Font.PLAIN,12), new Color(255, 255, 255)));
		fatherPanel.setBounds(10, 11, 660, 270);
		parInfoPanel.add(fatherPanel);
		fatherPanel.setLayout(new MigLayout("", "[300,grow][300,grow]", "[][][][][]"));
		
		txtFLastName = new JTextField();
		txtFLastName.setOpaque(false);
		txtFLastName.setPreferredSize(new Dimension(250, 35));
		txtFLastName.setForeground(Color.WHITE);
		txtFLastName.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtFLastName.setBorder(new TitledBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)), "Last Name", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		fatherPanel.add(txtFLastName, "cell 0 0,growx");
		
		JPanel resFPanel = new JPanel();
		resFPanel.setOpaque(false);
		resFPanel.setSize(new Dimension(300, 35));
		resFPanel.setBorder(new TitledBorder(new TitledBorder(new EmptyBorder(0, 0, 0, 0), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)), "Residence Address", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		fatherPanel.add(resFPanel, "cell 1 0,grow");
		resFPanel.setLayout(new MigLayout("", "[80px,grow][65px,grow][65px,grow][65px,grow]", "[25px]"));
		
		txtFStreet = new JTextField();
		txtFStreet.setOpaque(false);
		txtFStreet.setColumns(10);
		txtFStreet.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.WHITE));
		resFPanel.add(txtFStreet, "cell 0 0,alignx left,aligny center");
		
		JComboBox<String> cbxFBarangay = new JComboBox<String>();
		cbxFBarangay.setRequestFocusEnabled(false);
		cbxFBarangay.setPreferredSize(new Dimension(70, 25));
		cbxFBarangay.setOpaque(false);
		cbxFBarangay.setForeground(Color.WHITE);
		cbxFBarangay.setFont(new Font("Roboto", Font.PLAIN, 12));
		cbxFBarangay.setFocusable(false);
		cbxFBarangay.setBorder(null);
		cbxFBarangay.setBackground(Color.DARK_GRAY);
		resFPanel.add(cbxFBarangay, "cell 1 0,alignx left,aligny top");
		
		JComboBox<String> cbxFMunCity = new JComboBox<String>();
		cbxFMunCity.setRequestFocusEnabled(false);
		cbxFMunCity.setPreferredSize(new Dimension(70, 25));
		cbxFMunCity.setOpaque(false);
		cbxFMunCity.setForeground(Color.WHITE);
		cbxFMunCity.setFont(new Font("Roboto", Font.PLAIN, 12));
		cbxFMunCity.setFocusable(false);
		cbxFMunCity.setBorder(null);
		cbxFMunCity.setBackground(Color.DARK_GRAY);
		resFPanel.add(cbxFMunCity, "cell 2 0,alignx left,aligny top");
		
		JComboBox<String> cbxFProvince = new JComboBox<String>();
		cbxFProvince.setRequestFocusEnabled(false);
		cbxFProvince.setPreferredSize(new Dimension(70, 25));
		cbxFProvince.setOpaque(false);
		cbxFProvince.setForeground(Color.WHITE);
		cbxFProvince.setFont(new Font("Roboto", Font.PLAIN, 12));
		cbxFProvince.setFocusable(false);
		cbxFProvince.setBorder(null);
		cbxFProvince.setBackground(Color.DARK_GRAY);
		resFPanel.add(cbxFProvince, "cell 3 0,alignx left,aligny top");
		
		txtFMidName = new JTextField();
		txtFMidName.setOpaque(false);
		txtFMidName.setPreferredSize(new Dimension(250, 35));
		txtFMidName.setForeground(Color.WHITE);
		txtFMidName.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtFMidName.setBorder(new TitledBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)), "Middle Name", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		fatherPanel.add(txtFMidName, "cell 0 1,growx");
		
		txtFResNo = new JTextField();
		txtFResNo.setOpaque(false);
		txtFResNo.setPreferredSize(new Dimension(250, 35));
		txtFResNo.setForeground(Color.WHITE);
		txtFResNo.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtFResNo.setBorder(new TitledBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)), "Residence Telephone No.", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		fatherPanel.add(txtFResNo, "cell 1 1,growx");
		
		txtFFirstName = new JTextField();
		txtFFirstName.setOpaque(false);
		txtFFirstName.setPreferredSize(new Dimension(250, 35));
		txtFFirstName.setForeground(Color.WHITE);
		txtFFirstName.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtFFirstName.setBorder(new TitledBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)), "First Name", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		fatherPanel.add(txtFFirstName, "cell 0 2,growx");
		
		JPanel offFPanel = new JPanel();
		offFPanel.setOpaque(false);
		offFPanel.setSize(new Dimension(300, 35));
		offFPanel.setBorder(new TitledBorder(new TitledBorder(new EmptyBorder(0, 0, 0, 0), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)), "Office Address", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		fatherPanel.add(offFPanel, "cell 1 2,grow");
		offFPanel.setLayout(new MigLayout("", "[80px,grow][65px,grow][65px,grow][65px,grow]", "[25px]"));
		
		txtFOStreet = new JTextField();
		txtFOStreet.setBounds(new Rectangle(0, 5, 0, 0));
		txtFOStreet.setOpaque(false);
		txtFOStreet.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.WHITE));
		offFPanel.add(txtFOStreet, "cell 0 0,alignx left,aligny center");
		txtFOStreet.setColumns(10);
		
		JComboBox<String> cbxFOBarangay = new JComboBox<String>();
		cbxFOBarangay.setRequestFocusEnabled(false);
		cbxFOBarangay.setPreferredSize(new Dimension(70, 25));
		cbxFOBarangay.setOpaque(false);
		cbxFOBarangay.setForeground(Color.WHITE);
		cbxFOBarangay.setFont(new Font("Roboto", Font.PLAIN, 12));
		cbxFOBarangay.setFocusable(false);
		cbxFOBarangay.setBorder(null);
		cbxFOBarangay.setBackground(Color.DARK_GRAY);
		offFPanel.add(cbxFOBarangay, "cell 1 0,alignx left,aligny top");
		
		JComboBox<String> cbxFOMunCity = new JComboBox<String>();
		cbxFOMunCity.setRequestFocusEnabled(false);
		cbxFOMunCity.setPreferredSize(new Dimension(70, 25));
		cbxFOMunCity.setOpaque(false);
		cbxFOMunCity.setForeground(Color.WHITE);
		cbxFOMunCity.setFont(new Font("Roboto", Font.PLAIN, 12));
		cbxFOMunCity.setFocusable(false);
		cbxFOMunCity.setBorder(null);
		cbxFOMunCity.setBackground(Color.DARK_GRAY);
		offFPanel.add(cbxFOMunCity, "cell 2 0,alignx left,aligny top");
		
		JComboBox<String> cbxFOProvince = new JComboBox<String>();
		cbxFOProvince.setRequestFocusEnabled(false);
		cbxFOProvince.setPreferredSize(new Dimension(70, 25));
		cbxFOProvince.setOpaque(false);
		cbxFOProvince.setForeground(Color.WHITE);
		cbxFOProvince.setFont(new Font("Roboto", Font.PLAIN, 12));
		cbxFOProvince.setFocusable(false);
		cbxFOProvince.setBorder(null);
		cbxFOProvince.setBackground(Color.DARK_GRAY);
		offFPanel.add(cbxFOProvince, "cell 3 0,alignx left,aligny top");
		
		txtFMobNo = new JTextField();
		txtFMobNo.setOpaque(false);
		txtFMobNo.setPreferredSize(new Dimension(250, 35));
		txtFMobNo.setForeground(Color.WHITE);
		txtFMobNo.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtFMobNo.setBorder(new TitledBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)), "Mobile Number", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		fatherPanel.add(txtFMobNo, "cell 0 3,growx");
		
		txtFOffNo = new JTextField();
		txtFOffNo.setOpaque(false);
		txtFOffNo.setPreferredSize(new Dimension(250, 35));
		txtFOffNo.setForeground(Color.WHITE);
		txtFOffNo.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtFOffNo.setBorder(new TitledBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)), "Office Telephone No.", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		fatherPanel.add(txtFOffNo, "cell 1 3,growx");
		
		txtFEmail = new JTextField();
		txtFEmail.setOpaque(false);
		txtFEmail.setPreferredSize(new Dimension(250, 35));
		txtFEmail.setForeground(Color.WHITE);
		txtFEmail.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtFEmail.setBorder(new TitledBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)), "Email Address", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		fatherPanel.add(txtFEmail, "cell 0 4,growx");
		
		txtFOcc = new JTextField();
		txtFOcc.setOpaque(false);
		txtFOcc.setPreferredSize(new Dimension(250, 35));
		txtFOcc.setForeground(Color.WHITE);
		txtFOcc.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtFOcc.setBorder(new TitledBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)), "Occupation.", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		fatherPanel.add(txtFOcc, "cell 1 4,growx");
		
		JPanel motherPanel = new JPanel();
		motherPanel.setOpaque(false);
		motherPanel.setBackground(Color.DARK_GRAY);
		motherPanel.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255)), "Mother's Information", TitledBorder.LEADING, TitledBorder.TOP, new Font("Roboto",Font.PLAIN,12), new Color(255, 255, 255)));
		motherPanel.setBounds(10, 297, 660, 270);
		parInfoPanel.add(motherPanel);
		motherPanel.setLayout(new MigLayout("", "[316px][316px,grow]", "[53px][36px][53px][36px][36px]"));
		
		txtMLastName = new JTextField();
		txtMLastName.setPreferredSize(new Dimension(250, 35));
		txtMLastName.setOpaque(false);
		txtMLastName.setForeground(Color.WHITE);
		txtMLastName.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtMLastName.setBorder(new TitledBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)), "Maiden Name", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		motherPanel.add(txtMLastName, "cell 0 0,growx,aligny center");
		
		JPanel resMPanel = new JPanel();
		resMPanel.setSize(new Dimension(300, 35));
		resMPanel.setOpaque(false);
		resMPanel.setBorder(new TitledBorder(new TitledBorder(new EmptyBorder(0, 0, 0, 0), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)), "Residence Address", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		motherPanel.add(resMPanel, "cell 1 0,grow");
		resMPanel.setLayout(new MigLayout("", "[80px,grow][70px,grow][70px,grow][70px,grow]", "[25px]"));
		
		txtMStreet = new JTextField();
		txtMStreet.setOpaque(false);
		txtMStreet.setColumns(10);
		txtMStreet.setBounds(new Rectangle(0, 5, 0, 0));
		txtMStreet.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.WHITE));
		resMPanel.add(txtMStreet, "cell 0 0,alignx left,aligny center");
		
		JComboBox<String> cbxMBarangay = new JComboBox<String>();
		cbxMBarangay.setRequestFocusEnabled(false);
		cbxMBarangay.setPreferredSize(new Dimension(70, 25));
		cbxMBarangay.setOpaque(false);
		cbxMBarangay.setForeground(Color.WHITE);
		cbxMBarangay.setFont(new Font("Roboto", Font.PLAIN, 12));
		cbxMBarangay.setFocusable(false);
		cbxMBarangay.setBorder(null);
		cbxMBarangay.setBackground(Color.DARK_GRAY);
		resMPanel.add(cbxMBarangay, "cell 1 0,alignx left,aligny top,grow");
		
		JComboBox<String> cbxMMunCity = new JComboBox<String>();
		cbxMMunCity.setRequestFocusEnabled(false);
		cbxMMunCity.setPreferredSize(new Dimension(70, 25));
		cbxMMunCity.setOpaque(false);
		cbxMMunCity.setForeground(Color.WHITE);
		cbxMMunCity.setFont(new Font("Roboto", Font.PLAIN, 12));
		cbxMMunCity.setFocusable(false);
		cbxMMunCity.setBorder(null);
		cbxMMunCity.setBackground(Color.DARK_GRAY);
		resMPanel.add(cbxMMunCity, "cell 2 0,alignx left,aligny top");
		
		JComboBox<String> cbxMProvince = new JComboBox<String>();
		cbxMProvince.setRequestFocusEnabled(false);
		cbxMProvince.setPreferredSize(new Dimension(70, 25));
		cbxMProvince.setOpaque(false);
		cbxMProvince.setForeground(Color.WHITE);
		cbxMProvince.setFont(new Font("Roboto", Font.PLAIN, 12));
		cbxMProvince.setFocusable(false);
		cbxMProvince.setBorder(null);
		cbxMProvince.setBackground(Color.DARK_GRAY);
		resMPanel.add(cbxMProvince, "cell 3 0,alignx left,aligny top");
		
		txtMMiddleName = new JTextField();
		txtMMiddleName.setPreferredSize(new Dimension(250, 35));
		txtMMiddleName.setOpaque(false);
		txtMMiddleName.setForeground(Color.WHITE);
		txtMMiddleName.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtMMiddleName.setBorder(new TitledBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)), "Middle Name", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		motherPanel.add(txtMMiddleName, "cell 0 1,grow");
		
		txtMResNo = new JTextField();
		txtMResNo.setPreferredSize(new Dimension(250, 35));
		txtMResNo.setOpaque(false);
		txtMResNo.setForeground(Color.WHITE);
		txtMResNo.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtMResNo.setBorder(new TitledBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)), "Residence Telephone No.", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		motherPanel.add(txtMResNo, "cell 1 1,grow");
		
		txtMFirstName = new JTextField();
		txtMFirstName.setPreferredSize(new Dimension(250, 35));
		txtMFirstName.setOpaque(false);
		txtMFirstName.setForeground(Color.WHITE);
		txtMFirstName.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtMFirstName.setBorder(new TitledBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)), "First Name", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		motherPanel.add(txtMFirstName, "cell 0 2,growx,aligny center");
		
		JPanel offMPanel = new JPanel();
		offMPanel.setSize(new Dimension(300, 35));
		offMPanel.setOpaque(false);
		offMPanel.setBorder(new TitledBorder(new TitledBorder(new EmptyBorder(0, 0, 0, 0), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)), "Office Address", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		motherPanel.add(offMPanel, "cell 1 2,grow");
		offMPanel.setLayout(new MigLayout("", "[80px,grow][70px][70px][70px,grow]", "[25px]"));
		
		txtMOStreet = new JTextField();
		txtMOStreet.setOpaque(false);
		txtMOStreet.setColumns(10);
		txtMOStreet.setBounds(new Rectangle(0, 5, 0, 0));
		txtMOStreet.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.WHITE));
		offMPanel.add(txtMOStreet, "cell 0 0,alignx left,aligny center");
		
		JComboBox<String> cbxMOBarangay = new JComboBox<String>();
		cbxMOBarangay.setRequestFocusEnabled(false);
		cbxMOBarangay.setPreferredSize(new Dimension(70, 25));
		cbxMOBarangay.setOpaque(false);
		cbxMOBarangay.setForeground(Color.WHITE);
		cbxMOBarangay.setFont(new Font("Roboto", Font.PLAIN, 12));
		cbxMOBarangay.setFocusable(false);
		cbxMOBarangay.setBorder(null);
		cbxMOBarangay.setBackground(Color.DARK_GRAY);
		offMPanel.add(cbxMOBarangay, "cell 1 0,alignx left,aligny top");
		
		JComboBox<String> cbxMOMunCity = new JComboBox<String>();
		cbxMOMunCity.setRequestFocusEnabled(false);
		cbxMOMunCity.setPreferredSize(new Dimension(70, 25));
		cbxMOMunCity.setOpaque(false);
		cbxMOMunCity.setForeground(Color.WHITE);
		cbxMOMunCity.setFont(new Font("Roboto", Font.PLAIN, 12));
		cbxMOMunCity.setFocusable(false);
		cbxMOMunCity.setBorder(null);
		cbxMOMunCity.setBackground(Color.DARK_GRAY);
		offMPanel.add(cbxMOMunCity, "cell 2 0,alignx left,aligny top");
		
		JComboBox<String> cbxMOProvince = new JComboBox<String>();
		cbxMOProvince.setRequestFocusEnabled(false);
		cbxMOProvince.setPreferredSize(new Dimension(70, 25));
		cbxMOProvince.setOpaque(false);
		cbxMOProvince.setForeground(Color.WHITE);
		cbxMOProvince.setFont(new Font("Roboto", Font.PLAIN, 12));
		cbxMOProvince.setFocusable(false);
		cbxMOProvince.setBorder(null);
		cbxMOProvince.setBackground(Color.DARK_GRAY);
		offMPanel.add(cbxMOProvince, "cell 3 0,alignx left,aligny top");
		
		txtMMobNo = new JTextField();
		txtMMobNo.setPreferredSize(new Dimension(250, 35));
		txtMMobNo.setOpaque(false);
		txtMMobNo.setForeground(Color.WHITE);
		txtMMobNo.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtMMobNo.setBorder(new TitledBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)), "Mobile Number", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		motherPanel.add(txtMMobNo, "cell 0 3,grow");
		
		txtMOffNo = new JTextField();
		txtMOffNo.setPreferredSize(new Dimension(250, 35));
		txtMOffNo.setOpaque(false);
		txtMOffNo.setForeground(Color.WHITE);
		txtMOffNo.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtMOffNo.setBorder(new TitledBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)), "Office Telephone No.", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		motherPanel.add(txtMOffNo, "cell 1 3,grow");
		
		txtMEmail = new JTextField();
		txtMEmail.setPreferredSize(new Dimension(250, 35));
		txtMEmail.setOpaque(false);
		txtMEmail.setForeground(Color.WHITE);
		txtMEmail.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtMEmail.setBorder(new TitledBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)), "Email Address", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		motherPanel.add(txtMEmail, "cell 0 4,grow");
		
		txtMOcc = new JTextField();
		txtMOcc.setPreferredSize(new Dimension(250, 35));
		txtMOcc.setOpaque(false);
		txtMOcc.setForeground(Color.WHITE);
		txtMOcc.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtMOcc.setBorder(new TitledBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)), "Occupation.", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		motherPanel.add(txtMOcc, "cell 1 4,grow");
		
		otherPanel = new JPanel();
		otherPanel.setOpaque(false);
		otherPanel.setBorder(new CompoundBorder(null, new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 255, 255))));
		otherPanel.setBackground(Color.DARK_GRAY);
		otherPanel.setBounds(10, 571, 660, 105);
		parInfoPanel.add(otherPanel);
		otherPanel.setLayout(null);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Does your father/mother work here at Misericordia Dei Catholic School(MDCS)?");
		chckbxNewCheckBox.setForeground(Color.WHITE);
		chckbxNewCheckBox.setFont(new Font("Roboto", Font.ROMAN_BASELINE, 12));
		chckbxNewCheckBox.setBorder(null);
		chckbxNewCheckBox.setOpaque(false);
		chckbxNewCheckBox.setBounds(10, 11, 459, 23);
		otherPanel.add(chckbxNewCheckBox);
		
		JLabel lblNewLabel = new JLabel("<html>If your mother or father is an employee of Misericordia Dei Catholic School(MDCS)  or Apostolic Vicariate of Calapan <br>"
				+ " Parochial School(AVCPS) or Vicar Apostolic of Calapan, Inc(VACI), what office she is connected with?</html>");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Roboto", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 45, 640, 36);
		otherPanel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setOpaque(false);
		textField.setColumns(10);
		textField.setBounds(new Rectangle(0, 5, 0, 0));
		textField.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.WHITE));
		textField.setBounds(10, 80, 546, 15);
		otherPanel.add(textField);

	}
}
