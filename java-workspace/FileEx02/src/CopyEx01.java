import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 이미지 파일을 복사해서 하나 더 만들기
		
		// XXXInputStream / XXXOutputStream - 다국어문자 파일 이외 전부 접근 가능  
		
		FileInputStream fis = null;
		FileOutputStream fos = null;
		
		try {
			fis = new FileInputStream("./Jellyfish.jpg");
			fos = new FileOutputStream("./newJellyfish.jpg");
			

			int data = 0;
			while( (data = fis.read()) != -1 ) {
				fos.write(data);
			}
			System.out.println("복사 완료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(fis != null) try {fis.close();} catch(IOException e) {}
			if(fos != null) try {fos.close();} catch(IOException e) {}
		}
	}

}
