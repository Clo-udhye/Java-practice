import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.CardLayout;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LayoutEx02 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LayoutEx02 frame = new LayoutEx02();
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
	public LayoutEx02() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 697, 576);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(17, 64, 421, 438);
		contentPane.add(panel);
		panel.setLayout(new CardLayout(0, 0));
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.CYAN);
		panel.add(panel_1, "name_21227337756500");
		panel_1.setLayout(null);
		
		JButton btnNewButton_3 = new JButton("New button");
		btnNewButton_3.setBounds(137, 35, 129, 29);
		panel_1.add(btnNewButton_3);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(Color.ORANGE);
		panel.add(panel_2, "name_21275732897300");
		panel_2.setLayout(null);
		
		JButton btnNewButton_4 = new JButton("New button");
		btnNewButton_4.setBounds(141, 205, 129, 29);
		panel_2.add(btnNewButton_4);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBackground(Color.BLUE);
		panel.add(panel_3, "name_21367344905200");
		panel_3.setLayout(null);
		
		JButton btnNewButton_5 = new JButton("New button");
		btnNewButton_5.setBounds(141, 394, 129, 29);
		panel_3.add(btnNewButton_5);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				((CardLayout)panel.getLayout()).show(panel,"name_21227337756500");
			}
		});
		btnNewButton.setBounds(17, 36, 129, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				((CardLayout)panel.getLayout()).show(panel,"name_21275732897300");
			}
		});
		btnNewButton_1.setBounds(163, 35, 129, 29);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				((CardLayout)panel.getLayout()).show(panel,"name_21367344905200");
			}
		});
		btnNewButton_2.setBounds(309, 36, 129, 29);
		contentPane.add(btnNewButton_2);
		

	}
}
