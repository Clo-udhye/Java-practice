import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JButtonEx02 extends JFrame {

	private JPanel contentPane;
	private JButton btn3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JButtonEx02 frame = new JButtonEx02();
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
	public JButtonEx02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 659, 483);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton btn1 = new JButton("숨기기");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//btn3.setVisible(false);	//	보이기 / 숨기기
				btn3.setEnabled(false);		// 활성화 / 비활성화
											// 버튼 디자인의 비활성화 -> 이벤트의 비활성화 X 
			}
		});
		btn1.setBounds(17, 15, 129, 29);
		contentPane.add(btn1);

		JButton btn2 = new JButton("보이기");
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//btn3.setVisible(true);
				btn3.setEnabled(true);
			}
		});
		btn2.setBounds(17, 59, 129, 29);
		contentPane.add(btn2);

		btn3 = new JButton("타겟");
		btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(btn3.isEnabled()) {
					System.out.println("타겟 클릭");
				}}
		});
		btn3.setBounds(475, 15, 129, 29);
		contentPane.add(btn3);
	}

}
