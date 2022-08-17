package View.StudentForm.Component;

import javax.swing.*;
import java.awt.*;
import net.miginfocom.swing.MigLayout;
import javax.swing.border.*;
import Model.GUICodingFormat;
import OtherGUIFunctionalities.SortedComboBoxModel;
import View.DateChooser.DateChooser;



public class StudInfoPanel extends JPanel implements GUICodingFormat {
	
	private static final long serialVersionUID = 1L;
	private JPanel studInfoPanel,mainPanel,picPanel,docPanel,studOPanel;
	private JPanel genderPanel;
	private JPanel pobPanel,addPanel;
	private JTextField txtLastName, txtFirstName,txtMidName,txtNicName;
	private JTextField txtBday, txtAge;
	private DateChooser dtChooser;
	private JRadioButton rdbMale,rdbFemale;
	private ButtonGroup btnGrpGender;
	private JComboBox<String> cbxBarangay,cbxMunCity,cbxProvince;
	private SortedComboBoxModel<String> cbxMBarangay,cbxMMunCity,cbxMProvince;
	private JComboBox<String> cbxAddBarangay,cbxAddMunCity,cbxAddProvince;
	private JTextField txtNationality;
	private JTextField txtReligion;
	private JTextField txtPostal;
	private JTextField txtMobileNo;
	private JLabel lblNewLabel;
	private JButton btnUpload;
	private JComboBox<String> cbxGrade,cbxLevel,cbxSyear;
	private JPanel honorPanel;
	private JCheckBox chkHonor;
	private JLabel lblYhonor;
	private ButtonGroup btnGrpHonor;
	private JRadioButton rdbFirst,rdbSecond;
	public StudInfoPanel() {
		
		init();
		getComponent();
		
		
		
	}
	
	/**************************************************	INIT METHOD ****************************************/
	@Override
	public void init() {
		setOpaque(false);
		setBackground(Color.DARK_GRAY);
		
		
		
		
		
		
	}
	
	

	@Override
	public void getComponent() {
		/**************************************************	MAIN PANEL ****************************************/
		setLayout(null);
		
		mainPanel = new JPanel();
		mainPanel.setBounds(0, -5, 820, 426);
		mainPanel.setOpaque(false);
		mainPanel.setBackground(Color.DARK_GRAY);
		mainPanel.setLayout(null);
		mainPanel.setPreferredSize(new Dimension(820, 410));
		add(mainPanel);
	
		/**************************************************	STUDINFO PANEL ****************************************/
		
		studInfoPanel = new JPanel();
		studInfoPanel.setOpaque(false);
		studInfoPanel.setFont(new Font("Roboto", Font.PLAIN, 12));
		studInfoPanel.setBorder(new LineBorder(new Color(128, 0, 0)));
		studInfoPanel.setLocation(10, 11);
		studInfoPanel.setBackground(Color.DARK_GRAY);
		studInfoPanel.setSize(new Dimension(544, 392));
		mainPanel.add(studInfoPanel);
		studInfoPanel.setLayout(new MigLayout("fillx", "[grow][grow][][]", "[][][grow][grow][grow][grow][grow]"));
		
		
		txtLastName = new JTextField();
		txtLastName.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtLastName.setForeground(Color.WHITE);
		txtLastName.setOpaque(false);
		txtLastName.setBorder(new TitledBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)), "Last Name", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		txtLastName.setPreferredSize(new Dimension(250, 35));
		studInfoPanel.add(txtLastName, "cell 0 0 3 1,growx,aligny center");
		
		
		
		
		txtFirstName = new JTextField();
		txtFirstName.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtFirstName.setForeground(Color.WHITE);
		txtFirstName.setOpaque(false);
		txtFirstName.setBorder(new TitledBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255,255,255)), "First Name", TitledBorder.LEADING, TitledBorder.TOP, null, Color.WHITE));
		txtFirstName.setPreferredSize(new Dimension(250, 35));
		studInfoPanel.add(txtFirstName, "cell 0 1 3 1,growx,aligny center");
		
		txtMidName = new JTextField();
		txtMidName.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtMidName.setForeground(Color.WHITE);
		txtMidName.setOpaque(false);
		txtMidName.setBorder(new TitledBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)), "Middle Name", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		txtMidName.setPreferredSize(new Dimension(250, 35));
		studInfoPanel.add(txtMidName, "cell 0 2 3 1,growx,aligny center");
		
		
		txtNicName = new JTextField();
		txtNicName.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtNicName.setForeground(Color.WHITE);
		txtNicName.setOpaque(false);
		txtNicName.setBorder(new TitledBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)), "Nick Name", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		txtNicName.setPreferredSize(new Dimension(250, 35));
		studInfoPanel.add(txtNicName, "cell 0 3 3 1,growx,aligny center");
		
		dtChooser=new DateChooser();
		
		txtBday = new JTextField();
		txtBday.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtBday.setForeground(Color.WHITE);
		txtBday.setOpaque(false);
		txtBday.setBorder(new TitledBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)), "Birth Date(Month/Day/Year)", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		txtBday.setPreferredSize(new Dimension(250, 35));
		studInfoPanel.add(txtBday, "cell 0 4 3 1,growx,aligny center");
		dtChooser.setTextRefernce(txtBday);
		
		/*btnDatePicker = new JButton("...");
		btnDatePicker.setRequestFocusEnabled(false);
		btnDatePicker.setMargin(new Insets(2, 2, 2, 2));
		btnDatePicker.setIconTextGap(1);
		btnDatePicker.setForeground(Color.WHITE);
		btnDatePicker.setFont(new Font("Roboto", Font.PLAIN, 14));
		btnDatePicker.setFocusable(false);
		btnDatePicker.setBorderPainted(false);
		btnDatePicker.setBackground(new Color(128, 0, 0));
		studInfoPanel.add(btnDatePicker, "cell 1 4 2 1,growx,aligny bottom"); */
		
		txtAge = new JTextField();
		txtAge.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtAge.setEditable(false);
		txtAge.setOpaque(false);
		txtAge.setForeground(Color.WHITE);
		txtAge.setBorder(new TitledBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)), "Age", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		txtAge.setPreferredSize(new Dimension(250, 35));
		studInfoPanel.add(txtAge, "cell 0 5 3 1,growx,aligny center");
		
		txtMobileNo = new JTextField();
		txtMobileNo.setPreferredSize(new Dimension(250, 35));
		txtMobileNo.setOpaque(false);
		txtMobileNo.setForeground(Color.WHITE);
		txtMobileNo.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtMobileNo.setBorder(new TitledBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)), "Mobile Number", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		studInfoPanel.add(txtMobileNo, "cell 3 5,growx,aligny center");
		
		/**************************************************	GENDER PANEL ****************************************/
		btnGrpGender=new ButtonGroup();
		
		genderPanel = new JPanel();
		genderPanel.setOpaque(false);
		genderPanel.setBorder(new TitledBorder(new TitledBorder(new EmptyBorder(0, 0, 0, 0), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)), "Gender", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		genderPanel.setSize(new Dimension(300,35));
		studInfoPanel.add(genderPanel, "cell 0 6 3 1,grow");
		genderPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 0));
		
		
		
		rdbMale = new JRadioButton("Male");
		rdbMale.setFont(new Font("Roboto", Font.PLAIN, 12));
		rdbMale.setForeground(Color.WHITE);
		rdbMale.setOpaque(false);
		rdbMale.setBorder(null);
		rdbMale.setRequestFocusEnabled(false);
		genderPanel.add(rdbMale);
		
		rdbFemale = new JRadioButton("Female");
		rdbFemale.setRequestFocusEnabled(false);
		rdbFemale.setOpaque(false);
		rdbFemale.setForeground(Color.WHITE);
		rdbFemale.setFont(new Font("Roboto", Font.PLAIN, 12));
		rdbFemale.setBorder(null);
		genderPanel.add(rdbFemale);
		btnGrpGender.add(rdbMale);
		btnGrpGender.add(rdbFemale);
		
		/**************************************************	PLACE OF BIRTH PANEL ****************************************/
		pobPanel = new JPanel();
		pobPanel.setSize(new Dimension(300, 35));
		pobPanel.setOpaque(false);
		pobPanel.setBorder(new TitledBorder(new TitledBorder(new EmptyBorder(0, 0, 0, 0), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)), "Place of Birth", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		studInfoPanel.add(pobPanel, "cell 3 0,growx,aligny center");
		pobPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		cbxBarangay = new JComboBox<String>();
		cbxBarangay.setRequestFocusEnabled(false);
		cbxBarangay.setForeground(Color.WHITE);
		cbxBarangay.setFont(new Font("Roboto", Font.PLAIN, 12));
		cbxBarangay.setBackground(Color.DARK_GRAY);
		cbxBarangay.setBorder(null);
		cbxBarangay.setFocusable(false);
		cbxBarangay.setOpaque(false);
		cbxBarangay.setPreferredSize(new Dimension(75,25));
		pobPanel.add(cbxBarangay);
		
		cbxMunCity = new JComboBox<String>();
		cbxMunCity.setRequestFocusEnabled(false);
		cbxMunCity.setForeground(Color.WHITE);
		cbxMunCity.setFont(new Font("Roboto", Font.PLAIN, 12));
		cbxMunCity.setBackground(Color.DARK_GRAY);
		cbxMunCity.setBorder(null);
		cbxMunCity.setFocusable(false);
		cbxMunCity.setOpaque(false);
		cbxMunCity.setPreferredSize(new Dimension(75,25));
		pobPanel.add(cbxMunCity);
		
		cbxProvince = new JComboBox<String>();
		cbxProvince.setRequestFocusEnabled(false);
		cbxProvince.setForeground(Color.WHITE);
		cbxProvince.setFont(new Font("Roboto", Font.PLAIN, 12));
		cbxProvince.setBackground(Color.DARK_GRAY);
		cbxProvince.setBorder(null);
		cbxProvince.setFocusable(false);
		cbxProvince.setOpaque(false);
		cbxProvince.setPreferredSize(new Dimension(75,25));
		pobPanel.add(cbxProvince);
		
		/**************************************************	ADDRESS PANEL ****************************************/
		addPanel = new JPanel();
		addPanel.setSize(new Dimension(300, 35));
		addPanel.setOpaque(false);
		addPanel.setBorder(new TitledBorder(new TitledBorder(new EmptyBorder(0, 0, 0, 0), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)), "Permanent Address", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		studInfoPanel.add(addPanel, "cell 3 1,growx,aligny center");
		addPanel.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		cbxAddBarangay = new JComboBox<String>();
		cbxAddBarangay.setRequestFocusEnabled(false);
		cbxAddBarangay.setPreferredSize(new Dimension(75, 25));
		cbxAddBarangay.setOpaque(false);
		cbxAddBarangay.setForeground(Color.WHITE);
		cbxAddBarangay.setFont(new Font("Roboto", Font.PLAIN, 12));
		cbxAddBarangay.setFocusable(false);
		cbxAddBarangay.setBorder(null);
		cbxAddBarangay.setBackground(Color.DARK_GRAY);
		addPanel.add(cbxAddBarangay);
		
		cbxAddMunCity = new JComboBox<String>();
		cbxAddMunCity.setRequestFocusEnabled(false);
		cbxAddMunCity.setPreferredSize(new Dimension(75, 25));
		cbxAddMunCity.setOpaque(false);
		cbxAddMunCity.setForeground(Color.WHITE);
		cbxAddMunCity.setFont(new Font("Roboto", Font.PLAIN, 12));
		cbxAddMunCity.setFocusable(false);
		cbxAddMunCity.setBorder(null);
		cbxAddMunCity.setBackground(Color.DARK_GRAY);
		addPanel.add(cbxAddMunCity);
		
		cbxAddProvince = new JComboBox<String>();
		cbxAddProvince.setRequestFocusEnabled(false);
		cbxAddProvince.setPreferredSize(new Dimension(75, 25));
		cbxAddProvince.setOpaque(false);
		cbxAddProvince.setForeground(Color.WHITE);
		cbxAddProvince.setFont(new Font("Roboto", Font.PLAIN, 12));
		cbxAddProvince.setFocusable(false);
		cbxAddProvince.setBorder(null);
		cbxAddProvince.setBackground(Color.DARK_GRAY);
		addPanel.add(cbxAddProvince);
		
		/****************************************************************************************************************************************************************************************************/
		
		txtNationality = new JTextField();
		txtNationality.setPreferredSize(new Dimension(250, 35));
		txtNationality.setOpaque(false);
		txtNationality.setForeground(Color.WHITE);
		txtNationality.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtNationality.setBorder(new TitledBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)), "Nationality", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		studInfoPanel.add(txtNationality, "cell 3 2,growx,aligny center");
		
		
		
		txtReligion = new JTextField();
		txtReligion.setPreferredSize(new Dimension(250, 35));
		txtReligion.setOpaque(false);
		txtReligion.setForeground(Color.WHITE);
		txtReligion.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtReligion.setBorder(new TitledBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)), "Religion", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		studInfoPanel.add(txtReligion, "cell 3 3,growx,aligny center");
		
		
		txtPostal = new JTextField();
		txtPostal.setPreferredSize(new Dimension(250, 35));
		txtPostal.setOpaque(false);
		txtPostal.setForeground(Color.WHITE);
		txtPostal.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtPostal.setBorder(new TitledBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)), "Postal Code", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		studInfoPanel.add(txtPostal, "cell 3 4,growx,aligny center");
		
		
		/**************************************************	PICTURE PANEL ****************************************/
		
		picPanel = new JPanel();
		picPanel.setOpaque(false);
		picPanel.setBorder(new LineBorder(new Color(128, 0, 0)));
		picPanel.setBounds(564, 102, 244, 301);
		mainPanel.add(picPanel);
		picPanel.setLayout(null);
		
		lblNewLabel = new JLabel("Upload here");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 224, 215);
		picPanel.add(lblNewLabel);
		
		btnUpload = new JButton("Upload");
		btnUpload.setFocusable(false);
		btnUpload.setRequestFocusEnabled(false);
		btnUpload.setBackground(new Color(128, 0, 0));
		btnUpload.setForeground(Color.WHITE);
		btnUpload.setFont(new Font("Roboto", Font.PLAIN, 12));
		btnUpload.setBounds(75, 255, 100, 35);
		picPanel.add(btnUpload);
		
		/**************************************************	DOCUMENT PANEL ****************************************/
		docPanel = new JPanel();
		docPanel.setOpaque(false);
		docPanel.setBorder(new LineBorder(new Color(128, 0, 0)));
		docPanel.setBounds(564, 11, 244, 84);
		mainPanel.add(docPanel);
		
		/**************************************************	STUDENTO PANEL ****************************************/
		studOPanel = new JPanel();
		studOPanel.setOpaque(false);
		studOPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(128, 0, 0)));
		studOPanel.setBounds(9, 410, 799, 65);
		add(studOPanel);
		studOPanel.setLayout(new MigLayout("fillx", "[100,fill][100,fill][100]40[grow]", "0[grow]0"));
		
		cbxGrade = new JComboBox();
		cbxGrade.setBorder(new TitledBorder(new LineBorder(new Color(128, 0, 0)), "Grade", TitledBorder.LEADING, TitledBorder.TOP, null, Color.WHITE));
		cbxGrade.setBackground(Color.DARK_GRAY);
		cbxGrade.setFocusable(false);
		cbxGrade.setRequestFocusEnabled(false);
		cbxGrade.setOpaque(false);
		cbxGrade.setForeground(Color.WHITE);
		cbxGrade.setFont(new Font("Roboto", Font.PLAIN, 12));
		cbxGrade.setBounds(10, 7, 100, 41);
		studOPanel.add(cbxGrade,"cell 0 0,growx");
		
		cbxLevel = new JComboBox();
		cbxLevel.setBorder(new TitledBorder(new LineBorder(new Color(128, 0, 0)), "Level", TitledBorder.LEADING, TitledBorder.TOP, null, Color.WHITE));
		cbxLevel.setBackground(Color.DARK_GRAY);
		cbxLevel.setFocusable(false);
		cbxLevel.setRequestFocusEnabled(false);
		cbxLevel.setOpaque(false);
		cbxLevel.setForeground(Color.WHITE);
		cbxLevel.setFont(new Font("Roboto", Font.PLAIN, 12));
		cbxLevel.setBounds(120, 7, 100, 41);
		studOPanel.add(cbxLevel,"cell 1 0,growx");
		
		cbxSyear = new JComboBox();
		cbxSyear.setBorder(new TitledBorder(new LineBorder(new Color(128, 0, 0)), "School Year", TitledBorder.LEADING, TitledBorder.TOP, null, Color.WHITE));
		cbxSyear.setBackground(Color.DARK_GRAY);
		cbxSyear.setFocusable(false);
		cbxSyear.setRequestFocusEnabled(false);
		cbxSyear.setOpaque(false);
		cbxSyear.setForeground(Color.WHITE);
		cbxSyear.setFont(new Font("Roboto", Font.PLAIN, 12));
		cbxSyear.setBounds(230, 7, 100, 41);
		studOPanel.add(cbxSyear,"cell 2 0,growx"); 
		
		honorPanel = new JPanel();
		honorPanel.setOpaque(false);
		studOPanel.add(honorPanel, "cell 3 0,grow");
		honorPanel.setLayout(null);
		
		chkHonor = new JCheckBox("Are you a 1st/2nd honor from your most recent year? ");
		chkHonor.setForeground(Color.WHITE);
		chkHonor.setOpaque(false);
		chkHonor.setFont(new Font("Roboto", Font.PLAIN, 12));
		chkHonor.setBounds(5, 7, 427, 23);
		honorPanel.add(chkHonor);
		
		lblYhonor = new JLabel("If yes,which of these did you achieve?");
		lblYhonor.setVisible(false);
		lblYhonor.setForeground(Color.WHITE);
		lblYhonor.setFont(new Font("Roboto", Font.PLAIN, 12));
		lblYhonor.setBounds(10,35, 207, 14);
		honorPanel.add(lblYhonor);
		
		btnGrpHonor=new ButtonGroup();
		rdbFirst = new JRadioButton("1st Honor");
		rdbFirst.setVisible(false);
		rdbFirst.setForeground(Color.WHITE);
		rdbFirst.setOpaque(false);
		rdbFirst.setFont(new Font("Roboto", Font.PLAIN, 12));
		rdbFirst.setBounds(210, 30, 109, 23);
		honorPanel.add(rdbFirst);
		
		rdbSecond = new JRadioButton("2nd Honor");
		rdbSecond.setVisible(false);
		rdbSecond.setForeground(Color.WHITE);
		rdbSecond.setOpaque(false);
		
		rdbSecond.setFont(new Font("Roboto", Font.PLAIN, 12));
		rdbSecond.setBounds(287, 30, 109, 23);
		honorPanel.add(rdbSecond);
		btnGrpHonor.add(rdbFirst);
		btnGrpHonor.add(rdbSecond);
		
	}
}
