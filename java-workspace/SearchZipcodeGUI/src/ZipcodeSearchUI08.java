
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class ZipcodeSearchUI08 extends JFrame {

	private JPanel contentPane;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JTextField textField4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ZipcodeSearchUI08 frame = new ZipcodeSearchUI08();
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
	public ZipcodeSearchUI08() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 554, 640);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textField1 = new JTextField();
		textField1.setFont(new Font("굴림", Font.PLAIN, 16));
		textField1.setEditable(false);
		textField1.setBounds(17, 15, 166, 27);
		contentPane.add(textField1);
		textField1.setColumns(10);

		textField2 = new JTextField();
		textField2.setFont(new Font("굴림", Font.PLAIN, 16));
		textField2.setEditable(false);
		textField2.setBounds(189, 15, 166, 27);
		contentPane.add(textField2);
		textField2.setColumns(10);

		JButton btnNewButton = new JButton("우편번호 검색");
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 16));
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				SearchDialogUI dialog = new SearchDialogUI();
				dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				dialog.setModal(true);
				dialog.setVisible(true);

				String address = dialog.getAddress();
				
				if(address!=null) {
					String[] addresses= address.split("\\]");
					textField3.setText(addresses[1]);
					
					String zipcode = addresses[0].replaceAll("\\[", "");
					String[] zipcodes = zipcode.split("-"); 
					textField1.setText(zipcodes[0]);
					textField2.setText(zipcodes[1]);
				}
			}
		});
		btnNewButton.setBounds(372, 14, 154, 29);
		contentPane.add(btnNewButton);

		textField3 = new JTextField();
		textField3.setFont(new Font("굴림", Font.PLAIN, 16));
		textField3.setEditable(false);
		textField3.setBounds(17, 48, 509, 27);
		contentPane.add(textField3);
		textField3.setColumns(10);

		textField4 = new JTextField();
		textField4.setFont(new Font("굴림", Font.PLAIN, 16));
		textField4.setBounds(17, 80, 509, 27);
		contentPane.add(textField4);
		textField4.setColumns(10);
	}
}
