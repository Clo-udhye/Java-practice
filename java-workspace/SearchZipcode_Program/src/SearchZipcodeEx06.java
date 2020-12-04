import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class SearchZipcodeEx06 {
	// 입력 메서드
	// 데이터베이스 처리용 메서드

	/*
	public String inputDong() {
		BufferedReader br = null;

		String strDong = "";
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("동이름 입력 : ");
			strDong = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(br!=null) try {br.close();} catch(IOException e) {}
		}

		return strDong;
	}*/
	
	// 메서드안에서의 예외는 호출하는 쪽으로 처리를 넘겨주는게 좋다
	public String inputDong() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("동이름 입력 : ");
		String strDong = br.readLine();
		if(br!=null){br.close();}

		return strDong;
	}
	
	
	public ArrayList<String> searchDong(String strDong) throws ClassNotFoundException, SQLException{
		String url = "jdbc:mysql://localhost:3306/sample";
		String user = "root";
		String password = "!123456";
		
		Class.forName("org.mariadb.jdbc.Driver");
		Connection conn = DriverManager.getConnection(url, user, password);
		
		String sql = "select zipcode, sido, gugun, dong, ri, bunji from zipcode where dong like ?";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, strDong + "%");
		
		ResultSet rs = pstmt.executeQuery();
		
		ArrayList<String> datas = new ArrayList<String>();
		while(rs.next()) {
			//System.out.println(rs.getString("zipcode"));
			
			String data = String.format("[%s] %s %s %s %s %s",
					rs.getString("zipcode"), rs.getString("sido"), rs.getString("gugun"), 
					rs.getString("dong"), rs.getString("ri"), rs.getString("bunji") );
			
			datas.add(data);
		}
		if(rs != null) rs.close();
		if(pstmt != null) pstmt.close();
		if(conn != null) conn.close();
	
		return datas;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 메서드 호출
		SearchZipcodeEx06 sz = new SearchZipcodeEx06();
		
		try {
			String strDong = sz.inputDong();
			ArrayList<String> datas = sz.searchDong(strDong);
			
			for(String data : datas) {
				System.out.println(data);
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
