import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JOptionPaneEx01 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JOptionPaneEx01 frame = new JOptionPaneEx01();
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
	public JOptionPaneEx01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 841, 694);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn1 = new JButton("메시지");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// Message Dialog
				//JOptionPane.showMessageDialog(JOptionPaneEx01.this, "메시지"); // (현재창 , "메시지")
				//JOptionPane.showMessageDialog(JOptionPaneEx01.this, "메시지", "타이틀", JOptionPane.WARNING_MESSAGE);
				JOptionPane.showMessageDialog(JOptionPaneEx01.this, "메시지", "타이틀", JOptionPane.QUESTION_MESSAGE);
			}
		});
		btn1.setBounds(17, 15, 129, 29);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("확인");
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//int result = JOptionPane.showConfirmDialog(JOptionPaneEx01.this, "메시지");
				//int result = JOptionPane.showConfirmDialog(JOptionPaneEx01.this, "메시지", "타이틀", JOptionPane.OK_CANCEL_OPTION);
				int result = JOptionPane.showConfirmDialog(JOptionPaneEx01.this, "메시지", "타이틀", JOptionPane.YES_NO_OPTION);
				System.out.println(result);
			}
		});
		btn2.setBounds(17, 67, 129, 29);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("입력");
		btn3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//String msg = JOptionPane.showInputDialog(JOptionPaneEx01.this,"메시지");
				String msg = JOptionPane.showInputDialog(JOptionPaneEx01.this,"메시지", "타이틀", JOptionPane.YES_NO_OPTION);
				
				// null / 입력값
				System.out.println(msg);
			}
		});
		btn3.setBounds(17, 124, 129, 29);
		contentPane.add(btn3);
	}

}
