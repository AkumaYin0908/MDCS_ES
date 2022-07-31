package View.MainFrame.Swing;

import java.awt.Component;

import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;

import net.miginfocom.swing.MigLayout;

public class MenuAnimation {
	private final MigLayout layout;
	private final MenuItem menuItem;
	private Animator animator;
	private boolean open;
	
	
	public MenuAnimation(MigLayout layout, Component component) {
		this.layout=layout;
		this.menuItem=(MenuItem) component;
		initAnimator(component,200);
	}
	
	private void initAnimator(Component component, int duration) {
		int height = component.getPreferredSize().height;
		TimingTarget target=new TimingTargetAdapter() {
			
			public void timingEvent(float fraction) {
				float h;
				if(open) {
					h=40+((height-40)*fraction);
					menuItem.setAlpha(fraction);
				}
				else {
					h=40+((height-40)*(1f-fraction));
					menuItem.setAlpha(1f-fraction);
				}
				layout.setComponentConstraints(menuItem,"h " + h +"!");
				component.revalidate();
				component.repaint();
			}
		};
		animator=new Animator(duration, target);
		animator.setResolution(0);
		animator.setDeceleration(0.5f);
	}
	
	public void openMenu(){
		open=true;
		animator.start();
	}
	public void closeMenu() {
		open=false;
		animator.start();
	}
	
}
