import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCEx09 {

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
			
			// 10번 부서에 대한 사원번호, 이름, 직책, 급여를 출력
			//String sql = String.format("select empno, ename, job, sal from emp where deptno=10");
			
			// 10번 부서에 대한 사원번호, 이름, 직책, 급여, 연봉을 출력
			//String sql = String.format("select empno, ename, job, sal, sal*12+ifnull(comm, 0) annsal from emp where deptno=10");
			
			
			// 10번 부서에 대한 사원번호, 이름, 직책, 입사일(YYYY/MM/DD)을 출력
			// 입사일(YYYY/MM/DD) - 1. 자바로 처리하기 		2. SQL로 처리하기
			//String sql = String.format("select empno, ename, job, hiredate from emp where deptno=10");
			String sql = String.format("select empno, ename, job, date_format(hiredate, '%%Y/%%m/%%d') hiredate from emp where deptno=10");
			
			stmt = conn.createStatement();
			
			//쿼리의 실행 부분
			rs = stmt.executeQuery(sql);
	
			while(rs.next()) {	// 데이터를 끝까지 읽는다, 데이터의 행 수 만큼 실행
				//System.out.println(rs.getString("empno") +" "+ rs.getString("ename") +" "+  rs.getString("job") +" "+  rs.getString("sal"));
				//System.out.printf("%s %s %s %s\n",rs.getString("empno"), rs.getString("ename"),  rs.getString("job"), rs.getString("sal"));
				
				//System.out.printf("%s %s %s %s\n",rs.getString("empno"), rs.getString("ename"),  rs.getString("job"), rs.getString("sal"), rs.getString("annsal"));
				
				//String date = rs.getString("hiredate").replace("-", "/");
				//System.out.printf("%s %s %s %s\n",rs.getString("empno"), rs.getString("ename"),  rs.getString("job"), date);
			
				System.out.printf("%s %s %s %s\n",rs.getString("empno"), rs.getString("ename"),  rs.getString("job"), rs.getString("hiredate"));
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
