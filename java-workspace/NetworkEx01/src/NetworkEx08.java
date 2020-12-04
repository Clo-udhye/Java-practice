import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class NetworkEx08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 다음 홈페이지에서 뉴스 헤더 크롤링하기

		BufferedReader br = null;

		try {
			URLConnection conn = new URL("https://www.daum.net").openConnection();
			br = new BufferedReader(new InputStreamReader(conn.getInputStream()));

			String line = "";
			// boolean print = false;

			while((line = br.readLine()) != null) {

				if(line.startsWith("<ul class=\"list_txt\">")) {
					while(true) {
						String htmlLine = br.readLine();
						if(!htmlLine.equals("</ul>")) {
							if(htmlLine.startsWith("<a")) {	// <a> 태그 찾기
								System.out.println(htmlLine.substring(
										htmlLine.indexOf(">")+1, htmlLine.lastIndexOf("<"))); //>와 <의 위치를 찾아 substring 
							}
						} else {
							break;
						}
					}
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
