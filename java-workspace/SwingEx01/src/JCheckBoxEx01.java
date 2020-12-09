import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class JCheckBoxEx01 extends JFrame {

	private JPanel contentPane;
	private JCheckBox chckbx1;
	private JCheckBox chckbx2;
	private JCheckBox chckbx3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JCheckBoxEx01 frame = new JCheckBoxEx01();
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
	public JCheckBoxEx01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 758, 571);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		chckbx1 = new JCheckBox("사과");
		chckbx1.setFont(new Font("굴림", Font.PLAIN, 20));
		chckbx1.setSelected(true);
		chckbx1.setBounds(13, 11, 161, 29);
		contentPane.add(chckbx1);
		
		chckbx2 = new JCheckBox("딸기");
		chckbx2.setFont(new Font("굴림", Font.PLAIN, 20));
		chckbx2.setSelected(true);
		chckbx2.setBounds(13, 47, 161, 29);
		contentPane.add(chckbx2);
		
		chckbx3 = new JCheckBox("수박");
		chckbx3.setFont(new Font("굴림", Font.PLAIN, 20));
		chckbx3.setSelected(true);
		chckbx3.setBounds(13, 83, 161, 29);
		contentPane.add(chckbx3);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//System.out.println(chckbx1.isSelected());
				//System.out.println(chckbx2.isSelected());
				//System.out.println(chckbx3.isSelected());
				
				if(chckbx1.isSelected()) {
					System.out.println(chckbx1.getText());
				}
				if(chckbx2.isSelected()) {
					System.out.println(chckbx2.getText());
				}
				if(chckbx3.isSelected()) {
					System.out.println(chckbx3.getText());
				}
				
			}
		});
		btnNewButton.setBounds(590, 11, 129, 29);
		contentPane.add(btnNewButton);
	}
}
