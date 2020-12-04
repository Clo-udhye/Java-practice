import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class EmpDAO {
	private Connection conn = null;
	
	public EmpDAO() throws ClassNotFoundException, SQLException{
		// TODO Auto-generated constructor stub
		String url = "jdbc:mysql://localhost:3306/sample";
		String user = "root";
		String password = "!123456";
		
		Class.forName("org.mariadb.jdbc.Driver");
		
		this.conn = DriverManager.getConnection(url, user, password);
		
	}
	
	public ArrayList<EmpTO> searchEmp(String strDeptno) throws ClassNotFoundException, SQLException{
		
		String sql = "select empno, ename, job, mgr, hiredate, sal, comm, deptno from emp where deptno = ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, strDeptno);
		
		ResultSet rs = pstmt.executeQuery();
		
		ArrayList<EmpTO> datas = new ArrayList<EmpTO>();
		while(rs.next()) {
			String empno = rs.getString("empno");
			String ename = rs.getString("ename");
			String job = rs.getString("job");
			String mgr = rs.getString("mgr");
			String hiredate = rs.getString("hiredate");
			String sal = rs.getString("sal");
			String comm = rs.getString("comm");
			String deptno = rs.getString("deptno");
			
			EmpTO data = new EmpTO(empno, ename, job, mgr, hiredate, sal, comm, deptno);
			datas.add(data);
		}
		if(rs!=null) rs.close();
		if(pstmt!=null) pstmt.close();
		if(conn!=null) conn.close();
		
		return datas;
	}
}
