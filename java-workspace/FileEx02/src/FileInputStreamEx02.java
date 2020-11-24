import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileInputStream fis = null;
		// 다국어 이외의 모든 파일을 읽을수 있다 (한글은 깨짐)

		try {
			// 절대경로
			// fis = new FileInputStream("c:\\java\\test.txt");
			// 상대경로
			fis = new FileInputStream("./test.txt");
			
			// 파일 전체를 읽는 구문
			int data = 0;
			while((data = fis.read()) != -1) { 
				System.out.print((char)data);	// 엔터키값까지 읽어준다 	
			}
			System.out.println();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("[에러] : " + e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(fis!=null) try { fis.close(); } catch(IOException e) {}
		}
	}

}
