import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class MetaDataEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3306/sample";
		String user = "root";
		String password = "!123456";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("드라이버 로딩 성공");
			
			conn = DriverManager.getConnection(url, user, password);
			System.out.println("연결 성공");
			
			String sql = "select deptno, dname, loc from dept";
			pstmt = conn.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			ResultSetMetaData rsmd = rs.getMetaData();
			System.out.println(rsmd.getColumnCount()); // 컬럼의 갯수
			
			// describe
			for(int i=1; i<=rsmd.getColumnCount(); i++) {	// 데이터베이스 컬럼 인덱스 1번부터
				//System.out.println(rsmd.getColumnName(i));
				System.out.println(rsmd.getColumnLabel(i));	
				
				System.out.println(rsmd.getColumnTypeName(i));	// 컬럼의 데이터타입이름
				
				// 컬럼의 사이즈
				System.out.println(rsmd.getPrecision(i));		// 내부적(bit)
				System.out.println(rsmd.getScale(i));
				System.out.println(rsmd.getColumnDisplaySize(i)); // 단위(byte)
				
				System.out.println(rsmd.isNullable(i));		// null의 허용여부	
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] " + e.getMessage());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] " + e.getMessage());
		} finally {
			if(rs!=null) try {rs.close();} catch(SQLException e) {}
			if(pstmt!=null) try {pstmt.close();} catch(SQLException e) {}
			if(conn!=null) try {conn.close();} catch(SQLException e) {}
		}		
	}

}
