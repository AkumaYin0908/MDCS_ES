package View.MainFrame.Component;

import javax.swing.JPanel;
import java.awt.Dimension;
import java.awt.SystemColor;
import java.awt.Color;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;

public class Header extends JPanel {

	/**
	 * Create the panel.
	 */
	public Header() {
		setBorder(new EtchedBorder(EtchedBorder.RAISED, Color.DARK_GRAY, null));
		setBackground(Color.DARK_GRAY);
		

	}

}
