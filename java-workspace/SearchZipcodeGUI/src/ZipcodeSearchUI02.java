import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ZipcodeSearchUI02 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextArea textArea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ZipcodeSearchUI02 frame = new ZipcodeSearchUI02();
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
	public ZipcodeSearchUI02() {
		setTitle("우편번호검색기");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 802, 640);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "\uC6B0\uD3B8\uBC88\uD638 \uAC80\uC0C9", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(17, 27, 751, 74);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("동이름 입력");
		lblNewLabel.setBounds(17, 33, 110, 21);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(127, 30, 479, 27);
		panel.add(textField);
		textField.setColumns(10);
		
		JButton btn = new JButton("검색하기");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String strDong = textField.getText();
				
				String url = "jdbc:mysql://localhost:3306/sample";
				String user = "root";
				String password = "!123456";
				
				Connection conn = null;
				PreparedStatement pstmt = null;
				ResultSet rs = null;
				
				try {
					Class.forName("org.mariadb.jdbc.Driver");
					conn = DriverManager.getConnection(url, user, password);
					
					String sql = "select zipcode, sido, gugun, dong, ri, bunji from zipcode where dong like ?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, strDong + "%");
					
					rs = pstmt.executeQuery();
					while(rs.next()) {
						String zipcode = rs.getString("zipcode");
						String sido = rs.getString("sido");
						String gugun = rs.getString("gugun");
						String dong = rs.getString("dong");
						String ri = rs.getString("ri");
						String bunji = rs.getString("bunji");
						
						String address = String.format("[%s] %s %s %s %s %s\n", 
								zipcode, sido, gugun, dong, ri, bunji);
						
						textArea.append(address);
					}
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					System.out.println("[에러] " + e1.getMessage());
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					System.out.println("[에러] " + e1.getMessage());
				} finally {
					if(rs!=null) try {rs.close();} catch(SQLException e1) {}
					if(pstmt!=null) try {pstmt.close();} catch(SQLException e1) {}
					if(conn!=null) try {conn.close();} catch(SQLException e1) {}
				}
			}
		});
		btn.setBounds(623, 30, 111, 29);
		panel.add(btn);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 116, 748, 453);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		textArea.setEditable(false);
		scrollPane.setViewportView(textArea);
	}
}
