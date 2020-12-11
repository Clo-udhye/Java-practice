import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.border.TitledBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.UIManager;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JavaFileViewerEx01 extends JFrame {

	private JPanel contentPane;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					JavaFileViewerEx01 frame = new JavaFileViewerEx01();
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
	public JavaFileViewerEx01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 816, 698);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\uC790\uBC14 \uD30C\uC77C \uBDF0\uC5B4", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(17, 51, 760, 59);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JButton btn1 = new JButton("자바 파일 열기");
		btn1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JFileChooser fileChooser = new JFileChooser("c://Java");
				
				FileNameExtensionFilter filter = new FileNameExtensionFilter("Java Source File", "java");
				fileChooser.setFileFilter(filter);
				
				int result = fileChooser.showOpenDialog(JavaFileViewerEx01.this);	
				
				if(result==JFileChooser.APPROVE_OPTION) {
					File selectedFile = fileChooser.getSelectedFile();
					//System.out.println(selectedFile.getName());
					//System.out.println(selectedFile.getAbsolutePath());
					
					//textArea.setText(selectedFile.getName());
					BufferedReader br = null;
					
					try {
						br = new BufferedReader(new FileReader(selectedFile));
						String line = null;
						while((line=br.readLine())!= null) {
							textArea.append(line+"\n");
						}
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						System.out.println("[에러] " + e1.getMessage());
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						System.out.println("[에러] " + e1.getMessage());
					} finally {
						if(br!=null) try {br.close();} catch(IOException e1) {}
					}
				} else if(result == JFileChooser.CANCEL_OPTION) {
					System.out.println("취소");
				}
			}
		});
		btn1.setBounds(6, 23, 169, 29);
		panel.add(btn1);
		
		JButton btn2 = new JButton("자바 파일 저장");
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JFileChooser fileChooser = new JFileChooser("c://Java");
				
				FileNameExtensionFilter filter = new FileNameExtensionFilter("Java Source File", "java");
				fileChooser.setFileFilter(filter);
				
				int result = fileChooser.showSaveDialog(JavaFileViewerEx01.this);
				
				if(result==JFileChooser.APPROVE_OPTION) {
					File selectedFile = fileChooser.getSelectedFile();

					BufferedWriter bw = null;
					
					try {
						String path = selectedFile.getAbsolutePath();
						if(!path.endsWith(".java")) {
							path += ".java";
						}
						
						bw = new BufferedWriter(new FileWriter(path));
						//System.out.println(textArea.getText());
						bw.write(textArea.getText());
					
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						System.out.println("[에러] " + e1.getMessage());
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						System.out.println("[에러] " + e1.getMessage());
					} finally {
						if(bw!=null) try {bw.close();} catch(IOException e1) {}
					}
					
					JOptionPane.showMessageDialog(JavaFileViewerEx01.this, "파일 저장 성공", "파일 저장", JOptionPane.INFORMATION_MESSAGE);
				} else if(result == JFileChooser.CANCEL_OPTION) {
					System.out.println("취소");
				}
			}
		});
		btn2.setBounds(187, 23, 169, 29);
		panel.add(btn2);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(17, 125, 760, 502);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		scrollPane.setViewportView(textArea);
	}
}
