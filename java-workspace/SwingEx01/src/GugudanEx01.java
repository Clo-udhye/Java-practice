import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JScrollPane;

public class GugudanEx01 extends JFrame {

	private JPanel contentPane;
	private JTextField textField1;
	private JTextField textField2;
	private JTextArea textArea;
	private JScrollPane scrollPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GugudanEx01 frame = new GugudanEx01();
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
	public GugudanEx01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 709, 545);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		textField1 = new JTextField();
		textField1.setBounds(17, 36, 219, 27);
		contentPane.add(textField1);
		textField1.setColumns(10);

		textField2 = new JTextField();
		textField2.setBounds(278, 36, 219, 27);
		contentPane.add(textField2);
		textField2.setColumns(10);

		JButton btn = new JButton("구구단 출력");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				/*
				String gugudan = "";
				for(int i=Integer.parseInt(textField1.getText()); i<=Integer.parseInt(textField2.getText()); i++) {
					for(int j=1; j<=9; j++) {
						gugudan += i +" X " + j + " = " + (i*j) + "  ";
					}
					gugudan += "\n";
				}

				textArea.setText(gugudan);
				*/
				
				/*
				for(int i=Integer.parseInt(textField1.getText()); i<=Integer.parseInt(textField2.getText()); i++) {
					for(int j=1; j<=9; j++) {
						textArea.append(i +" X " + j + " = " + (i*j) + "  ");
					}
					textArea.append("\n");
				}
				*/
				
				int startDan = Integer.parseInt(textField1.getText());
				int endDan = Integer.parseInt(textField2.getText());
				
				StringBuffer result = new StringBuffer();
				for(int dan=startDan; dan<=endDan; dan++) {
					for(int col=1; col<=9; col++) {
						//textArea.append(dan +" X " + col + " = " + (dan*col) + "  ");
						result.append(dan +" X " + col + " = " + (dan*col) + "\t");
					}
					result.append("\n");
				}
				
				textArea.setText(result.toString());
				
			}
		});
		btn.setBounds(514, 35, 156, 29);
		contentPane.add(btn);

		JLabel lbl1 = new JLabel("시작단");
		lbl1.setBounds(17, 15, 82, 21);
		contentPane.add(lbl1);

		JLabel lbl2 = new JLabel("끝단");
		lbl2.setBounds(278, 15, 82, 21);
		contentPane.add(lbl2);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(17, 78, 653, 396);
		contentPane.add(scrollPane);

		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
		textArea.setEditable(false);
	}
}
