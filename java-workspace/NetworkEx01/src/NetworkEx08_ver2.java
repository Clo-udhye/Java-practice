import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class NetworkEx08_ver2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 다음 홈페이지에서 뉴스 헤더 크롤링하기

		BufferedReader br = null;

		try {
			URLConnection conn = new URL("https://www.daum.net").openConnection();
			br = new BufferedReader(new InputStreamReader(conn.getInputStream()));

			String line = "";
			boolean print = false;

			while((line = br.readLine()) != null) {

				if(line.contains("<ul class=\"list_txt\">")) {
					print = true;
				}
				if(print) {
					int beginIndex = line.indexOf("\">"); // ~"> 사이의 문자열을 가져오기 </a>
					int endIndex = line.lastIndexOf("</a");
					if(beginIndex!=-1 && endIndex!=-1 ) {
						System.out.println(line.substring(beginIndex+2, endIndex));
					}
				}
				if(print==true && line.contains("</ul>")) {
					break;
				}
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
