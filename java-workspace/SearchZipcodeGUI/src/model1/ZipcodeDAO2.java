package model1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ZipcodeDAO2 {
	private Connection conn = null;

	public ZipcodeDAO2(){
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
	
	public ArrayList<ZipcodeTO> searchZipcode(String strSido, String strGugun, String strDong){
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		ArrayList<ZipcodeTO> result = new ArrayList<ZipcodeTO>();
		try {
			String sql = "select zipcode, sido, gugun, dong, ri, bunji from zipcode where sido=? and gugun=? and dong=?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, strSido);
			pstmt.setString(2, strGugun);
			pstmt.setString(3, strDong);

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
	
	public ArrayList<String> searchList(String strColumn){
		Statement stmt = null;
		ResultSet rs = null;
		
		ArrayList<String> result = new ArrayList<String>();
		
		try {
			String sql = "select distinct " + strColumn + " from zipcode";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			while(rs.next()) {
				result.add(rs.getString(strColumn));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] " + e.getMessage());
		} finally {
			if(rs!=null) try {rs.close();} catch(SQLException e) {}
			if(stmt!=null) try {stmt.close();} catch(SQLException e) {}
			if(this.conn!=null) try {this.conn.close();} catch(SQLException e) {}
		}
		return result;
	}
	
	public ArrayList<String> searchList(String strColumn1, String strColumn2){
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<String> result = new ArrayList<String>();
		
		try {
			String sql = "select distinct " + strColumn2 + " from zipcode where sido = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, strColumn1);
			rs = pstmt.executeQuery();

			while(rs.next()) {
				result.add(rs.getString(strColumn2));
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
	
	public ArrayList<String> searchList(String strColumn1, String strColumn2, String strColumn3){
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		ArrayList<String> result = new ArrayList<String>();
		
		try {
			String sql = "select distinct " + strColumn3 + " from zipcode where sido = ? and gugun = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, strColumn1);
			pstmt.setString(2, strColumn2);
			rs = pstmt.executeQuery();

			while(rs.next()) {
				result.add(rs.getString(strColumn3));
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
