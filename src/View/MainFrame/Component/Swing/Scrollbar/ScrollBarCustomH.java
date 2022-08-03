package View.MainFrame.Component.Swing.Scrollbar;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JScrollBar;

public class ScrollBarCustomH extends JScrollBar{
	

    public ScrollBarCustomH() {
        setUI(new ModernScrollBarUIH());
        setPreferredSize(new Dimension(5, 5));
        setForeground(new Color(94, 139, 231));
        setUnitIncrement(20);
        setOpaque(false);
    }
}
