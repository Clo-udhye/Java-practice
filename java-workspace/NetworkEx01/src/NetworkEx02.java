import java.net.MalformedURLException;
import java.net.URL;

public class NetworkEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=covid19
		// url 저장용 클래스
		
		try {
			URL url = new URL("https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=covid19");
			//URL url = new URL("https://search.naver.com:8080/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=covid19");
			
			System.out.println(url.getProtocol());
			System.out.println(url.getHost());
			System.out.println(url.getPort());	// port번호가 없으면 -1
			System.out.println(url.getPath());
			System.out.println(url.getQuery());
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
