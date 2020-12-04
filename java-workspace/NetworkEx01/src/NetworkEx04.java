import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class NetworkEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// html문서를 BufferedReader을 통해 읽어오기 
		BufferedReader br = null; 
		
		try {
			URL url = new URL("https://m.naver.com"); //html
			br = new BufferedReader(new InputStreamReader(url.openStream()));
			String data = null;
			while((data=br.readLine())!= null) {
				System.out.println(data);
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(br!=null) try {br.close();} catch(IOException e) {}
		}
	}

}
