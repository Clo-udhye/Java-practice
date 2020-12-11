import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class JDialogMainEx01 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JDialogMainEx01 frame = new JDialogMainEx01();
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
	public JDialogMainEx01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800,600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				//JDialogEx01 dialog = new JDialogEx01();
				JDialogEx01 dialog = new JDialogEx01("초기 데이터");
				dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				
				System.out.println("1");
				dialog.setModal(true);	 
				System.out.println("2");
				// 화면의 제어를 자식창에게 위임
				dialog.setShareData("변경데이터");
				dialog.printShareData();
				
				dialog.setVisible(true);
				// 화면의 제어가 부모창으로 변경
				System.out.println("3");
				System.out.println(dialog.getShareData());
			}
		});
		btnNewButton.setBounds(17, 15, 129, 29);
		contentPane.add(btnNewButton);
	}

}
