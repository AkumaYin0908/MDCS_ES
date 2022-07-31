package View.MainFrame;


/* Inspired by  Ra Ven for the swing design YT: https://www.youtube.com/c/HelloWorld-Raven*/

import javax.swing.*;
import OtherGUIFunctionalities.DragListener;
import View.MainFrame.Component.Header;
import View.MainFrame.Component.Menu;
import View.MainFrame.Event.EventMenuSelected;
import View.MainFrame.Form.MainForm;
import net.miginfocom.swing.MigLayout;
import java.awt.Color;
import java.awt.CardLayout;
import javax.swing.border.MatteBorder;
import Model.Staff;
import Model.User;

public class MainFrame extends JFrame{

	private MigLayout layout;
	private Menu menu;
	private Header header;
	private MainForm main;
	private JLayeredPane bgLayer;
	private DragListener drag;
	
	public MainFrame() {
		
		initialize();
		init();
		
		}

		private void init() {
			layout=new MigLayout("fill", "0[]0[100%,fill]0", "0[top,fill]0[]0");
			bgLayer.setLayout(layout);
			menu=new Menu();
			menu.setAlignmentY(0.0f);
			menu.setAlignmentX(0.0f);
			menu.addEvent(new EventMenuSelected() {

				@Override
				public void menuSelected(int menuIndex, int subMenuIndex) {
					System.out.println("Menu Index: " + menuIndex + " Sub Menu Index: " + subMenuIndex);
					switch(menuIndex) {
					
					case 0:
						switch(subMenuIndex) {
						case 0:
						break;
						case 1:
						break;
						case 2:
						break;
						case 3:
						break;
						}
					break;
					case 1:
						switch(subMenuIndex) {
						case 0:
						break;
						case 1:
						break;
						case 2:
						break;
						}
					break;
					case 2:
						switch(subMenuIndex) {
						case 0:
						break;
						case 1:
						break;
						case 2:
							
						break;
						case 3:
							
							
						break;
						case 4:
						break;
						case 5:
						break;
						}
					break;
					case 3:
					break;
					case 4: System.exit(0);
					break;
					}
				}
				
			});
			menu.initMenuItem();
			header=new Header();
			header.setBorder(new MatteBorder(0, 0, 2, 0, (Color) Color.GRAY));
			header.setBackground(Color.DARK_GRAY);
			main=new MainForm();
			bgLayer.add(menu, "cell 0 0 1 2,width 230!");    // Span Y 2cell
	        bgLayer.add(header, "cell 1 0,height 50!");
	        bgLayer.add(main, "cell 1 1,width 100%,height 100%");
			
		}
	private void initialize() {
		drag=new DragListener();
		addMouseListener(drag);
		addMouseMotionListener(drag);
		setUndecorated(true);
		setBounds(100, 100, 1000, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new CardLayout(0, 0));
		setLocationRelativeTo(null);
		bgLayer = new JLayeredPane();
		bgLayer.setAlignmentY(0.0f);
		bgLayer.setAlignmentX(0.0f);
		bgLayer.setOpaque(true);
		bgLayer.setBackground(Color.DARK_GRAY);
		getContentPane().add(bgLayer);
	}
}
