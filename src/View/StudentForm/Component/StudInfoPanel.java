package View.StudentForm.Component;

import javax.swing.JPanel;
import net.miginfocom.swing.MigLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import javax.swing.border.TitledBorder;

import View.DateChooser.DateChooser;
import View.MainFrame.Component.Swing.Scrollbar.ScrollBarCustom;

import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.JSeparator;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import java.awt.FlowLayout;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.border.EtchedBorder;
import java.awt.Rectangle;
import javax.swing.JScrollBar;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;

public class StudInfoPanel extends JPanel {
	private JPanel studInfoPanel;
	private JTextField txtLastName, txtFirstName,txtMidName,txtNicName;
	private JTextField txtBday, txtAge;
	private DateChooser dtChooser;
	private JPanel genderPanel;
	private JRadioButton rdbMale,rdbFemale;
	private ButtonGroup btnGrpGender;
	private JPanel pobPanel;
	private JComboBox<String> cbxBarangay;
	private JComboBox<String> cbxMunCity;
	private JComboBox<String> cbxProvince;
	private JPanel addPanel;
	private JComboBox<String> cbxBarangay1;
	private JComboBox<String> cbxMunCity1;
	private JComboBox<String> cbxProvince1;
	private JTextField txtNationality;
	private JTextField txtReligion;
	private JTextField txtPostal;
	private JTextField txtMobileNo;
	private JButton btnDatePicker;
	private JPanel mainPanel;
	private JPanel picPanel;
	private JPanel docPanel;
	private JLabel lblNewLabel;
	
	/**
	 * Create the panel.
	 */
	public StudInfoPanel() {
		
		
		initialize();
		init();
		
		
	}
	
	/**************************************************	INIT METHOD ****************************************/
	public void init() {
		
		/**************************************************	MAIN PANEL ****************************************/
		
		mainPanel = new JPanel();
		mainPanel.setOpaque(false);
		mainPanel.setBackground(Color.DARK_GRAY);
		mainPanel.setLayout(null);
		mainPanel.setPreferredSize(new Dimension(820,420));
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
		
		cbxBarangay1 = new JComboBox<String>();
		cbxBarangay1.setRequestFocusEnabled(false);
		cbxBarangay1.setPreferredSize(new Dimension(75, 25));
		cbxBarangay1.setOpaque(false);
		cbxBarangay1.setForeground(Color.WHITE);
		cbxBarangay1.setFont(new Font("Roboto", Font.PLAIN, 12));
		cbxBarangay1.setFocusable(false);
		cbxBarangay1.setBorder(null);
		cbxBarangay1.setBackground(Color.DARK_GRAY);
		addPanel.add(cbxBarangay1);
		
		cbxMunCity1 = new JComboBox<String>();
		cbxMunCity1.setRequestFocusEnabled(false);
		cbxMunCity1.setPreferredSize(new Dimension(75, 25));
		cbxMunCity1.setOpaque(false);
		cbxMunCity1.setForeground(Color.WHITE);
		cbxMunCity1.setFont(new Font("Roboto", Font.PLAIN, 12));
		cbxMunCity1.setFocusable(false);
		cbxMunCity1.setBorder(null);
		cbxMunCity1.setBackground(Color.DARK_GRAY);
		addPanel.add(cbxMunCity1);
		
		cbxProvince1 = new JComboBox<String>();
		cbxProvince1.setRequestFocusEnabled(false);
		cbxProvince1.setPreferredSize(new Dimension(75, 25));
		cbxProvince1.setOpaque(false);
		cbxProvince1.setForeground(Color.WHITE);
		cbxProvince1.setFont(new Font("Roboto", Font.PLAIN, 12));
		cbxProvince1.setFocusable(false);
		cbxProvince1.setBorder(null);
		cbxProvince1.setBackground(Color.DARK_GRAY);
		addPanel.add(cbxProvince1);
		
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
		lblNewLabel.setFont(new Font("Roboto", Font.PLAIN, 15));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 224, 215);
		picPanel.add(lblNewLabel);
		
		JButton btnUpload = new JButton("Upload");
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
		
		
		
		
		
	}
	
	/**************************************************	INITIALIZE METHOD ****************************************/
	
	public void initialize() {
		setOpaque(false);
		setBackground(Color.DARK_GRAY);
		
	}
}
