
public class JDBCEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("시작");
		try {
			Class.forName("org.mariadb.jdbc.Driver");// 연결할 드라이버를 로딩
			System.out.println("드라이버로딩 성공");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("[에러] " + e.getMessage());
		}
		System.out.println("끝");
		
	}

}
