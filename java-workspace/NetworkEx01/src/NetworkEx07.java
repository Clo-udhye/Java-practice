import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class NetworkEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 원격의 이미지를 로컬에 다운로드
		
		// https://t1.daumcdn.net/b2/creative/118012/e2a7c91af4b515e1c8e9883c1b5c316f.jpg
		
		BufferedInputStream bis = null;
		BufferedOutputStream bos = null;
		
		try {
			String strURL = "https://t1.daumcdn.net/b2/creative/118012/e2a7c91af4b515e1c8e9883c1b5c316f.jpg";
			URLConnection conn = new URL(strURL).openConnection();
			
			bis = new BufferedInputStream(conn.getInputStream());
			bos = new BufferedOutputStream(new FileOutputStream("./image.jpg"));
			
			int data = 0;
			while((data = bis.read()) != -1) {
				bos.write(data);
			}
			System.out.println("전송 완료");
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(bis != null) try {bis.close();} catch(IOException e) {}
			if(bos != null) try {bos.close();} catch(IOException e) {}
		}
	}
}
