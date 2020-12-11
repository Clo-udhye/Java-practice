import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmpDAO {
	private Connection conn = null;
	
	public EmpDAO() {
		// TODO Auto-generated constructor stub
		String url = "jdbc:mysql://localhost:3306/sample";
		String user = "root";
		String password = "!123456";
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] " + e.getMessage());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] " + e.getMessage());
		}
	}
	
	ArrayList<EmpTO> searchEname(String strEname){
		ArrayList<EmpTO> result = new ArrayList<EmpTO>();
		
		PreparedStatement pstmt = null;
		ResultSet rs = null;
	
		try {
			String sql = "select empno, ename, job, sal, grade, d.deptno, loc, dname "+ 
					"from emp e inner join  salgrade s on e.sal between s.losal and s.hisal " + 
					"inner join dept d using (deptno) where ename like ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%"+strEname+"%");
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				EmpTO to = new EmpTO();
				to.setEmpno(rs.getString("empno")); 
				to.setEname(rs.getString("ename")); ;
				to.setJob(rs.getString("job")); 
				to.setSal(rs.getString("sal")); 
				to.setGrade(rs.getString("grade")); 
				to.setDeptno(rs.getString("d.deptno")); 
				to.setLoc(rs.getString("loc")); 
				to.setDname(rs.getString("dname")); 
				
				result.add(to);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] " + e.getMessage());
		} finally {
			if(rs!=null) try {rs.close();} catch(SQLException e) {}
			if(pstmt!=null) try {pstmt.close();} catch(SQLException e) {}
			if(this.conn!=null) try {this.conn.close();} catch(SQLException e) {}
		}
		
		return result;
	}
}
