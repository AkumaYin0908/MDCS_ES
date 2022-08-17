package View.StudentForm.Component;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.*;

import Model.GUICodingFormat;
import net.miginfocom.swing.MigLayout;
import javax.swing.border.LineBorder;

public class SLAPanel extends JPanel implements GUICodingFormat{

	
	private static final long serialVersionUID = 1L;
	private JPanel slaPanel;
	private JTable table;
	private DefaultTableModel tableModel;
	private JButton btnAdd,btnEdit,btnDelete;
	
	public SLAPanel() {
		init();
		getComponent();
		

	}
	/**************************************************	INIT METHOD ****************************************/
	@Override
	public void init() {
		setOpaque(false);
		setBorder(new LineBorder(new Color(128, 0, 0)));
		setLayout(null);
		
		
	}


	/**************************************************	GETCOMPONENT METHOD ****************************************/
	@Override
	public void getComponent() {
		/**************************************************	SCHOOL LAST ATTENDED PANEL ****************************************/
		slaPanel = new JPanel();
		slaPanel.setOpaque(false);
		slaPanel.setBounds(10, 11, 685, 280);
		add(slaPanel);
		slaPanel.setLayout(new MigLayout("", "[grow,fill]", "[fill]"));
		

		tableModel=new DefaultTableModel(new Object[][] {
		},
		new String[] {
			"School", "Address", "Grade Level", "Period Covered"
		}
	);
		
		table = new JTable() {
			/**
			 * 
			 */
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
		table.getColumnModel().getColumn(0).setPreferredWidth(170);
		table.getColumnModel().getColumn(1).setPreferredWidth(170);
		
		
		
		
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
		
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setRequestFocusEnabled(false);
		scrollPane.setFocusable(false);
		scrollPane.setBorder(BorderFactory.createEmptyBorder());
		scrollPane.setOpaque(false);
		scrollPane.setViewportView(table);
		scrollPane.getViewport().setOpaque(false);
		slaPanel.add(scrollPane, "cell 0 0,grow");
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setOpaque(false);
		buttonPanel.setBounds(10, 295, 685, 64);
		add(buttonPanel);
		buttonPanel.setLayout(new MigLayout("", "175[grow][grow][grow]175", "[]"));
		
		btnAdd = new JButton("Add");
		btnAdd.setPreferredSize(new Dimension(90, 45));
		btnAdd.setMargin(new Insets(2, 14, 2, 2));
		btnAdd.setHorizontalAlignment(SwingConstants.LEFT);
		btnAdd.setForeground(Color.WHITE);
		btnAdd.setFont(new Font("Roboto", Font.BOLD, 12));
		btnAdd.setBackground(new Color(128, 0, 0));
		buttonPanel.add(btnAdd, "cell 0 0,alignx left,aligny top");
		
		btnEdit = new JButton("Edit");
		btnEdit.setPreferredSize(new Dimension(90, 45));
		btnEdit.setMargin(new Insets(2, 14, 2, 2));
		btnEdit.setHorizontalAlignment(SwingConstants.LEFT);
		btnEdit.setForeground(Color.WHITE);
		btnEdit.setFont(new Font("Roboto", Font.BOLD, 12));
		btnEdit.setEnabled(false);
		btnEdit.setBackground(new Color(128, 0, 0));
		buttonPanel.add(btnEdit, "cell 1 0,alignx left,aligny top");
		
		btnDelete = new JButton("Delete");
		btnDelete.setPreferredSize(new Dimension(90, 45));
		btnDelete.setMargin(new Insets(2, 14, 2, 2));
		btnDelete.setHorizontalAlignment(SwingConstants.LEFT);
		btnDelete.setForeground(Color.WHITE);
		btnDelete.setFont(new Font("Roboto", Font.BOLD, 12));
		btnDelete.setEnabled(false);
		btnDelete.setBackground(new Color(128, 0, 0));
		buttonPanel.add(btnDelete, "cell 2 0,alignx left,aligny top");
		
	}
	
	
	
	public JTable getTable(){
		return table;
	}
	public DefaultTableModel getTableModel() {
		return tableModel;
	}

	public JButton getBtnAdd() {
		return btnAdd;
	}

	public JButton getBtnEdit() {
		return btnEdit;
	}
	
	public JButton getBtnDelete() {
		return btnDelete;
	}



	
	
	
	
}
