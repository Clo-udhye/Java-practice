import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/sample";
		String user = "root";
		String password = "!123456";
		
		Connection conn = null;
		Statement stmt = null;
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("드라이버 로딩 성공");
			
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("연결 성공");
			
			// DDL
			//String sql = String.format("create table dept3 (deptno int(2), dname varchar(14), loc varchar(13))" );
			StringBuffer sql = new StringBuffer();
			sql.append("create table dept4(");
			sql.append("deptno int(2)");
			sql.append(", dname varchar(14)");
			sql.append(", loc varchar(13)");
			sql.append(")");
			
			stmt = conn.createStatement();
			
			//쿼리의 실행 부분
			//int result = stmt.executeUpdate(sql);				// executeUpdate - select 제외한 다른 SQL 가능
			int result = stmt.executeUpdate(sql.toString());	//StringBuffer로 할때 
			
			System.out.println("result : " + result);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] " + e.getMessage());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] " + e.getMessage());
		} finally {
			if(stmt != null) try {stmt.close();} catch(SQLException e) {}
			if(conn!=null) try {conn.close();} catch(SQLException e) {}
		}		
	}

}
