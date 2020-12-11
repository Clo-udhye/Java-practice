import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JButton;
import javax.swing.JFileChooser;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

public class JDialogMainEx03 extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JDialogMainEx03 frame = new JDialogMainEx03();
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
	public JDialogMainEx03() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				// open / save
				JFileChooser fileChooser = new JFileChooser("c://Java");	// 시작위치 path / default - C://사용자/내문서
				
				//디렉토리 선택기
				fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				fileChooser.setAcceptAllFileFilterUsed(false);
				
				int result = fileChooser.showOpenDialog(JDialogMainEx03.this);	// Returns:	•JFileChooser.CANCEL_OPTION 
																				// 			•JFileChooser.APPROVE_OPTION 
																				//			•JFileChooser.ERROR_OPTION 
				if(result==JFileChooser.APPROVE_OPTION) {
					System.out.println("확인");
					File selectedFile = fileChooser.getSelectedFile();
					System.out.println(selectedFile.getName());
					System.out.println(selectedFile.getAbsolutePath());
				} else if(result == JFileChooser.CANCEL_OPTION) {
					System.out.println("취소");
				}
				
			}
		});
		btnNewButton.setBounds(17, 15, 129, 29);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JFileChooser fileChooser = new JFileChooser("c://Java");
				int result = fileChooser.showSaveDialog(JDialogMainEx03.this);
				
				if(result==JFileChooser.APPROVE_OPTION) {
					System.out.println("확인");
					File selectedFile = fileChooser.getSelectedFile();
					System.out.println(selectedFile.getName());
					System.out.println(selectedFile.getAbsolutePath());
				} else if(result == JFileChooser.CANCEL_OPTION) {
					System.out.println("취소");
				}
			}
		});
		btnNewButton_1.setBounds(17, 59, 129, 29);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("New button");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JFileChooser fileChooser = new JFileChooser("c://Java");
			
				FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG & GIF Image", "jpg", "gif");
				fileChooser.setFileFilter(filter);	// 확장자가 필터
				
				int result = fileChooser.showOpenDialog(JDialogMainEx03.this);	
				
				if(result==JFileChooser.APPROVE_OPTION) {
					System.out.println("확인");
					File selectedFile = fileChooser.getSelectedFile();
					System.out.println(selectedFile.getName());
					System.out.println(selectedFile.getAbsolutePath());
				} else if(result == JFileChooser.CANCEL_OPTION) {
					System.out.println("취소");
				}
			}
		});
		btnNewButton_2.setBounds(17, 103, 129, 29);
		contentPane.add(btnNewButton_2);
	}

}
