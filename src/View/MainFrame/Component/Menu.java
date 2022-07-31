package View.MainFrame.Component;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import View.MainFrame.Component.Swing.Scrollbar.ScrollBarCustom;
import View.MainFrame.Event.EventMenu;
import View.MainFrame.Event.EventMenuSelected;
import View.MainFrame.Model.ModelMenu;
import View.MainFrame.Swing.MenuAnimation;
import View.MainFrame.Swing.MenuItem;
import net.miginfocom.swing.MigLayout;
import javax.swing.SwingConstants;

public class Menu extends JPanel {
	
	private JScrollPane scrollPane;
	private JPanel panel;
	private final MigLayout layout;
	private EventMenuSelected event;
	private boolean enableMenu=true;
	private boolean showMenu=true;
	
	public Menu() {
		setBorder(null);
		setOpaque(false);
		layout=new MigLayout("wrap, fillx, insets 0","fill","[]0[]");
		panel = new JPanel();
		panel.setOpaque(false);
		panel.setBounds(0, 70, 230, 530);
		panel.setLayout(layout);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(0, 129, 230, 446);
		scrollPane.setBorder(null);
		scrollPane.setOpaque(false);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setViewportBorder(null);
		scrollPane.getViewport().setOpaque(false);
		setLayout(null);
		ScrollBarCustom scrollBarCustom = new ScrollBarCustom();
		scrollBarCustom.setForeground(Color.WHITE);
		scrollPane.setVerticalScrollBar(scrollBarCustom);
		scrollPane.setViewportView(panel);
		add(scrollPane);
		
		JPanel profile = new JPanel();
		profile.setOpaque(false);
		profile.setBounds(0, 11, 230, 113);
		add(profile);
		profile.setLayout(null);
		
		
		
		JLabel lblNewLabel = new JLabel("Misericordia");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Elephant", Font.PLAIN, 24));
		lblNewLabel.setBounds(10, 5, 210, 45);
		profile.add(lblNewLabel);
		
		JLabel lblDei = new JLabel("Dei");
		lblDei.setForeground(Color.WHITE);
		lblDei.setFont(new Font("Elephant", Font.PLAIN, 24));
		lblDei.setBounds(10, 32, 210, 45);
		profile.add(lblDei);
		
		JLabel lblCatholicSchool = new JLabel("Catholic School");
		lblCatholicSchool.setForeground(Color.WHITE);
		lblCatholicSchool.setFont(new Font("Elephant", Font.PLAIN, 24));
		lblCatholicSchool.setBounds(10, 61, 210, 45);
		profile.add(lblCatholicSchool);
		
		
		}
		
		@Override
	    protected void paintComponent(Graphics g) {
	        Graphics2D g2 = (Graphics2D) g;
	        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
	        g2.setPaint(new Color(128,0,0));
	        g2.fillRect(0, 0, getWidth(), getHeight());
	        super.paintComponent(g);
	    }
		
		public void initMenuItem() {
			
			ImageIcon forStudIcon=new ImageIcon(getClass().getResource("/icons/students.png"));
			Image studIcon=forStudIcon.getImage().getScaledInstance(24,24,Image.SCALE_SMOOTH);
			
			ImageIcon forPayIcon=new ImageIcon(getClass().getResource("/icons/payment.png"));
			Image payIcon=forPayIcon.getImage().getScaledInstance(24,24,Image.SCALE_SMOOTH);
	
			ImageIcon forSetIcon=new ImageIcon(getClass().getResource("/icons/settings.png"));
			Image setIcon=forSetIcon.getImage().getScaledInstance(24,24,Image.SCALE_SMOOTH);
			
			ImageIcon forAbtIcon=new ImageIcon(getClass().getResource("/icons/about.png"));
			Image abtIcon=forAbtIcon.getImage().getScaledInstance(24,24,Image.SCALE_SMOOTH);
			
			ImageIcon forLogIcon=new ImageIcon(getClass().getResource("/icons/students.png"));
			Image logIcon=forLogIcon.getImage().getScaledInstance(24,24,Image.SCALE_SMOOTH);
			
			addMenu(new ModelMenu(new ImageIcon(studIcon), "Student", "Enroll Student", "Enrolled Students", "Students List","Student Profile"));
	        addMenu(new ModelMenu(new ImageIcon(payIcon), "Payment", "Pay Fees", "Payment History", "Student Balance"));
	        addMenu(new ModelMenu(new ImageIcon(setIcon), "Settings", "Section", "Fees", "Staff","User","Log History", "Backup/Restore Database"));
	        addMenu(new ModelMenu(new ImageIcon(abtIcon), "About"));
	        addMenu(new ModelMenu(new ImageIcon(logIcon), "Logout"));
	        
	        
		}

		private void addMenu(ModelMenu menu) {
			panel.add(new MenuItem(menu,getEventMenu(),event,panel.getComponentCount())," height 40!");
			
		}
		
		private EventMenu getEventMenu() {
			return new EventMenu() {

				@Override
				public boolean menuPressed(Component com, boolean open) {
					if(enableMenu) {
						if(showMenu) {
							if(open) {
								new MenuAnimation(layout,com).openMenu();
							}
							else {
								new MenuAnimation(layout,com).closeMenu();
							}
							return true;
						}
					
			
						else {
							System.out.println("Show pop up menu(Menu is closed)");
						}
						
					}
					return false;
				}};
		}
		public void addEvent(EventMenuSelected event) {
			this.event = event;
		}

		public void setEnableMenu(boolean enableMenu) {
			this.enableMenu = enableMenu;
		}


		public void setShowMenu(boolean showMenu) {
			this.showMenu = showMenu;
		}
}
