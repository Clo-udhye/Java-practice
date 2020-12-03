import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCEx08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/sample";
		String user = "root";
		String password = "!123456";
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("드라이버 로딩 성공");
			
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("연결 성공");
			
			String sql = String.format("select deptno, dname, loc from dept");
			
			stmt = conn.createStatement();
			
			//쿼리의 실행 부분
			rs = stmt.executeQuery(sql);
			if(rs.next()) {	// 데이터 하나의 행만 읽어온다
			//while(rs.next()) {	// 데이터를 끝까지 읽는다, 데이터의 행 수 만큼 실행
				//System.out.println("결과 처리");
				//System.out.println(rs.getString("deptno"));
				System.out.println(rs.getString(1));
				//System.out.println(rs.getString("dname"));
				System.out.println(rs.getString(2));
				//System.out.println(rs.getString("loc"));
				System.out.println(rs.getString(3));
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] " + e.getMessage());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] " + e.getMessage());
		} finally {
			if(rs != null) try {rs.close();} catch(SQLException e) {}
			if(stmt != null) try {stmt.close();} catch(SQLException e) {}
			if(conn!=null) try {conn.close();} catch(SQLException e) {}
		}		
	}

}
