package model1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.AbstractListModel;

public class ZipcodeListModel01 extends AbstractListModel<String> {
	private ArrayList<String> values = new ArrayList<String>();
	
	public ZipcodeListModel01(String strDong) {
		// TODO Auto-generated constructor stub
		String url = "jdbc:mysql://localhost:3306/sample";
		String user = "root";
		String password = "!123456";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection(url, user, password);
			
			String sql = "select zipcode, sido, gugun, dong, ri, bunji from zipcode where dong like ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, strDong + "%");
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String zipcode = rs.getString("zipcode");
				String sido = rs.getString("sido");
				String gugun = rs.getString("gugun");
				String dong = rs.getString("dong");
				String ri = rs.getString("ri");
				String bunji = rs.getString("bunji");
				
				String address = String.format("[%s] %s %s %s %s %s\n", 
						zipcode, sido, gugun, dong, ri, bunji);
				
				values.add(address);
			}
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			System.out.println("[에러] " + e1.getMessage());
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			System.out.println("[에러] " + e1.getMessage());
		} finally {
			if(rs!=null) try {rs.close();} catch(SQLException e1) {}
			if(pstmt!=null) try {pstmt.close();} catch(SQLException e1) {}
			if(conn!=null) try {conn.close();} catch(SQLException e1) {}
		}
	}

	@Override
	public String getElementAt(int index) {
		// TODO Auto-generated method stub
		return values.get(index);
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return values.size();
	}

}
