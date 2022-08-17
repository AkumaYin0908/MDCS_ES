package View.StudentForm.Component;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import net.miginfocom.swing.MigLayout;


public class RequirementsPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JPanel requirementsPanel;
	private JCheckBox chkNSO,chkECD, chkF137,chkBaptismal;
	
	/**************************************************	CONSTRUCTOR ****************************************/
	public RequirementsPanel() {
		init();
		getComponent();
		
	
	}
	
	/**************************************************	GETCOMPONENT METHOD ****************************************/
	public void getComponent() {
		
		/**************************************************	REQUIREMENTS PANEL ****************************************/
		requirementsPanel=new JPanel();
		requirementsPanel.setBackground(Color.DARK_GRAY);
		requirementsPanel.setBounds(5, 10, 685, 75);
		
		requirementsPanel.setBorder(new TitledBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 255, 255)), 
				"Requirements", TitledBorder.LEADING, TitledBorder.TOP, new Font("Roboto",Font.PLAIN,12), Color.WHITE));
		
		requirementsPanel.setLayout(new MigLayout("", "[]", "[grow]"));
		
		chkNSO = new JCheckBox("NSO Certificate");
		chkNSO.setFocusable(false);
		chkNSO.setRequestFocusEnabled(false);
		chkNSO.setForeground(Color.WHITE);
		chkNSO.setOpaque(false);
		chkNSO.setFont(new Font("Roboto", Font.PLAIN, 12));
		requirementsPanel.add(chkNSO, "cell 0 0,growx,aligny top");
		
		chkECD = new JCheckBox("<html>ECD Checklist<br><center>(for Grade I)</center></html>");
		chkECD.setFocusable(false);
		chkECD.setRequestFocusEnabled(false);
		chkECD.setOpaque(false);
		chkECD.setForeground(Color.WHITE);
		chkECD.setFont(new Font("Roboto", Font.PLAIN, 12));
		requirementsPanel.add(chkECD, "cell 0 0,growx,aligny top");
		
		chkF137 = new JCheckBox("<html>Card/Form 137 or <br> any documents from last school attended</html>");
		chkF137.setFocusable(false);
		chkF137.setRequestFocusEnabled(false);
		chkF137.setVerticalAlignment(SwingConstants.TOP);
		chkF137.setOpaque(false);
		chkF137.setForeground(Color.WHITE);
		chkF137.setFont(new Font("Roboto", Font.PLAIN, 12));
		requirementsPanel.add(chkF137, "cell 0 0,alignx center,growy");
		
		chkBaptismal = new JCheckBox("Baptismal Certificate");
		chkBaptismal.setFocusable(false);
		chkBaptismal.setRequestFocusEnabled(false);
		chkBaptismal.setOpaque(false);
		chkBaptismal.setForeground(Color.WHITE);
		chkBaptismal.setFont(new Font("Roboto", Font.PLAIN, 12));
		requirementsPanel.add(chkBaptismal, "cell 0 0,growx,aligny top");
		add(requirementsPanel);
	}
	
	/**************************************************	INIT METHOD ****************************************/
	public void init() {
		setOpaque(false);
		setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(128, 0, 0)));
		setBackground(Color.DARK_GRAY);
		setLayout(null);
	}

}
