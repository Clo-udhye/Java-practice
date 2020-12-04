import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class NetworkEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			URL url = new URL("https://m.naver.com");
			URLConnection conn = url.openConnection();

			// 연결에대한 정보
			System.out.println(conn);	
			
			System.out.println(conn.getContent());
			System.out.println(conn.getDate());	//timestamp 1970 년 1월 1일부터 의 밀리세컨드
			System.out.println(conn.getURL());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
