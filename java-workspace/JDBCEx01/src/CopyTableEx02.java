import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CopyTableEx02 {

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
		ResultSet rs = null;
		PreparedStatement pstmt1 = null;
		PreparedStatement pstmt2 = null;
	
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("드라이버 로딩 성공");
			
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("연결 성공");
		
			// 미리 sql문을 준비
			String selectSql = "select empno, ename, job, mgr, hiredate, sal, comm, deptno from emp";
			pstmt1 = conn.prepareStatement(selectSql);
			
			String insertSql = "insert into emp2 values (?, ?, ?, ?, ?, ?, ?, ?)";
			pstmt2 = conn.prepareStatement(insertSql);
			
			rs = pstmt1.executeQuery();
			
			// ver.2 PreparedStatement 처리속도가 빠르다 
			while(rs.next()) {
				String empno = rs.getString("empno");
				String ename = rs.getString("ename");
				String job = rs.getString("job");
				String mgr = rs.getString("mgr");
				String hiredate = rs.getString("hiredate");
				String sal = rs.getString("sal");
				String comm = rs.getString("comm");
				String deptno = rs.getString("deptno");	
				
				// 데이터만 변경 후 실행
				pstmt2.setString(1, empno);
				pstmt2.setString(2, ename);
				pstmt2.setString(3, job);
				pstmt2.setString(4, mgr);
				pstmt2.setString(5, hiredate);
				pstmt2.setString(6, sal);
				pstmt2.setString(7, comm);
				pstmt2.setString(8, deptno);
				
				int result = pstmt2.executeUpdate();
				System.out.println("result : " + result);
				
			}
		
			
			
		} catch (ClassNotFoundException e) {
			System.out.println("[에러] " + e.getMessage());
		} catch (SQLException e) {
			System.out.println("[에러] " + e.getMessage());
		} finally {
			if(rs != null) try {rs.close();} catch(SQLException e) {}
			if(pstmt2 != null) try {pstmt2.close();} catch(SQLException e) {}
			if(pstmt1!=null) try {pstmt1.close();} catch(SQLException e) {}
			if(conn!=null) try {conn.close();} catch(SQLException e) {}
		}
	}

}
