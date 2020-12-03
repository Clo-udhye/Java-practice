import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("시작");
		try {
			Class.forName("org.mariadb.jdbc.Driver");// 연결할 드라이버를 로딩
			System.out.println("드라이버로딩 성공");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("[에러] " + e.getMessage());
		}
		
		// 연결을 위한 3가지
		// url(ip, port, database정보) / id / password
		// localhost - 127.0.0.1
		String url = "jdbc:mysql://localhost:3306/sample";
		String user = "root";
		String password = "!123456";
		
		Connection conn = null;
		
		try {
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("연결 성공");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] " + e.getMessage());
		} finally {
			if(conn != null) try {conn.close();} catch(SQLException e) {}
		}
		
		System.out.println("끝");
	}

}
