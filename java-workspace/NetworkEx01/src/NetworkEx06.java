import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class NetworkEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader br = null;
		try {
			//URL url = new URL("https://m.naver.com");
			//URLConnection conn = url.openConnection();
			URLConnection conn = (new URL("https://m.naver.com")).openConnection();
			
			br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String line = "";
			while((line = br.readLine()) != null) {
				System.out.println(line);
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
