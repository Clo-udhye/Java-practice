import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CopyTableEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*	emp -> emp2
			1. create table emp2 as select * from emp where 1!=1;
			2. 프로그램 emp 테이블의 데이터를 읽어서 -> insert into emp2  (*)
		*/
		
		String url = "jdbc:mysql://localhost:3306/sample";
		String user = "root";
		String password = "!123456";
		
		Connection conn = null;
		Statement stmt = null;
		Statement stmt2 = null;
		ResultSet rs = null;
	
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("드라이버 로딩 성공");
			
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("연결 성공");
		
			String sql = "select empno, ename, job, mgr, hiredate, sal, comm, deptno from emp";
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(sql);
			
			// ver.1 Statement 
			while(rs.next()){
				// 처리작업을 위해 한번 저장
				String empno = rs.getString("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				String mgr = rs.getString("mgr");
				String hiredate = rs.getString("hiredate");
				String sal = rs.getString("sal");
				String comm = rs.getString("comm");
				String deptno = rs.getString("deptno");
				
				String insert = String.format("insert into emp2 values (%s, '%s', '%s', %s, '%s', %s, %s, %s)",
										empno, ename, job, mgr, hiredate, sal, comm, deptno);
			
				//System.out.println(insert);
				stmt2 = conn.createStatement();
				int result = stmt2.executeUpdate(insert);
				System.out.println("result : " + result);
			}
				
			
		} catch (ClassNotFoundException e) {
			System.out.println("[에러] " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("[에러] " + e.getMessage());
		} finally {
			if(rs != null) try {rs.close();} catch(SQLException e) {}
			if(stmt2 != null) try {stmt.close();} catch(SQLException e) {}
			if(stmt != null) try {stmt.close();} catch(SQLException e) {}
			if(conn!=null) try {conn.close();} catch(SQLException e) {}
		}
	}

}
