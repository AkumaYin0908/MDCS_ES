package View.StudentForm;

import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import OtherGUIFunctionalities.DragListener;
import View.Component.FormHeader;
import View.MainFrame.Component.Swing.Scrollbar.ScrollBarCustom;
import View.StudentForm.Component.ButtonPanel;
import View.StudentForm.Component.OtherPersonPanel;
import View.StudentForm.Component.ParInfoPanel;
import View.StudentForm.Component.RequirementsPanel;
import View.StudentForm.Component.SLAPanel;
import View.StudentForm.Component.SibInfoPanel;
import View.StudentForm.Component.StudInfoPanel;
import net.miginfocom.swing.MigLayout;
import javax.swing.border.LineBorder;
import Model.GUICodingFormat;

public class StudentForm extends JDialog implements GUICodingFormat {
	
	
	private static final long serialVersionUID = 1L;
	private FormHeader header;
	private DragListener drag;
	private MigLayout layout;
	private JScrollPane scrollPane;
	private JPanel mainPanel,contentPanel;
	private StudInfoPanel siPanel;
	private ParInfoPanel piPanel;
	private OtherPersonPanel opPanel;
	private SibInfoPanel sibiPanel;
	private SLAPanel slaPanel;
	private RequirementsPanel reqPanel;
	private ButtonPanel btnPanel;
	public StudentForm() {
		
		init();
		getComponent();
	}
	/**************************************************	INIT METHOD ****************************************/
	@Override
	public void init() {
		setModal(true);
		getContentPane().setBackground(Color.DARK_GRAY);
		drag=new DragListener();
		addMouseListener(drag);
		addMouseMotionListener(drag);
		
		layout=new MigLayout("", "0[]0[]0", "0[]10[grow]0");
		setUndecorated(true);
		setSize(840,717);
		setLocationRelativeTo(null);
		getContentPane().setLayout(layout);
		getRootPane().setBorder(BorderFactory.createLineBorder(new Color(128,0,0)));
			
	}
	
	/**************************************************	GETCOMPONENT METHOD ****************************************/
	@Override
	public void getComponent() {
		/**************************************************	HEADER ****************************************/
		header=new FormHeader();
		getContentPane().add(header, "cell 0 0,width 840!,height 40!");
		header.CloseButton().addActionListener((ActionEvent e)->{
			int reply=JOptionPane.showConfirmDialog(null, "Are you sure you want to cancel?","Are you sure?", JOptionPane.YES_NO_OPTION);
			
			if(reply==JOptionPane.YES_OPTION) {
				dispose();
			}
		});
		
		
		/**************************************************	MAIN PANEL ****************************************/
		mainPanel=new JPanel();
		mainPanel.setOpaque(false);
		getContentPane().add(mainPanel, "cell 0 1,width 840!,alignx center,height 650!");
		
		contentPanel=new JPanel();
		contentPanel.setBorder(null);
		contentPanel.setOpaque(false);
		
		scrollPane = new JScrollPane();
		scrollPane.setRequestFocusEnabled(false);
		scrollPane.setBorder(new LineBorder(new Color(128, 0, 0)));
		scrollPane.setFocusable(false);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setOpaque(false);
		scrollPane.setViewportBorder(null);
		scrollPane.getViewport().setOpaque(false);
		scrollPane.setViewportView(contentPanel);
		contentPanel.setLayout(new MigLayout("", "[]", "[482.00][][][]"));
		
		
		ScrollBarCustom scrollBarCutsom=new ScrollBarCustom();
		scrollBarCutsom.setForeground(Color.WHITE);
		mainPanel.setLayout(new MigLayout("", "[839px]", "[2036px]"));
		scrollPane.setVerticalScrollBar(scrollBarCutsom);
		mainPanel.add(scrollPane, "cell 0 0,alignx left,aligny top");
		
		siPanel=new StudInfoPanel();
		
		contentPanel.add(siPanel,"cell 0 0,width 820!,alignx center,height 560!");
		
		
		piPanel=new ParInfoPanel();
		contentPanel.add(piPanel,"cell 0 1,width 700!,alignx center,height 710!");
		
		opPanel=new OtherPersonPanel();
		contentPanel.add(opPanel,"cell 0 2,width 700!,alignx center, height 380!");
		
		sibiPanel=new SibInfoPanel();
		contentPanel.add(sibiPanel,"cell 0 3, width 700!, alignx center,height 410!");
		
		slaPanel=new SLAPanel();
		contentPanel.add(slaPanel,"cell 0 4, width 700!, alignx center,height 365!");
		
		reqPanel=new RequirementsPanel();
		contentPanel.add(reqPanel,"cell 0 5, width 700!, alignx center,height 95!");
		
		btnPanel=new ButtonPanel();
		contentPanel.add(btnPanel,"cell 0 6,width 450!, alignx center, height 60!");
		
	}
	public void setSiPanel(StudInfoPanel siPanel) {
		this.siPanel = siPanel;
	}
	public void setPiPanel(ParInfoPanel piPanel) {
		this.piPanel = piPanel;
	}
	public void setOpPanel(OtherPersonPanel opPanel) {
		this.opPanel = opPanel;
	}
	public void setSibiPanel(SibInfoPanel sibiPanel) {
		this.sibiPanel = sibiPanel;
	}
	public void setSlaPanel(SLAPanel slaPanel) {
		this.slaPanel = slaPanel;
	}
	public void setReqPanel(RequirementsPanel reqPanel) {
		this.reqPanel = reqPanel;
	}
	public void setBtnPanel(ButtonPanel btnPanel) {
		this.btnPanel = btnPanel;
	}
	
	
}