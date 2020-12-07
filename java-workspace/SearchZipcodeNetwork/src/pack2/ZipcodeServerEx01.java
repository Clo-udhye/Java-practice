package pack2;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ZipcodeServerEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 클라이언트한테 동이름을 전송받아 데이터베이스에 검색하고 데이터를 클라이언트에 다시 전송

		ServerSocket serverSocket = null;
		Socket socket = null;

		BufferedReader br = null;
		BufferedWriter bw = null;

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			serverSocket = new ServerSocket(7777);

			while(true) {
				try {
					System.out.println("서버 시작");	
					socket = serverSocket.accept();
					//System.out.println("접속 완료");

					br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "utf-8"));
					bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), "utf-8"));

					String strDong = br.readLine();
					System.out.println("동이름 : " + strDong);

					String url = "jdbc:mysql://localhost:3306/sample";
					String user = "root";
					String password = "!123456";

					Class.forName("org.mariadb.jdbc.Driver");
					//System.out.println("드라이버 로딩 성공");

					conn = DriverManager.getConnection(url, user, password);
					//System.out.println("연결 성공");

					String sql = "select zipcode, sido, gugun, dong, ri, bunji, seq from zipcode where dong like ?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, strDong + "%");

					rs = pstmt.executeQuery();
					StringBuffer msg = new StringBuffer();

					while(rs.next()) { 
						String zipcode = rs.getString("zipcode");
						String sido = rs.getString("sido");
						String gugun = rs.getString("gugun");
						String dong = rs.getString("dong");
						String ri = rs.getString("ri");
						String bunji = rs.getString("bunji");
						String seq = rs.getString("seq");

						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
						msg.append(String.format("%s %s %s %s %s %s %s\n",
								zipcode, sido, gugun, dong,ri,bunji, seq));
					}

					bw.write(msg.toString() + "\n");
					bw.flush();
					System.out.println(strDong + "에 대한 검색 결과 전송 완료");
				} catch (ClassNotFoundException e) {
					System.out.println("[에러] " + e.getMessage());
				} catch (SQLException e) {
					System.out.println("[에러] " + e.getMessage());
				} catch(IOException e) {
					System.out.println("[에러] " + e.getMessage());
				} finally {
					if(rs!=null) try {rs.close();} catch(SQLException e) {}
					if(pstmt!=null) try {pstmt.close();} catch(SQLException e) {}
					if(conn!=null) try {conn.close();} catch(SQLException e) {}

					if(br!=null) try {br.close();} catch(IOException e) {}
					if(bw!=null) try {br.close();} catch(IOException e) {}

					if(socket!=null) try {socket.close();} catch(IOException e) {}
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] " + e.getMessage());

		} finally {

			if(serverSocket!=null) try {serverSocket.close();} catch(IOException e) {}
		}

	}

}
