import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;

import model1.ZipcodeTableModel;
import model1.ZipcodeTableModel2;

import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;

public class ZipcodeSearchUI06 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField1;
	private JTextField textField2;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ZipcodeSearchUI06 frame = new ZipcodeSearchUI06();
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
	public ZipcodeSearchUI06() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 540);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "JPanel title", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 15, 615, 80);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblNewLabel = new JLabel("동이름");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 19));
		lblNewLabel.setBounds(17, 40, 63, 21);
		panel.add(lblNewLabel);

		textField = new JTextField();
		textField.setFont(new Font("굴림", Font.PLAIN, 19));
		textField.setBounds(97, 37, 365, 27);
		panel.add(textField);
		textField.setColumns(10);

		JButton btn = new JButton("검색");
		btn.setFont(new Font("굴림", Font.PLAIN, 19));
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String strDong = textField.getText();
				
				if(strDong.length() < 2) {
					JOptionPane.showMessageDialog(ZipcodeSearchUI06.this, "2글자 이상 입력해주세요.", "경고", JOptionPane.WARNING_MESSAGE);
				} else {
					//table.setModel(new ZipcodeTableModel(strDong));
					table.setModel(new ZipcodeTableModel2(strDong));
				}
			}
		});
		btn.setBounds(479, 36, 112, 29);
		panel.add(btn);

		textField1 = new JTextField();
		textField1.setFont(new Font("굴림", Font.PLAIN, 19));
		textField1.setEditable(false);
		textField1.setText("기본 주소");
		textField1.setBounds(10, 402, 612, 27);
		contentPane.add(textField1);
		textField1.setColumns(10);

		textField2 = new JTextField();
		textField2.setFont(new Font("굴림", Font.PLAIN, 19));
		textField2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(textField2.getText().equals("상세 주소")) {
					textField2.setText("");
				}
			}
		});
		textField2.setText("상세 주소");
		textField2.setBounds(10, 442, 612, 27);
		contentPane.add(textField2);
		textField2.setColumns(10);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(10, 114, 615, 273);
		contentPane.add(scrollPane);

		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int selectRow = table.getSelectedRow();
				String selectAddress = String.format("[%s] %s %s %s %s %s\n", 
						table.getValueAt(selectRow,0), table.getValueAt(selectRow,1), table.getValueAt(selectRow,2),
						table.getValueAt(selectRow,3), table.getValueAt(selectRow,4), table.getValueAt(selectRow,5));
				
				textField1.setText(selectAddress);
			}
		});

		scrollPane.setViewportView(table);
	}
}
