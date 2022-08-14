package View.StudentForm.Component;

import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Font;

import net.miginfocom.swing.MigLayout;
import javax.swing.JTextField;
import javax.swing.border.MatteBorder;
import java.awt.Dimension;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.awt.Rectangle;
import javax.swing.JComboBox;

public class OtherPersonPanel extends JPanel {
	private JTextField txtGLastName;
	private JTextField txtGStreet;
	private JTextField txtGMidName;
	private JTextField txtGResNo;
	private JTextField txtGFirstName;
	private JTextField txtGOStreet;
	private JTextField txtGMobNo;
	private JTextField txtGOffNo;
	private JTextField txtGEmail;
	private JTextField txtGOcc;
	private JPanel repPanel;
	private JTextField txtRepName;
	private JTextField txtRepAffiliation;
	private JTextField txtRepNo;
	private JPanel panel;

	/**
	 * Create the panel.
	 */
	public OtherPersonPanel() {
		setOpaque(false);
		setBackground(Color.DARK_GRAY);
		setLayout(null);
		
		panel = new JPanel();
		panel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(128, 0, 0)));
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(10, 11, 700, 365);
		add(panel);
		panel.setLayout(null);
		
		JPanel guardianPanel = new JPanel();
		guardianPanel.setOpaque(false);
		guardianPanel.setBackground(Color.DARK_GRAY);
		guardianPanel.setBounds(10, 5, 680, 270);
		guardianPanel.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255)), "Guardian's Information", TitledBorder.LEADING, TitledBorder.TOP, new Font("Roboto", Font.PLAIN,12), new Color(255, 255, 255)));
		panel.add(guardianPanel);
		guardianPanel.setLayout(new MigLayout("", "[300,grow][300,grow]", "[][][][][]"));
		
		txtGLastName = new JTextField();
		txtGLastName.setPreferredSize(new Dimension(250, 35));
		txtGLastName.setOpaque(false);
		txtGLastName.setForeground(Color.WHITE);
		txtGLastName.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtGLastName.setBorder(new TitledBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)), "Last Name", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		guardianPanel.add(txtGLastName, "cell 0 0,growx,aligny center");
		
		JPanel resGPanel = new JPanel();
		resGPanel.setOpaque(false);
		resGPanel.setBorder(new TitledBorder(new TitledBorder(new EmptyBorder(0, 0, 0, 0), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)), "Residence Address", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		guardianPanel.add(resGPanel, "cell 1 0,growx,aligny top");
		resGPanel.setLayout(new MigLayout("", "[80px,grow][70px,grow][70px][70px]", "[25px]"));
		
		txtGStreet = new JTextField();
		txtGStreet.setOpaque(false);
		txtGStreet.setColumns(10);
		txtGStreet.setBounds(new Rectangle(0, 5, 0, 0));
		txtGStreet.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.WHITE));
		resGPanel.add(txtGStreet, "cell 0 0,alignx left,aligny center");
		
		JComboBox<String> cbxGBarangay = new JComboBox<String>();
		cbxGBarangay.setRequestFocusEnabled(false);
		cbxGBarangay.setPreferredSize(new Dimension(70, 25));
		cbxGBarangay.setOpaque(false);
		cbxGBarangay.setForeground(Color.WHITE);
		cbxGBarangay.setFont(new Font("Roboto", Font.PLAIN, 12));
		cbxGBarangay.setFocusable(false);
		cbxGBarangay.setBorder(null);
		cbxGBarangay.setBackground(Color.DARK_GRAY);
		resGPanel.add(cbxGBarangay, "cell 1 0,alignx left,aligny top");
		
		JComboBox<String> cbxGMunCity = new JComboBox<String>();
		cbxGMunCity.setRequestFocusEnabled(false);
		cbxGMunCity.setPreferredSize(new Dimension(70, 25));
		cbxGMunCity.setOpaque(false);
		cbxGMunCity.setForeground(Color.WHITE);
		cbxGMunCity.setFont(new Font("Roboto", Font.PLAIN, 12));
		cbxGMunCity.setFocusable(false);
		cbxGMunCity.setBorder(null);
		cbxGMunCity.setBackground(Color.DARK_GRAY);
		resGPanel.add(cbxGMunCity, "cell 2 0,alignx left,aligny top");
		
		JComboBox<String> cbxGProvince = new JComboBox<String>();
		cbxGProvince.setRequestFocusEnabled(false);
		cbxGProvince.setPreferredSize(new Dimension(70, 25));
		cbxGProvince.setOpaque(false);
		cbxGProvince.setForeground(Color.WHITE);
		cbxGProvince.setFont(new Font("Roboto", Font.PLAIN, 12));
		cbxGProvince.setFocusable(false);
		cbxGProvince.setBorder(null);
		cbxGProvince.setBackground(Color.DARK_GRAY);
		resGPanel.add(cbxGProvince, "cell 3 0,alignx left,aligny top");
		
		txtGMidName = new JTextField();
		txtGMidName.setPreferredSize(new Dimension(250, 35));
		txtGMidName.setOpaque(false);
		txtGMidName.setForeground(Color.WHITE);
		txtGMidName.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtGMidName.setBorder(new TitledBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)), "Middle Name", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		guardianPanel.add(txtGMidName, "cell 0 1,grow");
		
		txtGResNo = new JTextField();
		txtGResNo.setPreferredSize(new Dimension(250, 35));
		txtGResNo.setOpaque(false);
		txtGResNo.setForeground(Color.WHITE);
		txtGResNo.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtGResNo.setBorder(new TitledBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)), "Residence Telephone No.", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		guardianPanel.add(txtGResNo, "cell 1 1,grow");
		
		txtGFirstName = new JTextField();
		txtGFirstName.setPreferredSize(new Dimension(250, 35));
		txtGFirstName.setOpaque(false);
		txtGFirstName.setForeground(Color.WHITE);
		txtGFirstName.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtGFirstName.setBorder(new TitledBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)), "First Name", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		guardianPanel.add(txtGFirstName, "cell 0 2,growx,aligny center");
		
		JPanel offGPanel = new JPanel();
		offGPanel.setOpaque(false);
		offGPanel.setBorder(new TitledBorder(new TitledBorder(new EmptyBorder(0, 0, 0, 0), "", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)), "Office Address", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		guardianPanel.add(offGPanel, "cell 1 2,growx,aligny top");
		offGPanel.setLayout(new MigLayout("", "[80px,grow][70px,grow][70px,grow][70px,grow]", "[25px]"));
		
		txtGOStreet = new JTextField();
		txtGOStreet.setOpaque(false);
		txtGOStreet.setColumns(10);
		txtGOStreet.setBounds(new Rectangle(0, 5, 0, 0));
		txtGOStreet.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.WHITE));
		offGPanel.add(txtGOStreet, "cell 0 0,alignx left,aligny center");
		
		JComboBox<String> cbxGOBarangay = new JComboBox<String>();
		cbxGOBarangay.setRequestFocusEnabled(false);
		cbxGOBarangay.setPreferredSize(new Dimension(70, 25));
		cbxGOBarangay.setOpaque(false);
		cbxGOBarangay.setForeground(Color.WHITE);
		cbxGOBarangay.setFont(new Font("Roboto", Font.PLAIN, 12));
		cbxGOBarangay.setFocusable(false);
		cbxGOBarangay.setBorder(null);
		cbxGOBarangay.setBackground(Color.DARK_GRAY);
		offGPanel.add(cbxGOBarangay, "cell 1 0,alignx left,aligny top");
		
		JComboBox<String> cbxGOMunCity = new JComboBox<String>();
		cbxGOMunCity.setRequestFocusEnabled(false);
		cbxGOMunCity.setPreferredSize(new Dimension(70, 25));
		cbxGOMunCity.setOpaque(false);
		cbxGOMunCity.setForeground(Color.WHITE);
		cbxGOMunCity.setFont(new Font("Roboto", Font.PLAIN, 12));
		cbxGOMunCity.setFocusable(false);
		cbxGOMunCity.setBorder(null);
		cbxGOMunCity.setBackground(Color.DARK_GRAY);
		offGPanel.add(cbxGOMunCity, "cell 2 0,alignx left,aligny top");
		
		JComboBox<String> cbxGOProvince = new JComboBox<String>();
		cbxGOProvince.setRequestFocusEnabled(false);
		cbxGOProvince.setPreferredSize(new Dimension(70, 25));
		cbxGOProvince.setOpaque(false);
		cbxGOProvince.setForeground(Color.WHITE);
		cbxGOProvince.setFont(new Font("Roboto", Font.PLAIN, 12));
		cbxGOProvince.setFocusable(false);
		cbxGOProvince.setBorder(null);
		cbxGOProvince.setBackground(Color.DARK_GRAY);
		offGPanel.add(cbxGOProvince, "cell 3 0,alignx left,aligny top");
		
		txtGMobNo = new JTextField();
		txtGMobNo.setPreferredSize(new Dimension(250, 35));
		txtGMobNo.setOpaque(false);
		txtGMobNo.setForeground(Color.WHITE);
		txtGMobNo.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtGMobNo.setBorder(new TitledBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)), "Mobile Number", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		guardianPanel.add(txtGMobNo, "cell 0 3,grow");
		
		txtGOffNo = new JTextField();
		txtGOffNo.setPreferredSize(new Dimension(250, 35));
		txtGOffNo.setOpaque(false);
		txtGOffNo.setForeground(Color.WHITE);
		txtGOffNo.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtGOffNo.setBorder(new TitledBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)), "Office Telephone No.", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		guardianPanel.add(txtGOffNo, "cell 1 3,grow");
		
		txtGEmail = new JTextField();
		txtGEmail.setPreferredSize(new Dimension(250, 35));
		txtGEmail.setOpaque(false);
		txtGEmail.setForeground(Color.WHITE);
		txtGEmail.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtGEmail.setBorder(new TitledBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)), "Email Address", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		guardianPanel.add(txtGEmail, "cell 0 4,grow");
		
		txtGOcc = new JTextField();
		txtGOcc.setPreferredSize(new Dimension(250, 35));
		txtGOcc.setOpaque(false);
		txtGOcc.setForeground(Color.WHITE);
		txtGOcc.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtGOcc.setBorder(new TitledBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)), "Occupation.", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		guardianPanel.add(txtGOcc, "cell 1 4,grow");
		
		repPanel = new JPanel();
		repPanel.setOpaque(false);
		repPanel.setBorder(new TitledBorder(new LineBorder(new Color(255, 255, 255)), "Authorized Representative's Information", TitledBorder.LEADING, TitledBorder.TOP, new Font("Roboto",Font.PLAIN,12), new Color(255, 255, 255)));
		repPanel.setBackground(Color.DARK_GRAY);
		repPanel.setBounds(10, 286, 680, 72);
		panel.add(repPanel);
		repPanel.setLayout(new MigLayout("", "[326px][326px][326px]", "[36px,fill]"));
		
		txtRepName = new JTextField();
		txtRepName.setPreferredSize(new Dimension(250, 35));
		txtRepName.setOpaque(false);
		txtRepName.setForeground(Color.WHITE);
		txtRepName.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtRepName.setBorder(new TitledBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)), "Name", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		repPanel.add(txtRepName, "cell 0 0,grow");
		
		txtRepAffiliation = new JTextField();
		txtRepAffiliation.setPreferredSize(new Dimension(250, 35));
		txtRepAffiliation.setOpaque(false);
		txtRepAffiliation.setForeground(Color.WHITE);
		txtRepAffiliation.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtRepAffiliation.setBorder(new TitledBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)), "Affiliation", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		repPanel.add(txtRepAffiliation, "cell 1 0,grow");
		
		txtRepNo = new JTextField();
		txtRepNo.setPreferredSize(new Dimension(250, 35));
		txtRepNo.setOpaque(false);
		txtRepNo.setForeground(Color.WHITE);
		txtRepNo.setFont(new Font("Roboto", Font.PLAIN, 12));
		txtRepNo.setBorder(new TitledBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)), "Mobile/Tel No", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		repPanel.add(txtRepNo, "cell 2 0,grow");
		
	}
}
