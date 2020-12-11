import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.border.TitledBorder;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.table.DefaultTableModel;

public class SearchEmpUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchEmpUI frame = new SearchEmpUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SearchEmpUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 831, 688);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "JPanel title", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(16, 24, 695, 75);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("사원이름");
		lblNewLabel.setBounds(16, 30, 84, 21);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 19));
		
		textField = new JTextField();
		textField.setBounds(117, 27, 415, 27);
		panel.add(textField);
		textField.setFont(new Font("굴림", Font.PLAIN, 19));
		textField.setColumns(10);
		
		JButton btn = new JButton("검색");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				String strEname = textField.getText();
				
				table.setModel(new EmpTableModel(strEname));
				table.getColumnModel().getColumn(0).setResizable(false);
				table.getColumnModel().getColumn(0).setPreferredWidth(70);
				table.getColumnModel().getColumn(1).setResizable(false);
				table.getColumnModel().getColumn(1).setPreferredWidth(90);
				table.getColumnModel().getColumn(2).setResizable(false);
				table.getColumnModel().getColumn(2).setPreferredWidth(120);
				table.getColumnModel().getColumn(3).setResizable(false);
				table.getColumnModel().getColumn(3).setPreferredWidth(90);
				table.getColumnModel().getColumn(4).setResizable(false);
				table.getColumnModel().getColumn(4).setPreferredWidth(40);
				table.getColumnModel().getColumn(5).setResizable(false);
				table.getColumnModel().getColumn(5).setPreferredWidth(55);
				table.getColumnModel().getColumn(6).setResizable(false);
				table.getColumnModel().getColumn(6).setPreferredWidth(110);
				table.getColumnModel().getColumn(7).setResizable(false);
				table.getColumnModel().getColumn(7).setPreferredWidth(152);
			}
		});
		btn.setFont(new Font("굴림", Font.PLAIN, 19));
		btn.setBounds(549, 27, 129, 29);
		panel.add(btn);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(16, 115, 695, 434);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"\uC0AC\uC6D0\uBC88\uD638", "\uC0AC\uC6D0\uC774\uB984", "\uC9C1\uCC45", "\uAE09\uC5EC", "\uD638\uBD09", "\uBD80\uC11C\uBC88\uD638", "\uBD80\uC11C\uC704\uCE58", "\uBD80\uC11C\uC774\uB984"
			}
		) {
			boolean[] columnEditables = new boolean[] {
				false, false, false, false, false, false, false, true
			};
			public boolean isCellEditable(int row, int column) {
				return columnEditables[column];
			}
		});
		
		table.setFont(new Font("굴림", Font.PLAIN, 17));
		scrollPane.setViewportView(table);
	}
}
