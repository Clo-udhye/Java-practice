import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertZipcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 우편번호 데이터파일(csv) -> zipcode 테이블
		
		// 1. 파일을 읽어오기
		// 2. 문자열 처리해서 테이블에 insert 
		
		String url = "jdbc:mysql://localhost:3306/sample";
		String user = "root";
		String password = "!123456";
		
		BufferedReader br = null;
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			br = new BufferedReader(new FileReader("./zipcode_seoul_utf8_type2.csv"));
			Class.forName("org.mariadb.jdbc.Driver");
			//System.out.println("드라이버 로딩 성공");
			
			conn = DriverManager.getConnection(url, user, password);
			//System.out.println("연결 성공");
			
			// insert 준비
			String sql = "insert into zipcode values (?, ?, ?, ?, ?, ?, ?)";
			pstmt = conn.prepareStatement(sql);
			
			String address = null;
			while((address = br.readLine())!=null) {	// 파일 읽어오기
				//System.out.println(address);
				String[] addrs = address.split(",");				
				
				pstmt.setString(1, addrs[0]);
				pstmt.setString(2, addrs[1]);
				pstmt.setString(3, addrs[2]);
				pstmt.setString(4, addrs[3]);
				pstmt.setString(5, addrs[4]);
				pstmt.setString(6, addrs[5]);
				pstmt.setString(7, addrs[6]);
				
				int result = pstmt.executeUpdate();
				//System.out.println("result : " + result);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(pstmt!=null) try {pstmt.close();} catch(SQLException e) {}
			if(conn!=null) try {conn.close();} catch(SQLException e) {}
			if(br!=null) try {br.close();} catch(IOException e) {}
		}
		
	}

}
