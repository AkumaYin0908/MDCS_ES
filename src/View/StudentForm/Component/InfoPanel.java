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
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class InfoPanel extends JPanel {
	private JScrollPane scrollPane;
	private JPanel studInfoPanel;
	private JTextField txtLastName;
	private JTextField txtFirstName;
	private MigLayout layout;
	private JPanel docPanel;
	private JPanel imgPanel;
	private ScrollBarCustom scrollBarCustom;
	private JTextField txtMidName;
	private JTextField txtNicName;
	private JTextField txtBday;
	private JTextField txtAge;
	private JTextField txtBPlace;
	private DateChooser dtChooser;
	/**
	 * Create the panel.
	 */
	public InfoPanel() {
		setOpaque(false);
		initialize();
		init();
		
		
	}
	public void init() {
		scrollPane = new JScrollPane();
		scrollPane.setOpaque(false);
		scrollPane.setBackground(Color.DARK_GRAY);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(10, 11, 900, 861);
		scrollPane.setBorder(null);
		scrollPane.setFocusable(false);
		scrollPane.setRequestFocusEnabled(false);
		scrollPane.setViewportBorder(null);
		scrollBarCustom = new ScrollBarCustom();
		scrollBarCustom.setForeground(Color.WHITE);
		scrollPane.setVerticalScrollBar(scrollBarCustom);
		
		add(scrollPane);
		
		studInfoPanel = new JPanel();
		studInfoPanel.setBackground(Color.DARK_GRAY);
		scrollPane.setViewportView(studInfoPanel);
		GridBagLayout gbl_studInfoPanel = new GridBagLayout();
		gbl_studInfoPanel.columnWidths = new int[]{200, 40, 259, 40, 299, 0};
		gbl_studInfoPanel.rowHeights = new int[]{75, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_studInfoPanel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_studInfoPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		studInfoPanel.setLayout(gbl_studInfoPanel);
		
		docPanel = new JPanel();
		
		
		GridBagConstraints gbc_docPanel = new GridBagConstraints();
		gbc_docPanel.fill = GridBagConstraints.VERTICAL;
		gbc_docPanel.gridwidth = 5;
		gbc_docPanel.insets = new Insets(5, 5, 5, 0);
		gbc_docPanel.gridx = 0;
		gbc_docPanel.gridy = 0;
		studInfoPanel.add(docPanel, gbc_docPanel);
		
		
		txtLastName = new JTextField();
		txtLastName.setForeground(Color.WHITE);
		txtLastName.setOpaque(false);
		txtLastName.setBorder(new TitledBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255,255,255)), "Last Name", TitledBorder.LEADING, TitledBorder.TOP, null, Color.WHITE));
		txtLastName.setPreferredSize(new Dimension(300,35));
		GridBagConstraints gbc_txtLastName = new GridBagConstraints();
		gbc_txtLastName.insets = new Insets(5, 5, 5, 5);
		gbc_txtLastName.gridwidth=2;
		gbc_txtLastName.gridx = 0;
		gbc_txtLastName.gridy = 1;
		studInfoPanel.add(txtLastName, gbc_txtLastName);
		
		
		txtFirstName = new JTextField();
		txtFirstName.setForeground(Color.WHITE);
		txtFirstName.setOpaque(false);
		txtFirstName.setBorder(new TitledBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255,255,255)), "First Name", TitledBorder.LEADING, TitledBorder.TOP, null, Color.WHITE));
		txtFirstName.setPreferredSize(new Dimension(300,35));
		GridBagConstraints gbc_txtFirstName = new GridBagConstraints();
		gbc_txtFirstName.insets = new Insets(5, 5, 5, 5);
		gbc_txtFirstName.gridwidth=2;
		gbc_txtFirstName.gridx = 0;
		gbc_txtFirstName.gridy = 2;
		studInfoPanel.add(txtFirstName, gbc_txtFirstName);
		
		
		txtMidName = new JTextField();
		txtMidName.setForeground(Color.WHITE);
		txtMidName.setOpaque(false);
		txtMidName.setBorder(new TitledBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)), "Middle Name", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		txtMidName.setPreferredSize(new Dimension(300,35));
		GridBagConstraints gbc_txtMidName = new GridBagConstraints();
		gbc_txtMidName.insets = new Insets(5, 5, 5, 5);
		gbc_txtMidName.gridwidth=2;
		gbc_txtMidName.gridx = 0;
		gbc_txtMidName.gridy = 3;
		studInfoPanel.add(txtMidName, gbc_txtMidName);
		
		txtNicName = new JTextField();
		txtNicName.setForeground(Color.WHITE);
		txtNicName.setOpaque(false);
		txtNicName.setBorder(new TitledBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)), "Nick Name", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		txtNicName.setPreferredSize(new Dimension(300,35));
		GridBagConstraints gbc_txtNicName = new GridBagConstraints();
		gbc_txtNicName.insets = new Insets(5, 5, 5, 5);
		gbc_txtNicName.gridwidth=2;
		gbc_txtNicName.gridx = 0;
		gbc_txtNicName.gridy = 4;
		studInfoPanel.add(txtNicName, gbc_txtNicName);
		
		txtBday = new JTextField();
		txtBday.setForeground(Color.WHITE);
		txtBday.setOpaque(false);
		txtBday.setBorder(new TitledBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)), "Birth Date(Month/Day/Year)", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		txtBday.setPreferredSize(new Dimension(250,35));
		GridBagConstraints gbc_txtBday = new GridBagConstraints();
		gbc_txtBday.anchor = GridBagConstraints.WEST;
		gbc_txtBday.insets = new Insets(5, 5, 5, 5);
		gbc_txtBday.gridx = 0;
		gbc_txtBday.gridy = 5;
		studInfoPanel.add(txtBday, gbc_txtBday);
		
		dtChooser=new DateChooser();
		dtChooser.setTextRefernce(txtBday);
		JButton btnDatePicker = new JButton("...");
		
		btnDatePicker.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dtChooser.showPopup();
			}
		});
		btnDatePicker.setForeground(Color.WHITE);
		btnDatePicker.setBackground(new Color(128, 0, 0));
		btnDatePicker.setBorderPainted(false);
		btnDatePicker.setMargin(new Insets(2, 2, 2, 2));
		btnDatePicker.setIconTextGap(1);
		btnDatePicker.setFocusable(false);
		btnDatePicker.setRequestFocusEnabled(false);
		btnDatePicker.setFont(new Font("Roboto", Font.PLAIN, 14));
		GridBagConstraints gbc_btnDatePicker = new GridBagConstraints();
		gbc_btnDatePicker.fill = GridBagConstraints.HORIZONTAL;
		gbc_btnDatePicker.insets = new Insets(0, 0, 0,5);
		gbc_btnDatePicker.gridx = 1;
		gbc_btnDatePicker.gridy = 5;
		studInfoPanel.add(btnDatePicker, gbc_btnDatePicker);
		
		imgPanel = new JPanel();
		GridBagConstraints gbc_imgPanel = new GridBagConstraints();
		gbc_imgPanel.gridheight = 2;
		gbc_imgPanel.insets = new Insets(0, 0, 5, 0);
		gbc_imgPanel.fill = GridBagConstraints.BOTH;
		
		gbc_imgPanel.gridx = 4;
		gbc_imgPanel.gridy = 1;
		studInfoPanel.add(imgPanel, gbc_imgPanel);
		
		txtAge = new JTextField();
		txtAge.setEditable(false);
		txtAge.setOpaque(false);
		txtAge.setForeground(Color.WHITE);
		txtAge.setBorder(new TitledBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)), "Age", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		txtAge.setPreferredSize(new Dimension(300,35));
		GridBagConstraints gbc_txtAge = new GridBagConstraints();
		gbc_txtAge.insets = new Insets(5, 5, 5, 5);
		gbc_txtAge.gridwidth=2;
		gbc_txtAge.gridx = 0;
		gbc_txtAge.gridy = 6;
		studInfoPanel.add(txtAge, gbc_txtAge);
		

		txtBPlace = new JTextField();
		txtBPlace.setOpaque(false);
		txtBPlace.setForeground(Color.WHITE);
		txtBPlace.setBorder(new TitledBorder(new MatteBorder(0, 0, 1, 0, (Color) new Color(255, 255, 255)), "Place of Birth", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		txtBPlace.setPreferredSize(new Dimension(300,35));
		GridBagConstraints gbc_txtBPlace = new GridBagConstraints();
		gbc_txtBPlace.insets = new Insets(5, 5, 5, 5);
		gbc_txtBPlace.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtBPlace.gridx = 2;
		gbc_txtBPlace.gridy = 1;
		studInfoPanel.add(txtBPlace, gbc_txtBPlace);
		
	}
	
	public void initialize() {
		setBackground(Color.DARK_GRAY);
		setLayout(null);
	}
}
