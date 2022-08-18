package View.StudentForm.Component;

import javax.swing.*;
import java.awt.*;
import net.miginfocom.swing.MigLayout;
import javax.swing.border.*;

import Model.GUICodingFormat;


public class ParInfoPanel extends JPanel implements GUICodingFormat {
	
	
	private static final long serialVersionUID = 1L;
	
	private JTextField txtFLastName,txtFFirstName,txtFMidName;
	private JTextField txtFStreet,txtFOStreet;
	private JTextField txtFResNo,txtFOffNo;
	private JTextField txtFMobNo, txtFEmail;
	private JTextField txtFOcc;
	
	private JTextField txtMLastName,txtMFirstName,txtMMidName;
	private JTextField txtMStreet, txtMOStreet;
	private JTextField txtMResNo,txtMOffNo;
	private JTextField txtMMobNo,txtMEmail;
	private JTextField txtMOcc;

	private JPanel parInfoPanel,otherPanel;
	private JPanel fatherPanel,motherPanel;
	private JPanel resFPanel,offFPanel;
	private JPanel resMPanel,offMPanel;
	
	private JComboBox<String> cbxFBarangay,cbxFMunCity,cbxFProvince;
	private JComboBox<String> cbxFOBarangay,cbxFOMunCity,cbxFOProvince;
	private JComboBox<String> cbxMBarangay,cbxMMunCity,cbxMProvince;
	private JComboBox<String> cbxMOBarangay,cbxMOMunCity,cbxMOProvince;
	private JCheckBox chkEConfirm;
	private JLabel lblOffice;
	private JTextField txtOffice;
	
	
	
	public ParInfoPanel() {
		init();
		getComponent();

	}

	/**************************************************	INIT METHOD ****************************************/
	@Override
	public void init() {
		setBackground(Color.DARK_GRAY);
		setLayout(null);
		
	}

	/**************************************************	GETCOMPONENT METHOD ****************************************/
	@Override
	public void getComponent() {
		/**************************************************	PARENTINFO PANEL ****************************************/
		parInfoPanel = new JPanel();
		parInfoPanel.setPreferredSize(new Dimension(680, 685));
		parInfoPanel.setOpaque(false);
		parInfoPanel.setBorder(new LineBorder(new Color(128, 0, 0)));
		parInfoPanel.setBounds(10, 11, 680, 693);
		add(parInfoPanel);
		parInfoPanel.setLayout(null);
		
		/**************************************************	FATHER PANEL ****************************************/
		fatherPanel = new JPanel();
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
		
		txtFFirstName = new JTextField();
		txtFFirstName.setOpaque(false);
		txtFFirstName.setPreferredSize(new Dimension(250, 35));
		txtFFirstName.setForeground(Color.WHITE);
		txtFFirstName.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtFFirstName.setBorder(new TitledBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)), "First Name", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		fatherPanel.add(txtFFirstName, "cell 0 2,growx");
		
		txtFMidName = new JTextField();
		txtFMidName.setOpaque(false);
		txtFMidName.setPreferredSize(new Dimension(250, 35));
		txtFMidName.setForeground(Color.WHITE);
		txtFMidName.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtFMidName.setBorder(new TitledBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)), "Middle Name", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		fatherPanel.add(txtFMidName, "cell 0 1,growx");
		
		txtFMobNo = new JTextField();
		txtFMobNo.setOpaque(false);
		txtFMobNo.setPreferredSize(new Dimension(250, 35));
		txtFMobNo.setForeground(Color.WHITE);
		txtFMobNo.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtFMobNo.setBorder(new TitledBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)), "Mobile Number", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		fatherPanel.add(txtFMobNo, "cell 0 3,growx");
		
		txtFEmail = new JTextField();
		txtFEmail.setOpaque(false);
		txtFEmail.setPreferredSize(new Dimension(250, 35));
		txtFEmail.setForeground(Color.WHITE);
		txtFEmail.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtFEmail.setBorder(new TitledBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)), "Email Address", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		fatherPanel.add(txtFEmail, "cell 0 4,growx");
		
		
		/**************************************************	RESIDENCEF PANEL ****************************************/
		resFPanel = new JPanel();
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
		
		cbxFBarangay = new JComboBox<String>();
		cbxFBarangay.setRequestFocusEnabled(false);
		cbxFBarangay.setPreferredSize(new Dimension(70, 25));
		cbxFBarangay.setOpaque(false);
		cbxFBarangay.setForeground(Color.WHITE);
		cbxFBarangay.setFont(new Font("Roboto", Font.PLAIN, 12));
		cbxFBarangay.setFocusable(false);
		cbxFBarangay.setBorder(null);
		cbxFBarangay.setBackground(Color.DARK_GRAY);
		resFPanel.add(cbxFBarangay, "cell 1 0,alignx left,aligny top");
		
		cbxFMunCity = new JComboBox<String>();
		cbxFMunCity.setRequestFocusEnabled(false);
		cbxFMunCity.setPreferredSize(new Dimension(70, 25));
		cbxFMunCity.setOpaque(false);
		cbxFMunCity.setForeground(Color.WHITE);
		cbxFMunCity.setFont(new Font("Roboto", Font.PLAIN, 12));
		cbxFMunCity.setFocusable(false);
		cbxFMunCity.setBorder(null);
		cbxFMunCity.setBackground(Color.DARK_GRAY);
		resFPanel.add(cbxFMunCity, "cell 2 0,alignx left,aligny top");
		
		cbxFProvince = new JComboBox<String>();
		cbxFProvince.setRequestFocusEnabled(false);
		cbxFProvince.setPreferredSize(new Dimension(70, 25));
		cbxFProvince.setOpaque(false);
		cbxFProvince.setForeground(Color.WHITE);
		cbxFProvince.setFont(new Font("Roboto", Font.PLAIN, 12));
		cbxFProvince.setFocusable(false);
		cbxFProvince.setBorder(null);
		cbxFProvince.setBackground(Color.DARK_GRAY);
		resFPanel.add(cbxFProvince, "cell 3 0,alignx left,aligny top");
		
		
		/******************************************************************************************/
		
		txtFResNo = new JTextField();
		txtFResNo.setOpaque(false);
		txtFResNo.setPreferredSize(new Dimension(250, 35));
		txtFResNo.setForeground(Color.WHITE);
		txtFResNo.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtFResNo.setBorder(new TitledBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)), "Residence Telephone No.", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		fatherPanel.add(txtFResNo, "cell 1 1,growx");
		
		
		
		
		/**************************************************	OFFICEF PANEL ****************************************/
		offFPanel = new JPanel();
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
		
		cbxFOBarangay = new JComboBox<String>();
		cbxFOBarangay.setRequestFocusEnabled(false);
		cbxFOBarangay.setPreferredSize(new Dimension(70, 25));
		cbxFOBarangay.setOpaque(false);
		cbxFOBarangay.setForeground(Color.WHITE);
		cbxFOBarangay.setFont(new Font("Roboto", Font.PLAIN, 12));
		cbxFOBarangay.setFocusable(false);
		cbxFOBarangay.setBorder(null);
		cbxFOBarangay.setBackground(Color.DARK_GRAY);
		offFPanel.add(cbxFOBarangay, "cell 1 0,alignx left,aligny top");
		
		cbxFOMunCity = new JComboBox<String>();
		cbxFOMunCity.setRequestFocusEnabled(false);
		cbxFOMunCity.setPreferredSize(new Dimension(70, 25));
		cbxFOMunCity.setOpaque(false);
		cbxFOMunCity.setForeground(Color.WHITE);
		cbxFOMunCity.setFont(new Font("Roboto", Font.PLAIN, 12));
		cbxFOMunCity.setFocusable(false);
		cbxFOMunCity.setBorder(null);
		cbxFOMunCity.setBackground(Color.DARK_GRAY);
		offFPanel.add(cbxFOMunCity, "cell 2 0,alignx left,aligny top");
		
		cbxFOProvince = new JComboBox<String>();
		cbxFOProvince.setRequestFocusEnabled(false);
		cbxFOProvince.setPreferredSize(new Dimension(70, 25));
		cbxFOProvince.setOpaque(false);
		cbxFOProvince.setForeground(Color.WHITE);
		cbxFOProvince.setFont(new Font("Roboto", Font.PLAIN, 12));
		cbxFOProvince.setFocusable(false);
		cbxFOProvince.setBorder(null);
		cbxFOProvince.setBackground(Color.DARK_GRAY);
		offFPanel.add(cbxFOProvince, "cell 3 0,alignx left,aligny top");
		
		
		
		txtFOffNo = new JTextField();
		txtFOffNo.setOpaque(false);
		txtFOffNo.setPreferredSize(new Dimension(250, 35));
		txtFOffNo.setForeground(Color.WHITE);
		txtFOffNo.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtFOffNo.setBorder(new TitledBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)), "Office Telephone No.", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		fatherPanel.add(txtFOffNo, "cell 1 3,growx");
		
		
		
		/******************************************************************************************/
		
		
		
		txtFOcc = new JTextField();
		txtFOcc.setOpaque(false);
		txtFOcc.setPreferredSize(new Dimension(250, 35));
		txtFOcc.setForeground(Color.WHITE);
		txtFOcc.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtFOcc.setBorder(new TitledBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)), "Occupation.", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		fatherPanel.add(txtFOcc, "cell 1 4,growx");
		
		
		/**************************************************	MOTHER PANEL ****************************************/
		motherPanel = new JPanel();
		motherPanel.setOpaque(false);
		motherPanel.setBackground(Color.DARK_GRAY);
		motherPanel.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255)), "Mother's Information", TitledBorder.LEADING, TitledBorder.TOP, new Font("Roboto",Font.PLAIN,12), new Color(255, 255, 255)));
		motherPanel.setBounds(10, 297, 660, 270);
		parInfoPanel.add(motherPanel);
		motherPanel.setLayout(new MigLayout("", "[][grow]", "[][][][][]"));
		
		txtMLastName = new JTextField();
		txtMLastName.setPreferredSize(new Dimension(250, 35));
		txtMLastName.setOpaque(false);
		txtMLastName.setForeground(Color.WHITE);
		txtMLastName.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtMLastName.setBorder(new TitledBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)), "Maiden Name", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		motherPanel.add(txtMLastName, "cell 0 0,growx,aligny center");
		
		txtMFirstName = new JTextField();
		txtMFirstName.setPreferredSize(new Dimension(250, 35));
		txtMFirstName.setOpaque(false);
		txtMFirstName.setForeground(Color.WHITE);
		txtMFirstName.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtMFirstName.setBorder(new TitledBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)), "First Name", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		motherPanel.add(txtMFirstName, "cell 0 2,growx,aligny center");
		
		txtMMidName = new JTextField();
		txtMMidName.setPreferredSize(new Dimension(250, 35));
		txtMMidName.setOpaque(false);
		txtMMidName.setForeground(Color.WHITE);
		txtMMidName.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtMMidName.setBorder(new TitledBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)), "Middle Name", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		motherPanel.add(txtMMidName, "cell 0 1,grow");
		
		txtMMobNo = new JTextField();
		txtMMobNo.setPreferredSize(new Dimension(250, 35));
		txtMMobNo.setOpaque(false);
		txtMMobNo.setForeground(Color.WHITE);
		txtMMobNo.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtMMobNo.setBorder(new TitledBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)), "Mobile Number", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		motherPanel.add(txtMMobNo, "cell 0 3,grow");
		
		txtMEmail = new JTextField();
		txtMEmail.setPreferredSize(new Dimension(250, 35));
		txtMEmail.setOpaque(false);
		txtMEmail.setForeground(Color.WHITE);
		txtMEmail.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtMEmail.setBorder(new TitledBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)), "Email Address", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		motherPanel.add(txtMEmail, "cell 0 4,grow");
		
		
		
		/**************************************************	RESIDENCEM PANEL ****************************************/
		resMPanel = new JPanel();
		resMPanel.setSize(new Dimension(300, 35));
		resMPanel.setOpaque(false);
		resMPanel.setBorder(new TitledBorder(new TitledBorder(new EmptyBorder(0, 0, 0, 0), "", TitledBorder.LEADING, 
				TitledBorder.TOP, null, new Color(0, 0, 0)), "Residence Address", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		motherPanel.add(resMPanel, "cell 1 0,grow");
		resMPanel.setLayout(new MigLayout("", "[grow][grow][grow][grow]", "[]"));
		
		txtMStreet = new JTextField();
		txtMStreet.setOpaque(false);
		txtMStreet.setColumns(10);
		txtMStreet.setBounds(new Rectangle(0, 5, 0, 0));
		txtMStreet.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.WHITE));
		resMPanel.add(txtMStreet, "cell 0 0,alignx left,aligny center");
		
		cbxMBarangay = new JComboBox<String>();
		cbxMBarangay.setRequestFocusEnabled(false);
		cbxMBarangay.setPreferredSize(new Dimension(70, 25));
		cbxMBarangay.setOpaque(false);
		cbxMBarangay.setForeground(Color.WHITE);
		cbxMBarangay.setFont(new Font("Roboto", Font.PLAIN, 12));
		cbxMBarangay.setFocusable(false);
		cbxMBarangay.setBorder(null);
		cbxMBarangay.setBackground(Color.DARK_GRAY);
		resMPanel.add(cbxMBarangay, "cell 1 0,alignx left,aligny top,grow");
		
		cbxMMunCity = new JComboBox<String>();
		cbxMMunCity.setRequestFocusEnabled(false);
		cbxMMunCity.setPreferredSize(new Dimension(70, 25));
		cbxMMunCity.setOpaque(false);
		cbxMMunCity.setForeground(Color.WHITE);
		cbxMMunCity.setFont(new Font("Roboto", Font.PLAIN, 12));
		cbxMMunCity.setFocusable(false);
		cbxMMunCity.setBorder(null);
		cbxMMunCity.setBackground(Color.DARK_GRAY);
		resMPanel.add(cbxMMunCity, "cell 2 0,alignx left,aligny top");
		
		cbxMProvince = new JComboBox<String>();
		cbxMProvince.setRequestFocusEnabled(false);
		cbxMProvince.setPreferredSize(new Dimension(70, 25));
		cbxMProvince.setOpaque(false);
		cbxMProvince.setForeground(Color.WHITE);
		cbxMProvince.setFont(new Font("Roboto", Font.PLAIN, 12));
		cbxMProvince.setFocusable(false);
		cbxMProvince.setBorder(null);
		cbxMProvince.setBackground(Color.DARK_GRAY);
		resMPanel.add(cbxMProvince, "cell 3 0,alignx left,aligny top");
		
		
		txtMResNo = new JTextField();
		txtMResNo.setPreferredSize(new Dimension(250, 35));
		txtMResNo.setOpaque(false);
		txtMResNo.setForeground(Color.WHITE);
		txtMResNo.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtMResNo.setBorder(new TitledBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)), "Residence Telephone No.", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		motherPanel.add(txtMResNo, "cell 1 1,grow");
		
		/**************************************************	OFFICEM PANEL ****************************************/
		offMPanel = new JPanel();
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
		
		cbxMOBarangay = new JComboBox<String>();
		cbxMOBarangay.setRequestFocusEnabled(false);
		cbxMOBarangay.setPreferredSize(new Dimension(70, 25));
		cbxMOBarangay.setOpaque(false);
		cbxMOBarangay.setForeground(Color.WHITE);
		cbxMOBarangay.setFont(new Font("Roboto", Font.PLAIN, 12));
		cbxMOBarangay.setFocusable(false);
		cbxMOBarangay.setBorder(null);
		cbxMOBarangay.setBackground(Color.DARK_GRAY);
		offMPanel.add(cbxMOBarangay, "cell 1 0,alignx left,aligny top");
		
		cbxMOMunCity = new JComboBox<String>();
		cbxMOMunCity.setRequestFocusEnabled(false);
		cbxMOMunCity.setPreferredSize(new Dimension(70, 25));
		cbxMOMunCity.setOpaque(false);
		cbxMOMunCity.setForeground(Color.WHITE);
		cbxMOMunCity.setFont(new Font("Roboto", Font.PLAIN, 12));
		cbxMOMunCity.setFocusable(false);
		cbxMOMunCity.setBorder(null);
		cbxMOMunCity.setBackground(Color.DARK_GRAY);
		offMPanel.add(cbxMOMunCity, "cell 2 0,alignx left,aligny top");
		
		cbxMOProvince = new JComboBox<String>();
		cbxMOProvince.setRequestFocusEnabled(false);
		cbxMOProvince.setPreferredSize(new Dimension(70, 25));
		cbxMOProvince.setOpaque(false);
		cbxMOProvince.setForeground(Color.WHITE);
		cbxMOProvince.setFont(new Font("Roboto", Font.PLAIN, 12));
		cbxMOProvince.setFocusable(false);
		cbxMOProvince.setBorder(null);
		cbxMOProvince.setBackground(Color.DARK_GRAY);
		offMPanel.add(cbxMOProvince, "cell 3 0,alignx left,aligny top");
		
		/******************************************************************************************/
		
		txtMOffNo = new JTextField();
		txtMOffNo.setPreferredSize(new Dimension(250, 35));
		txtMOffNo.setOpaque(false);
		txtMOffNo.setForeground(Color.WHITE);
		txtMOffNo.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtMOffNo.setBorder(new TitledBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)), "Office Telephone No.", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		motherPanel.add(txtMOffNo, "cell 1 3,grow");
		
		
		
		txtMOcc = new JTextField();
		txtMOcc.setPreferredSize(new Dimension(250, 35));
		txtMOcc.setOpaque(false);
		txtMOcc.setForeground(Color.WHITE);
		txtMOcc.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtMOcc.setBorder(new TitledBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)), "Occupation.", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		motherPanel.add(txtMOcc, "cell 1 4,grow");
		
		/**************************************************	OTHER PANEL ****************************************/
		otherPanel = new JPanel();
		otherPanel.setOpaque(false);
		otherPanel.setBorder(new CompoundBorder(null, new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 255, 255))));
		otherPanel.setBackground(Color.DARK_GRAY);
		otherPanel.setBounds(10, 571, 660, 105);
		parInfoPanel.add(otherPanel);
		otherPanel.setLayout(null);
		
		chkEConfirm = new JCheckBox("Does your father/mother work here at Misericordia Dei Catholic School(MDCS)?");
		chkEConfirm.setForeground(Color.WHITE);
		chkEConfirm.setFont(new Font("Roboto", Font.ROMAN_BASELINE, 12));
		chkEConfirm.setBorder(null);
		chkEConfirm.setOpaque(false);
		chkEConfirm.setBounds(10, 11, 459, 23);
		otherPanel.add(chkEConfirm);
		
		lblOffice = new JLabel("<html>If your mother or father is an employee of Misericordia Dei Catholic School(MDCS)  or Apostolic Vicariate of Calapan <br>"
				+ " Parochial School(AVCPS) or Vicar Apostolic of Calapan, Inc(VACI), what office she is connected with?</html>");
		lblOffice.setVerticalAlignment(SwingConstants.TOP);
		lblOffice.setForeground(Color.WHITE);
		lblOffice.setFont(new Font("Roboto", Font.PLAIN, 12));
		lblOffice.setBounds(10, 45, 640, 36);
		otherPanel.add(lblOffice);
		
		txtOffice = new JTextField();
		txtOffice.setOpaque(false);
		txtOffice.setColumns(10);
		txtOffice.setBounds(new Rectangle(0, 5, 0, 0));
		txtOffice.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.WHITE));
		txtOffice.setBounds(10, 80, 546, 15);
		otherPanel.add(txtOffice);
		
	}
	
	
	public JTextField getTxtFLastName() {
		return txtFLastName;
	}

	public JTextField getTxtFFirstName() {
		return txtFFirstName;
	}

	public JTextField getTxtFMidName() {
		return txtFMidName;
	}

	public JTextField getTxtFStreet() {
		return txtFStreet;
	}

	public JTextField getTxtFOStreet() {
		return txtFOStreet;
	}

	public JTextField getTxtFResNo() {
		return txtFResNo;
	}

	public JTextField getTxtFOffNo() {
		return txtFOffNo;
	}

	public JTextField getTxtFMobNo() {
		return txtFMobNo;
	}

	public JTextField getTxtFEmail() {
		return txtFEmail;
	}

	public JTextField getTxtFOcc() {
		return txtFOcc;
	}

	public JTextField getTxtMLastName() {
		return txtMLastName;
	}

	public JTextField getTxtMFirstName() {
		return txtMFirstName;
	}

	public JTextField getTxtMMidName() {
		return txtMMidName;
	}

	public JTextField getTxtMStreet() {
		return txtMStreet;
	}

	public JTextField getTxtMOStreet() {
		return txtMOStreet;
	}

	public JTextField getTxtMResNo() {
		return txtMResNo;
	}

	public JTextField getTxtMOffNo() {
		return txtMOffNo;
	}

	public JTextField getTxtMMobNo() {
		return txtMMobNo;
	}

	public JTextField getTxtMEmail() {
		return txtMEmail;
	}

	public JTextField getTxtMOcc() {
		return txtMOcc;
	}

	public JComboBox<String> getCbxFBarangay() {
		return cbxFBarangay;
	}

	public JComboBox<String> getCbxFMunCity() {
		return cbxFMunCity;
	}

	public JComboBox<String> getCbxFProvince() {
		return cbxFProvince;
	}

	public JComboBox<String> getCbxFOBarangay() {
		return cbxFOBarangay;
	}

	public JComboBox<String> getCbxFOMunCity() {
		return cbxFOMunCity;
	}

	public JComboBox<String> getCbxFOProvince() {
		return cbxFOProvince;
	}

	public JComboBox<String> getCbxMBarangay() {
		return cbxMBarangay;
	}

	public JComboBox<String> getCbxMMunCity() {
		return cbxMMunCity;
	}

	public JComboBox<String> getCbxMProvince() {
		return cbxMProvince;
	}

	public JComboBox<String> getCbxMOBarangay() {
		return cbxMOBarangay;
	}

	public JComboBox<String> getCbxMOMunCity() {
		return cbxMOMunCity;
	}

	public JComboBox<String> getCbxMOProvince() {
		return cbxMOProvince;
	}

	public JCheckBox getChkEConfirm() {
		return chkEConfirm;
	}

	public JLabel getLblOffice() {
		return lblOffice;
	}

	public JTextField getTxtOffice() {
		return txtOffice;
	}
	
}
