import java.awt.EventQueue;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Font;

public class SearchZipcodeEx01 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	
    private String url = "jdbc:mysql://localhost:3306/sample";
	private String user = "root";
	private String password = "!123456";
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SearchZipcodeEx01 frame = new SearchZipcodeEx01();
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
	public SearchZipcodeEx01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 814, 555);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("굴림", Font.PLAIN, 20));
		textField.setBounds(27, 40, 430, 27);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btn = new JButton("검색");
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				try {
					Class.forName("org.mariadb.jdbc.Driver");
					conn = DriverManager.getConnection(url, user, password);
					
					String sql = "select zipcode, sido, gugun, dong, ri, bunji, seq from zipcode where dong like ?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, textField.getText() + "%");
					
					StringBuffer result = new StringBuffer();
					rs = pstmt.executeQuery();
					
					while(rs.next()) {
						String zipcode = rs.getString("zipcode");
						String sido = rs.getString("sido");
						String gugun = rs.getString("gugun");
						String dong = rs.getString("dong");
						String ri = rs.getString("ri");
						String bunji = rs.getString("bunji");
						String seq = rs.getString("seq");
						
						result.append(String.format("%s %s %s %s %s %s %s\n", zipcode, sido, gugun, dong, ri, bunji, seq));
					}
				
					textArea.setText(result.toString());
					
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} finally {
					if(rs!=null) try {rs.close();} catch(SQLException e) {}
					if(pstmt!=null) try {pstmt.close();} catch(SQLException e) {}
					if(conn!=null) try {conn.close();} catch(SQLException e) {}
				}
			}
		});
		btn.setBounds(478, 39, 129, 29);
		contentPane.add(btn);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(27, 82, 748, 391);
		contentPane.add(scrollPane);
		
		textArea = new JTextArea();
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 18));
		scrollPane.setViewportView(textArea);
		
		JLabel lbl = new JLabel("우편번호 검색");
		lbl.setBounds(32, 15, 129, 21);
		contentPane.add(lbl);
	}

}
