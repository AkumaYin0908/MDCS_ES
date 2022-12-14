package View.StudentForm.Component;

import javax.swing.*;
import net.miginfocom.swing.MigLayout;
import java.awt.*;
import javax.swing.table.*;
import Model.GUICodingFormat;
import javax.swing.border.MatteBorder;


public class SibInfoPanel extends JPanel implements GUICodingFormat {
	
	private static final long serialVersionUID = 1L;
	private JPanel sibinfoPanel,buttonPanel;
	private JTable table;
	private DefaultTableModel tableModel;
	private JScrollPane scrollPane;
	private JButton btnConfirm;
	private JCheckBox chkSibling;
	
	
	public SibInfoPanel() {
		init();
		getComponent();
		
		

	}

	@Override
	public void init() {
		setOpaque(false);
		setLayout(null);
		
	}

	@Override
	public void getComponent() {
		sibinfoPanel = new JPanel();
		sibinfoPanel.setOpaque(false);
		sibinfoPanel.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(128, 0, 0)));
		sibinfoPanel.setBounds(10, 11, 680, 388);
		add(sibinfoPanel);
		sibinfoPanel.setLayout(new MigLayout("fillx", "[529.00]", "[][311.00][45.00]"));
		
		chkSibling = new JCheckBox("Do you have a sibling currently enrolled in Misericordia Dei Catholic School?");
		chkSibling.setFocusable(false);
		chkSibling.setRequestFocusEnabled(false);
		chkSibling.setForeground(Color.WHITE);
		chkSibling.setOpaque(false);
		chkSibling.setFont(new Font("Roboto", Font.PLAIN, 12));
		sibinfoPanel.add(chkSibling, "cell 0 0,growx,aligny top");
		
		
		
		tableModel=new DefaultTableModel(new Object[][] {
		},
		new String[] {
			"Student ID", "Name", "Grade Level", "Age"
		}
	);
		
		table = new JTable() {
		
			private static final long serialVersionUID = 1L;

			public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
	            Component comp = super.prepareRenderer(renderer, row, column);
	            Color alternateColor = new Color(201,201,201);
	            Color whiteColor = Color.WHITE;
	            if(!comp.getBackground().equals(getSelectionBackground())) {
	               Color bg = (row % 2 == 0 ? alternateColor : whiteColor);
	               comp.setBackground(bg);
	               bg = null;
	            }
	            return comp;
	         }
		};
		table.setAutoResizeMode(JTable.AUTO_RESIZE_NEXT_COLUMN);
		table.setRequestFocusEnabled(false);
		table.setOpaque(false);
		table.setBorder(null);
		table.setShowHorizontalLines(false);
		table.setShowGrid(false);
		table.setShowVerticalLines(false);
		table.setFocusTraversalKeysEnabled(false);
		table.setFillsViewportHeight(true);
		table.setSelectionForeground(Color.WHITE);
		table.setRowHeight(20);
		table.setRowMargin(0);
		table.setIntercellSpacing(new Dimension(0, 0));
		table.setFocusable(false);
		table.setGridColor(new Color(128, 0, 0));
		table.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
		table.setSelectionBackground(new Color(165, 42, 42));
		table.setForeground(SystemColor.desktop);
		table.setFont(new Font("Roboto", Font.PLAIN, 12));
		table.setBackground(Color.DARK_GRAY);
		table.setModel(tableModel);
		table.getColumnModel().getColumn(0).setPreferredWidth(5);
		table.getColumnModel().getColumn(1).setPreferredWidth(100);
		
		
		
		
		DefaultTableCellRenderer renderer = new DefaultTableCellRenderer() {
		   
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
		
		table.getTableHeader().setDefaultRenderer(renderer);
		table.getTableHeader().setReorderingAllowed(false);
		
		DefaultTableCellRenderer toCenter = new DefaultTableCellRenderer();
		toCenter.setHorizontalAlignment(JLabel.CENTER);
		for(int i=0;i<table.getColumnCount();i++) {
			table.getColumnModel().getColumn(i).setCellRenderer(toCenter);
		}
		
		
		scrollPane = new JScrollPane();
		scrollPane.setRequestFocusEnabled(false);
		scrollPane.setFocusable(false);
		scrollPane.setBorder(BorderFactory.createEmptyBorder());
		scrollPane.setOpaque(false);
		scrollPane.setViewportView(table);
		scrollPane.getViewport().setOpaque(false);
		sibinfoPanel.add(scrollPane, "cell 0 1,grow");
		
		buttonPanel = new JPanel();
		buttonPanel.setOpaque(false);
		sibinfoPanel.add(buttonPanel, "cell 0 2,grow");
		buttonPanel.setLayout(new CardLayout(100,0));
		
		btnConfirm = new JButton("Confirm");
		btnConfirm.setBackground(new Color(128, 0, 0));
		btnConfirm.setForeground(Color.WHITE);
		btnConfirm.setFont(new Font("Roboto", Font.PLAIN, 12));
		buttonPanel.add(btnConfirm);
		
	}

	public JTable getTable() {
		return table;
	}

	public DefaultTableModel getTableModel() {
		return tableModel;
	}

	public JButton getBtnConfirm() {
		return btnConfirm;
	}
	
}
