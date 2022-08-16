package View.StudentForm;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.*;

import OtherGUIFunctionalities.DragListener;
import View.Component.FormHeader;
import View.MainFrame.Component.Swing.Scrollbar.ScrollBarCustom;
import View.StudentForm.Component.OtherPersonPanel;
import View.StudentForm.Component.ParInfoPanel;
import View.StudentForm.Component.RequirementsPanel;
import View.StudentForm.Component.SLAPanel;
import View.StudentForm.Component.SibInfoPanel;
import View.StudentForm.Component.StudInfoPanel;
import net.miginfocom.swing.MigLayout;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.border.LineBorder;

public class StudentForm extends JDialog {
	
	private FormHeader header;
	private DragListener drag;
	private MigLayout layout;
	private JScrollPane scrollPane;
	private JPanel mainPanel,contentPanel;
	public StudentForm() {
		initialize();
		init();
	}
	
	public void init() {
			
			/**************************************************	HEADER ****************************************/
			header=new FormHeader();
			getContentPane().add(header, "cell 0 0,width 840!,height 40!");
			header.CloseButton().addActionListener((ActionEvent e)->{
				int reply=JOptionPane.showConfirmDialog(null, "Are you sure you want to cancel?","Are you sure?", JOptionPane.YES_NO_OPTION);
				
				if(reply==JOptionPane.YES_OPTION) {
					dispose();
				}
			});
			
			
			
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
			
			StudInfoPanel siPanel=new StudInfoPanel();
			
			contentPanel.add(siPanel,"cell 0 0,width 820!,alignx center,height 480!");
			
			
			ParInfoPanel piPanel=new ParInfoPanel();
			contentPanel.add(piPanel,"cell 0 1,width 700!,alignx center,height 710!");
			
			OtherPersonPanel opPanel=new OtherPersonPanel();
			contentPanel.add(opPanel,"cell 0 2,width 700!,alignx center, height 380!");
			
			SibInfoPanel sibiPanel=new SibInfoPanel();
			contentPanel.add(sibiPanel,"cell 0 3, width 550!, alignx center,height 410!");
			
			SLAPanel slaPanel=new SLAPanel();
			contentPanel.add(slaPanel,"cell 0 4, width 700!, alignx center,height 365!");
			
	}
	
	public void initialize() {
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
}