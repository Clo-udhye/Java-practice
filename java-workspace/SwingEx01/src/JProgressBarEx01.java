import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JProgressBarEx01 extends JFrame {

	private JPanel contentPane;
	private JProgressBar progressBar;
	private JButton btn1;
	private JButton btn2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JProgressBarEx01 frame = new JProgressBarEx01();
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
	public JProgressBarEx01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 605, 453);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		progressBar = new JProgressBar();
		progressBar.setStringPainted(true);
		progressBar.setMinimum(100);
		progressBar.setMaximum(200);
		progressBar.setValue(150);
		progressBar.setBounds(29, 31, 515, 31);
		contentPane.add(progressBar);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.out.println(progressBar.getValue());
			}
		});
		btnNewButton.setBounds(29, 113, 129, 29);
		contentPane.add(btnNewButton);
		
		btn1 = new JButton("감소");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				progressBar.setValue(progressBar.getValue()-10);
			}
		});
		btn1.setBounds(29, 77, 129, 29);
		contentPane.add(btn1);
		
		btn2 = new JButton("증가");
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				progressBar.setValue(progressBar.getValue()+10);
			}
		});
		btn2.setBounds(415, 77, 129, 29);
		contentPane.add(btn2);
	}
}
