package OtherGUIFunctionalities;

import java.awt.Component;
import java.awt.Point;
import java.awt.event.MouseEvent;
import javax.swing.event.MouseInputAdapter;

public class DragListener extends MouseInputAdapter {
	
	Point location;
	MouseEvent pressed;
	
	public void mousePressed(MouseEvent e) {
		pressed=e;
	}
	
	public void mouseDragged(MouseEvent e) {
		Component component=e.getComponent();
		location=component.getLocation(location);
		int x=location.x-pressed.getX()+e.getX();
		int y=location.y-pressed.getY()+e.getY();
		component.setLocation(x,y);
	}
}
