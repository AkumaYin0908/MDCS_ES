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
import View.StudentForm.Component.SibInfoPanel;
import View.StudentForm.Component.StudInfoPanel;
import net.miginfocom.swing.MigLayout;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionListener;

public class StudentForm extends JDialog {
	
	private FormHeader header;
	private DragListener drag;
	private MigLayout layout;
	private JScrollPane scrollPane;
	private JPanel mainPanel;
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
			scrollPane = new JScrollPane();
			scrollPane.setRequestFocusEnabled(false);
			scrollPane.setBorder(null);
			scrollPane.setFocusable(false);
			scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
			scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
			scrollPane.setOpaque(false);
			scrollPane.setViewportBorder(null);
			scrollPane.getViewport().setOpaque(false);
			scrollPane.setViewportView(mainPanel);
			mainPanel.setLayout(new MigLayout("", "[]", "[][]"));
			
			
			ScrollBarCustom scrollBarCutsom=new ScrollBarCustom();
			scrollBarCutsom.setForeground(Color.WHITE);
			scrollPane.setVerticalScrollBar(scrollBarCutsom);
			getContentPane().add(scrollPane, "cell 0 1");
			
			StudInfoPanel siPanel=new StudInfoPanel();
			
			mainPanel.add(siPanel,"cell 0 0,width 820!,alignx center,height 500!");
			
			
			ParInfoPanel piPanel=new ParInfoPanel();
			mainPanel.add(piPanel,"cell 0 1,width 700!,alignx center,height 710!");
			
			OtherPersonPanel opPanel=new OtherPersonPanel();
			mainPanel.add(opPanel,"cell 0 2,width 700!,alignx center,height 390!");
			
			SibInfoPanel sibiPanel=new SibInfoPanel();
			mainPanel.add(sibiPanel,"cell 0 3, width 550!, alignx center,height 410!");
			
			RequirementsPanel reqPanel=new RequirementsPanel();
			mainPanel.add(reqPanel,"cell 0 3, width 175!,alignx right,height 205!");
	}
	
	public void initialize() {
		setModal(true);
		getContentPane().setBackground(Color.DARK_GRAY);
		drag=new DragListener();
		addMouseListener(drag);
		addMouseMotionListener(drag);
		
		layout=new MigLayout("fill", "0[grow]0[grow]0", "0[40.00,top,fill]10[grow]0");
		setUndecorated(true);
		setSize(840,717);
		setLocationRelativeTo(null);
		getContentPane().setLayout(layout);
		getRootPane().setBorder(BorderFactory.createLineBorder(new Color(128,0,0)));
	}
}