package View.StudentForm;

import java.awt.Color;
import java.awt.event.ActionEvent;

import javax.swing.*;

import OtherGUIFunctionalities.DragListener;
import View.Component.FormHeader;
import View.StudentForm.Component.InfoPanel;
import net.miginfocom.swing.MigLayout;

public class StudentForm extends JDialog {
	
	private FormHeader header;
	private DragListener drag;
	private MigLayout layout;
	private JPanel mainPanel;
	private InfoPanel infoPanel;
	public StudentForm() {
		initialize();
		init();
	}
	
	public void init() {
			
			/**************************************************	HEADER ****************************************/
			header=new FormHeader();
			getContentPane().add(header, "cell 0 0,width 950!,height 40!");
			header.CloseButton().addActionListener((ActionEvent e)->{
				int reply=JOptionPane.showConfirmDialog(null, "Are you sure you want to cancel?","Are you sure?", JOptionPane.YES_NO_OPTION);
				
				if(reply==JOptionPane.YES_OPTION) {
					dispose();
				}
			});
			
			
			infoPanel=new InfoPanel();
			getContentPane().add(infoPanel, "cell 0 1 ,center,width 930!");
			
			
			
			
			
			
	}
	
	public void initialize() {
		setModal(true);
		getContentPane().setBackground(Color.DARK_GRAY);
		drag=new DragListener();
		addMouseListener(drag);
		addMouseMotionListener(drag);
		
		layout=new MigLayout("fillx", "0[]0[]0", "0[40.00,top,fill]10[fill,grow]10");
		setUndecorated(true);
		setSize(950,650);
		setLocationRelativeTo(null);
		getContentPane().setLayout(layout);
		getRootPane().setBorder(BorderFactory.createLineBorder(new Color(128,0,0)));
	}
}