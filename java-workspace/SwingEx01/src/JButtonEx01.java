import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class JButtonEx01 extends JFrame {

	private JPanel contentPane;
	private JLabel lbl1;
	private JLabel lbl2;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JButtonEx01 frame = new JButtonEx01();
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
	public JButtonEx01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 791, 497);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn1 = new JButton("New button");
		
		// 이벤트 생성
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//System.out.println("마우스 클릭 " + lbl1.getText());
				lbl2.setText(lbl1.getText());
			}
		});
		btn1.setBounds(545, 46, 129, 29);
		contentPane.add(btn1);
		
		lbl1 = new JLabel("난 1번 라벨");
		lbl1.setBounds(27, 50, 340, 21);
		contentPane.add(lbl1);
		
		lbl2 = new JLabel("");
		lbl2.setBounds(27, 98, 82, 21);
		contentPane.add(lbl2);
		
		btnNewButton = new JButton("");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println("이미지 클릭");
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Java\\java-workspace\\SwingEx01\\dusan.png"));
		btnNewButton.setBounds(545, 128, 129, 127);
		contentPane.add(btnNewButton);
	}
}
