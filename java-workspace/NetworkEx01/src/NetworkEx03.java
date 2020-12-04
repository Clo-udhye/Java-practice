import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

public class NetworkEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// html문서를 InputStream을 통해 읽어오기 
		InputStream is = null; // 한글이 깨져서 나온다
		
		try {
			URL url = new URL("https://m.naver.com"); //html
			is = url.openStream();
			int data = 0;
			while((data=is.read())!= -1) {
				System.out.print((char)data);
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(is!=null) try {is.close();} catch(IOException e) {}
		}
	}

}
