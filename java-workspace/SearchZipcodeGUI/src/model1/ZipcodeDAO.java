package model1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ZipcodeDAO {
	private Connection conn = null;

	public ZipcodeDAO(){
		// TODO Auto-generated constructor stub
		String url = "jdbc:mysql://localhost:3306/sample";
		String user = "root";
		String password = "!123456";

		try {
			Class.forName("org.mariadb.jdbc.Driver");
			this.conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] " + e.getMessage());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] " + e.getMessage());
		}
	}

	public ArrayList<ZipcodeTO> searchZipcode(String strDong){
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		ArrayList<ZipcodeTO> result = new ArrayList<ZipcodeTO>();
		try {
			String sql = "select zipcode, sido, gugun, dong, ri, bunji from zipcode where dong like ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, strDong + "%");

			rs = pstmt.executeQuery();

			while(rs.next()) {
				ZipcodeTO to = new ZipcodeTO();
				to.setZipcode(rs.getString("zipcode"));
				to.setSido(rs.getString("sido"));
				to.setGugun(rs.getString("gugun"));
				to.setDong(rs.getString("dong"));
				to.setRi(rs.getString("ri"));
				to.setBunji(rs.getString("bunji"));

				result.add(to);
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			System.out.println("[에러] " + e1.getMessage());
		} finally {
			if(rs!=null) try {rs.close();} catch(SQLException e) {}
			if(pstmt!=null) try {pstmt.close();} catch(SQLException e) {}
			if(this.conn!=null) try {this.conn.close();} catch(SQLException e) {}
		}

		return result;
	}
}
