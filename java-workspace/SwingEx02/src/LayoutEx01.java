import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.FlowLayout;

public class LayoutEx01 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LayoutEx01 frame = new LayoutEx01();
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
	public LayoutEx01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 784, 619);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel nPanel = new JPanel();
		FlowLayout flowLayout = (FlowLayout) nPanel.getLayout();
		flowLayout.setVgap(20);
		flowLayout.setHgap(20);
		flowLayout.setAlignment(FlowLayout.LEFT);
		contentPane.add(nPanel, BorderLayout.NORTH);
		
		JButton btnNewButton = new JButton("New button");
		nPanel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		nPanel.add(btnNewButton_1);
		
		JPanel wPanel = new JPanel();
		contentPane.add(wPanel, BorderLayout.WEST);
		
		JButton btnNewButton_3 = new JButton("New button");
		wPanel.add(btnNewButton_3);
		
		JButton btnNewButton_2 = new JButton("New button");
		wPanel.add(btnNewButton_2);
		
		JPanel cPanel = new JPanel();
		contentPane.add(cPanel, BorderLayout.CENTER);
	}

}
