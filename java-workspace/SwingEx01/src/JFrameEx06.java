import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class JFrameEx06 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JFrameEx06 frame = new JFrameEx06();
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
	public JFrameEx06() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 814, 542);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GREEN);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lbl1 = new JLabel("<html><body><font color='red'>Hello Label</font><br><font color='red'>Hello Label</font></body></html>");
		lbl1.setBounds(17, 15, 148, 41);	// html구문으로 쓰면 여러줄쓰기 가능
		contentPane.add(lbl1);
		
		JLabel lbl2 = new JLabel("라벨 2\\n라벨2");	// '\n' - 여러줄 쓰기 불가능
		lbl2.setHorizontalAlignment(SwingConstants.CENTER);
		lbl2.setForeground(Color.BLUE);
		lbl2.setFont(new Font("굴림", Font.BOLD, 20));
		lbl2.setBounds(17, 71, 148, 21);
		contentPane.add(lbl2);
	}
}
