import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;

import model1.ZipcodeListModel;
import model1.ZipcodeListModel01;
import model1.ZipcodeListModel02;

import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;
import javax.swing.ListSelectionModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class ZipcodeSearchUI05 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JList list;
	private JTextField textField1;
	private JTextField textField2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ZipcodeSearchUI05 frame = new ZipcodeSearchUI05();
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
	public ZipcodeSearchUI05() {
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
				if(list!=null) {
					String strDong = textField.getText();
					if(strDong.length() < 2) {
						JOptionPane.showMessageDialog(ZipcodeSearchUI05.this, "2글자 이상 입력해주세요.", "경고", JOptionPane.WARNING_MESSAGE);
					} else {
						//list.setModel(new ZipcodeListModel(strDong));	// 데이터 넣기
						//list.setModel(new ZipcodeListModel01(strDong));
						list.setModel(new ZipcodeListModel02(strDong));
					}
				}
			}
		});
		btn.setBounds(479, 36, 112, 29);
		panel.add(btn);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setBounds(10, 114, 615, 273);
		contentPane.add(scrollPane);

		list = new JList();
		list.setFont(new Font("굴림", Font.PLAIN, 19));
		list.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				textField1.setText((String)list.getSelectedValue());
			}
		});
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		scrollPane.setViewportView(list);

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
	}
}
