package model2;

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

	public ArrayList<ZipcodeTO> listSido(){
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		ArrayList<ZipcodeTO> sidos = new ArrayList<ZipcodeTO>();
		try {
			String sql = "select distinct sido from zipcode";
			pstmt = conn.prepareStatement(sql);

			rs = pstmt.executeQuery();

			while(rs.next()) {
				ZipcodeTO to = new ZipcodeTO();
				to.setSido(rs.getString("sido"));

				sidos.add(to);
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			System.out.println("[에러] " + e1.getMessage());
		} finally {
			if(rs!=null) try {rs.close();} catch(SQLException e) {}
			if(pstmt!=null) try {pstmt.close();} catch(SQLException e) {}
			if(this.conn!=null) try {this.conn.close();} catch(SQLException e) {}
		}

		return sidos;
	}
	
	public ArrayList<ZipcodeTO> listGugun(String strSido){
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		ArrayList<ZipcodeTO> guguns = new ArrayList<ZipcodeTO>();
		try {
			String sql = "select distinct gugun from zipcode where sido = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, strSido);
			
			rs = pstmt.executeQuery();

			while(rs.next()) {
				ZipcodeTO to = new ZipcodeTO();
				to.setGugun(rs.getString("gugun"));
				guguns.add(to);
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			System.out.println("[에러] " + e1.getMessage());
		} finally {
			if(rs!=null) try {rs.close();} catch(SQLException e) {}
			if(pstmt!=null) try {pstmt.close();} catch(SQLException e) {}
			if(this.conn!=null) try {this.conn.close();} catch(SQLException e) {}
		}

		return guguns;
	}
	
	public ArrayList<ZipcodeTO> listDong(String strSido, String strGugun){
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		ArrayList<ZipcodeTO> dongs = new ArrayList<ZipcodeTO>();
		try {
			String sql = "select distinct dong from zipcode where sido = ? and gugun = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, strSido);
			pstmt.setString(2, strGugun);
			
			rs = pstmt.executeQuery();

			while(rs.next()) {
				ZipcodeTO to = new ZipcodeTO();
				to.setDong(rs.getString("dong"));

				dongs.add(to);
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			System.out.println("[에러] " + e1.getMessage());
		} finally {
			if(rs!=null) try {rs.close();} catch(SQLException e) {}
			if(pstmt!=null) try {pstmt.close();} catch(SQLException e) {}
			if(this.conn!=null) try {this.conn.close();} catch(SQLException e) {}
		}

		return dongs;
	}
	
	public ArrayList<ZipcodeTO> listAddress(String strSido, String strGugun, String strDong){
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		ArrayList<ZipcodeTO> addresses = new ArrayList<ZipcodeTO>();
		try {
			String sql = "select zipcode, ri, bunji from zipcode where sido = ? and gugun = ? and dong = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, strSido);
			pstmt.setString(2, strGugun);
			pstmt.setString(3, strDong);

			rs = pstmt.executeQuery();

			while(rs.next()) {
				ZipcodeTO to = new ZipcodeTO();
				to.setZipcode(rs.getString("zipcode"));
				to.setRi(rs.getString("ri"));
				to.setBunji(rs.getString("bunji"));

				addresses.add(to);
			}
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			System.out.println("[에러] " + e1.getMessage());
		} finally {
			if(rs!=null) try {rs.close();} catch(SQLException e) {}
			if(pstmt!=null) try {pstmt.close();} catch(SQLException e) {}
			if(this.conn!=null) try {this.conn.close();} catch(SQLException e) {}
		}

		return addresses;
	}
}
