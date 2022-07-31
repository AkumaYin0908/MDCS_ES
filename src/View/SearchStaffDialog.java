package View;


import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import OtherGUIFunctionalities.*;


public class SearchStaffDialog extends JDialog {

	DragListener drag;
	private JTextField txtSearch;
	private JTable table;
	private DefaultTableModel tableModel;
	private JButton btnSelect;
	private UserForm frmUser;
	
	
	public SearchStaffDialog(UserForm frmUser) {
		getContentPane().setBackground(Color.DARK_GRAY);
		this.frmUser=frmUser;
		setModal(true);
		drag=new DragListener();
		addMouseListener(drag);
		addMouseMotionListener(drag);
		setUndecorated(true);
		setBounds(100, 100, 360, 400);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		getRootPane().setBorder(BorderFactory.createLineBorder(new Color(128,0,0)));
		
		/**************************************************	TOP PANEL ****************************************/
		JPanel topPanel = new JPanel();
		topPanel.setBounds(0, 0, 370, 40);
		topPanel.setBackground(new Color(128, 0, 0));
		getContentPane().add(topPanel);
		topPanel.setLayout(null);
		
		JButton btnClose = new JButton();
		
		
		btnClose.setBorder(null);
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				dispose();
				
			}
		});
		
		String exitIconPath= new File("").getAbsolutePath()+"\\src\\icons\\cancel2.gif";
		ImageIcon icon=new ImageIcon(exitIconPath);
		Image exitIcon=icon.getImage().getScaledInstance(24,24,Image.SCALE_SMOOTH);
		
		String exitIconHoverPath= new File("").getAbsolutePath()+"\\src\\icons\\hover.gif";
		ImageIcon iconHover=new ImageIcon(exitIconHoverPath);
		Image exitIconHover=iconHover.getImage().getScaledInstance(24,24,Image.SCALE_DEFAULT);
		
		
		btnClose.setContentAreaFilled(false);
		btnClose.setIcon(new ImageIcon(exitIcon));
		btnClose.setRolloverIcon(new ImageIcon(exitIconHover));
		btnClose.setMargin(new Insets(0, 0, 0, 0));
		btnClose.setForeground(Color.WHITE);
		btnClose.setFont(new Font("Roboto", Font.BOLD, 12));
		btnClose.setBackground(new Color(128, 0, 0));
		btnClose.setBounds(330, 7, 24, 24);
		topPanel.add(btnClose);
		
		/**************************************************	SEARCH PANEL ****************************************/
		
		JPanel searchPanel = new JPanel();
		searchPanel.setBackground(Color.DARK_GRAY);
		searchPanel.setBorder(new MatteBorder(0, 0, 1, 0, (Color) Color.WHITE));
		searchPanel.setFont(new Font("Roboto", searchPanel.getFont().getStyle(), 28));
		searchPanel.setBounds(10, 50, 340, 40);
		getContentPane().add(searchPanel);
		searchPanel.setLayout(null);
		
		txtSearch = new HintTextField("Enter last name here.....");
		txtSearch.setForeground(Color.WHITE);
		txtSearch.setBorder(null);
		txtSearch.setBackground(SystemColor.inactiveCaptionBorder);
		txtSearch.setOpaque(false);
		txtSearch.setFont(new Font("Roboto", Font.PLAIN, 16));
		txtSearch.setToolTipText("");
		txtSearch.setBounds(10, 5, 320, 35);
		searchPanel.add(txtSearch);
		txtSearch.setColumns(10);
		
		/**************************************************	TABLE PANEL ****************************************/
		
		JPanel tablePanel = new JPanel();
		tablePanel.setBackground(Color.DARK_GRAY);
		tablePanel.setBorder(null);
		tablePanel.setBounds(10, 109, 340, 226);
		getContentPane().add(tablePanel);
		tablePanel.setLayout(null);
		
		tableModel=new DefaultTableModel(new Object[][] {
		},
		new String[] {
			"Staff ID", "Name","Position"}
	);
		table = new JTable() {
			public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
	            Component comp = super.prepareRenderer(renderer, row, column);
	            Color alternateColor =new Color(201,201,201);
	            Color whiteColor = Color.WHITE;
	            if(!comp.getBackground().equals(getSelectionBackground())) {
	               Color bg = (row % 2 == 0 ? alternateColor : whiteColor);
	               comp.setBackground(bg);
	               bg = null;
	            }
	            return comp;
	         }
		};
		table.setShowHorizontalLines(false);
		table.setShowGrid(false);
		table.setBounds(10, 11, 320, 204);
		table.setShowVerticalLines(false);
		table.setFocusTraversalKeysEnabled(false);
		table.setFillsViewportHeight(true);
		table.setSelectionForeground(Color.WHITE);
		table.setRowHeight(20);
		table.setRowMargin(0);
		table.setIntercellSpacing(new Dimension(0, 0));
		table.setFocusable(false);
		table.setGridColor(new Color(128, 0, 0));
		table.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		table.setSelectionBackground(new Color(165, 42, 42));
		table.setForeground(SystemColor.desktop);
		table.setFont(new Font("Roboto", Font.PLAIN, 12));
		table.setBackground(Color.DARK_GRAY);
		table.setModel(tableModel);
		table.getColumnModel().getColumn(0).setPreferredWidth(5);
		table.getColumnModel().getColumn(1).setPreferredWidth(100);
		
		DefaultTableCellRenderer r = new DefaultTableCellRenderer() {
		    /**
			 * 
			 */
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
		
		JScrollPane scroll = new JScrollPane(table);
		scroll.setBorder(new EmptyBorder(0, 0, 0, 0));
		scroll.setBounds(0, 0, 340,226);
		tablePanel.add(scroll);
		
		
		/**************************************************	BUTTON PANEL ****************************************/
		
		ImageIcon forSelectIcon=new ImageIcon(getClass().getResource("/icons/select.gif"));
		Image selectIcon=forSelectIcon.getImage().getScaledInstance(24,24,Image.SCALE_SMOOTH);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setBackground(Color.DARK_GRAY);
		buttonPanel.setBounds(10, 339, 340, 52);
		getContentPane().add(buttonPanel);
		buttonPanel.setLayout(null);
		
		btnSelect = new JButton("Select");
		btnSelect.setPreferredSize(new Dimension(90, 45));
		btnSelect.setMargin(new Insets(2, 14, 2, 2));
		btnSelect.setHorizontalAlignment(SwingConstants.LEFT);
		btnSelect.setForeground(Color.WHITE);
		btnSelect.setFont(new Font("Roboto", Font.BOLD, 12));
		btnSelect.setIcon(new ImageIcon(selectIcon));
		btnSelect.setBackground(new Color(128, 0, 0));
		btnSelect.setBounds(240, 3, 90, 45);
		buttonPanel.add(btnSelect);
		
		
		
	/***********************	GETTERS OF SEARCH PANEL COMPONENTS *********************/
		
	}
	public JTextField getSearchField() {
		return txtSearch;
	}
	
	/***********************	GETTERS OF TABLE PANEL COMPONENTS *********************/
	
	public JTable getTable() {
		return table;
	}
	
	public DefaultTableModel getTableModel() {
		return tableModel;
		
	}
	
	/***********************	GETTERS OF SELECT BUTTON	*********************/
	public JButton getSelectButton() {
		return btnSelect;
	}
}
