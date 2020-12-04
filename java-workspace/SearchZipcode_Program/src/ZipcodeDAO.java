import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ZipcodeDAO {
	private Connection conn = null;
	
	// 데이터베이스 접속
	public ZipcodeDAO() throws ClassNotFoundException, SQLException{
		// TODO Auto-generated constructor stub
		String url = "jdbc:mysql://localhost:3306/sample";
		String user = "root";
		String password = "!123456";
		
		Class.forName("org.mariadb.jdbc.Driver");
		this.conn = DriverManager.getConnection(url, user, password);
	}
	
	// SQL구문별 메서드
	public ArrayList<ZipcodeTO> searchZipcode(String strDong) throws ClassNotFoundException, SQLException{
		ArrayList<ZipcodeTO> datas = new ArrayList<ZipcodeTO>();
		
		String sql = "select zipcode, sido, gugun, dong, ri, bunji, seq from zipcode where dong like ?";
		PreparedStatement pstmt = this.conn.prepareStatement(sql);
		pstmt.setNString(1, strDong + "%");
		
		ResultSet rs = pstmt.executeQuery();
		
		while(rs.next()) {
			String zipcode = rs.getString("zipcode");
			String sido = rs.getString("sido");
			String gugun = rs.getString("gugun");
			String dong = rs.getString("dong");
			String ri = rs.getString("ri");
			String bunji = rs.getString("bunji");
			String seq = rs.getString("seq");
			
			ZipcodeTO to = new ZipcodeTO(zipcode, sido, gugun, dong, ri, bunji, seq);
			datas.add(to);
		}
		
		if(rs!=null) rs.close();
		if(pstmt!=null) pstmt.close();
		if(conn!=null) conn.close();
		
		return datas;
	}
	
}
