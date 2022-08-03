package View;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JLabel;
import OtherGUIFunctionalities.DragListener;
import View.Component.FormHeader;
import View.MainFrame.Component.Swing.Scrollbar.ScrollBarCustom;
import net.miginfocom.swing.MigLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import java.awt.Insets;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;

public class StaffForm extends JDialog {
	
	private MigLayout layout;
	private DragListener drag;
	private JTable table;
	private DefaultTableModel tableModel;
	private JScrollPane scrollPane;
	private JPanel tablePanel;
	private JPanel buttonPanel;
	private JButton btnAdd;
	private JButton btnEdit;
	private JButton btnSave;
	private JButton btnDelete;
	
	/**************************************************	STAFFFORM CONSTRUCTOR ****************************************/
	
	public StaffForm() {
		initialize();
		init();
	}
	
	/**************************************************	INIT METHOD ****************************************/
	public void init() {
		
		/**************************************************	HEADER ****************************************/
		FormHeader header=new FormHeader();
		getContentPane().add(header, "cell 0 0,width 480!,height 40!");
		header.CloseButton().addActionListener((ActionEvent e)->{
			dispose();
		});
	
		/**************************************************	TABLE PANEL ****************************************/
		JPanel tablePanel = new JPanel();
		tablePanel.setOpaque(false);
		getContentPane().add(tablePanel, "cell 0 1,height 315!");
		tablePanel.setLayout(new MigLayout("", "[480px]", "[325px]"));

		tableModel=new DefaultTableModel(new Object[][] {
		},
		new String[] {
			"Staff ID", "Name", "Position", "Status"
		}
	);
		
		table = new JTable() {
			public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
	            Component comp = super.prepareRenderer(renderer, row, column);
	            Color alternateColor = new Color(201,201,201);
	            Color whiteColor = Color.WHITE;
	            Color blackColor=Color.BLACK;
	            if(!comp.getBackground().equals(getSelectionBackground())) {
	               Color bg = (row % 2 == 0 ? alternateColor : whiteColor);
	               Color sbg=(row%2==0?blackColor:whiteColor);
	               comp.setBackground(bg);
	               table.setSelectionForeground(sbg);
	               bg = null;
	               
	            }
	            return comp;
	         }
		
		};
		table.setSelectionForeground(new Color(0, 0, 0));
		table.setShowVerticalLines(false);
		table.setShowHorizontalLines(false);
		table.setSelectionBackground(new Color(165, 42, 42));
		table.setOpaque(false);
		table.setBorder(new EmptyBorder(0,0,0,0));
		table.setBackground(Color.DARK_GRAY);
		table.setModel(tableModel);
		table.setShowGrid(false);
		table.setFocusable(false);
		
		table.setIntercellSpacing(new Dimension(0, 0));
		table.getColumnModel().getColumn(0).setPreferredWidth(5);
		table.getColumnModel().getColumn(1).setPreferredWidth(100);
		
		
		
		
		DefaultTableCellRenderer r = new DefaultTableCellRenderer() {
		   
			private static final long serialVersionUID = 1L;
			Font font = new Font("Roboto",Font.BOLD,12);

		    @Override
		    public Component getTableCellRendererComponent(JTable table,
		            Object value, boolean isSelected, boolean hasFocus,
		            int row, int column) {
		        super.getTableCellRendererComponent(table, value, isSelected, hasFocus,
		                row, column);
		        
		        setBorder(null);
		        setFont(font);
		        setBackground(new Color(128,0,0));
		        setForeground(Color.white);
		        setPreferredSize(new Dimension(10,25));
		        setHorizontalAlignment(JLabel.CENTER);
		        return this;
		    }

		};
		
		table.getTableHeader().setDefaultRenderer(r);
		table.getTableHeader().setReorderingAllowed(false);
		DefaultTableCellRenderer toCenter = new DefaultTableCellRenderer();
		toCenter.setHorizontalAlignment(JLabel.CENTER);
		for(int i=0;i<table.getColumnCount();i++) {
			table.getColumnModel().getColumn(i).setCellRenderer(toCenter);
		}
		
		
		
		scrollPane = new JScrollPane(table);
		scrollPane.setOpaque(false);
		scrollPane.setBorder(new EmptyBorder(0, 0, 0, 0));
		scrollPane.setViewportBorder(null);
		scrollPane.getViewport().setOpaque(false);
		//scrollPane.setViewportView(table);
		ScrollBarCustom scrollBarCustom = new ScrollBarCustom();
		scrollBarCustom.setForeground(Color.WHITE);
		scrollPane.setVerticalScrollBar(scrollBarCustom);
		
		tablePanel.add(scrollPane, "cell 0 0,grow");
		/**************************************************	BUTTON PANEL ****************************************/
		
		ImageIcon forAddIcon=new ImageIcon(getClass().getResource("/icons/adduser.gif"));
		Image addIcon=forAddIcon.getImage().getScaledInstance(24,24,Image.SCALE_SMOOTH);
		
		
		ImageIcon forEditIcon=new ImageIcon(getClass().getResource("/icons/edituser.gif"));
		Image editIcon=forEditIcon.getImage().getScaledInstance(24,24,Image.SCALE_SMOOTH);
		
		
		ImageIcon forDeleteIcon=new ImageIcon(getClass().getResource("/icons/deleteuser.gif"));
		Image deleteIcon=forDeleteIcon.getImage().getScaledInstance(24,24,Image.SCALE_SMOOTH);
		
		
		
		ImageIcon forSaveIcon=new ImageIcon(getClass().getResource("/icons/save.gif"));
		Image saveIcon=forSaveIcon.getImage().getScaledInstance(24,24,Image.SCALE_SMOOTH);
		
		buttonPanel = new JPanel();
		buttonPanel.setOpaque(false);
		getContentPane().add(buttonPanel, "cell 0 2, height 60!");
		buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		btnAdd = new JButton("Add");
		btnAdd.setPreferredSize(new Dimension(90, 45));
		btnAdd.setMargin(new Insets(2, 14, 2, 2));
		btnAdd.setHorizontalAlignment(SwingConstants.LEFT);
		btnAdd.setForeground(Color.WHITE);
		btnAdd.setFont(new Font("Roboto", Font.BOLD, 12));
		btnAdd.setBackground(new Color(128, 0, 0));
		btnAdd.setIcon(new ImageIcon(addIcon));
		buttonPanel.add(btnAdd);
		
		btnDelete = new JButton("Delete");
		btnDelete.setPreferredSize(new Dimension(90, 45));
		btnDelete.setMargin(new Insets(2, 14, 2, 2));
		btnDelete.setHorizontalAlignment(SwingConstants.LEFT);
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setFont(new Font("Roboto", Font.BOLD, 12));
		btnDelete.setEnabled(false);
		btnDelete.setBackground(new Color(128, 0, 0));
		btnDelete.setIcon(new ImageIcon(deleteIcon));
		buttonPanel.add(btnDelete);
		
		btnEdit = new JButton("Edit");
		btnEdit.setPreferredSize(new Dimension(90, 45));
		btnEdit.setMargin(new Insets(2, 14, 2, 2));
		btnEdit.setHorizontalAlignment(SwingConstants.LEFT);
		btnEdit.setForeground(Color.WHITE);
		btnEdit.setFont(new Font("Roboto", Font.BOLD, 12));
		btnEdit.setEnabled(false);
		btnEdit.setBackground(new Color(128, 0, 0));
		btnEdit.setIcon(new ImageIcon(editIcon));
		buttonPanel.add(btnEdit);
		
		btnSave = new JButton("Save");
		btnSave.setPreferredSize(new Dimension(90, 45));
		btnSave.setMargin(new Insets(2, 14, 2, 2));
		btnSave.setHorizontalAlignment(SwingConstants.LEFT);
		btnSave.setForeground(Color.WHITE);
		btnSave.setFont(new Font("Roboto", Font.BOLD, 12));
		btnSave.setEnabled(false);
		btnSave.setBackground(new Color(128, 0, 0));
		btnSave.setIcon(new ImageIcon(saveIcon));
		buttonPanel.add(btnSave);
	}
	
	/**************************************************	INITIALIZE METHOD ****************************************/
	public void initialize() {
		setModal(true);
		getContentPane().setBackground(Color.DARK_GRAY);
		drag=new DragListener();
		addMouseListener(drag);
		addMouseMotionListener(drag);
		
		layout=new MigLayout("fillx", "0[fill]0", "0[40.00,top,fill]0[]0[grow]0[]0");//"fill", "0[]0[100%,fill]0", "0[top,fill]0[]0"
		setUndecorated(true);
		setBounds(100, 100, 480, 420);
		setLocationRelativeTo(null);
		getContentPane().setLayout(layout);
		getRootPane().setBorder(BorderFactory.createLineBorder(new Color(128,0,0)));
		
	}

	

	public JTable getTable() {
		return table;
	}

	public DefaultTableModel getTableModel() {
		return tableModel;
	}


	public JPanel getTablePanel() {
		return tablePanel;
	}

	public JPanel getButtonPanel() {
		return buttonPanel;
	}

	public JButton getBtnAdd() {
		return btnAdd;
	}

	public JButton getBtnEdit() {
		return btnEdit;
	}

	public JButton getBtnSave() {
		return btnSave;
	}

	public JButton getBtnDelete() {
		return btnDelete;
	}
	
	
}
