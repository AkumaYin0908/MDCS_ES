package View.MainFrame.Swing;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;

import View.MainFrame.Event.EventMenu;
import View.MainFrame.Event.EventMenuSelected;
import View.MainFrame.Model.ModelMenu;
import net.miginfocom.swing.MigLayout;

public class MenuItem extends JPanel {

	private float alpha;
	private ModelMenu menu;
	private boolean open;
	private EventMenuSelected eventSelected;
	private int index;
	 
	public MenuItem(ModelMenu menu, EventMenu event, EventMenuSelected eventSelected, int index) {
		setRequestFocusEnabled(false);
		this.menu=menu;
		this.eventSelected=eventSelected;
		this.index=index;
		setOpaque(false);
		setLayout(new MigLayout("wrap,fillx,insets 0","[fill]","[fill,40!]0[fill,35!]"));
		
		
		MenuButton firstItem=new MenuButton(menu.getIcon(),"      "+menu.getMenuName());
		
		firstItem.addActionListener((ActionEvent e)->{
			if(menu.getSubMenu().length>0) {
				if(event.menuPressed(MenuItem.this, !open)) {
					open=!open;
					
				}
			}
			eventSelected.menuSelected(index, -1);
		});
		
		add(firstItem);
		
		int subMenuIndex=-1;
		for(String st: menu.getSubMenu()) {
			MenuButton item= new MenuButton(st);
			item.setIndex(++subMenuIndex);
			item.setFocusable(false);
			item.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					eventSelected.menuSelected(index, item.getIndex());
				}
				
			});
			add(item); 
		}
	}

	public ModelMenu getMenu() {
		return menu;
	}

	public float getAlpha() {
		return alpha;
	}

	public void setAlpha(float alpha) {
		this.alpha = alpha;
	}

	
	public boolean isOpen() {
		return open;
	}

	public void setOpen(boolean open) {
		this.open = open;
	}

	public EventMenuSelected getEventSelected() {
		return eventSelected;
	}

	public void setEventSelected(EventMenuSelected eventSelected) {
		this.eventSelected = eventSelected;
	}

	public int getIndex() {
		return index;
	}

	@Override
	protected void paintComponent(Graphics g) {
		int width=getWidth();
		int height=getPreferredSize().height;
		Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(new Color(50,50,50));
        g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER,alpha));
        g2.fillRect(0, 2, width, 38);
        g2.setComposite(AlphaComposite.SrcOver);
        g2.fillRect(0, 40, width, height-40);
        g2.setColor(new Color(100,100,100));
        g2.drawLine(30, 40, 30, height-17);
        for(int i=0; i<menu.getSubMenu().length;i++) {
        	int y=((i+1) * 35 + 40)-17;
        	g2.drawLine(30, y, 38, y);
        }
        if (menu.getSubMenu().length>0) createArrowButton(g2);
		super.paintComponent(g);
	}

	private void createArrowButton(Graphics2D g2) {
		int size=4;
		int y=19;
		int x=205;
		g2.setColor(new Color(230,230,230));
		float ay=alpha*size;
		float ay1=(1f-alpha)*size;
		g2.drawLine(x, (int)(y+ay), x+4, (int)(y+ay1));
		g2.drawLine(x+4, (int)(y+ay1),x +8, (int)(y+ay));
	}
	

}
