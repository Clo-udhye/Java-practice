import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// c:\\java\\test.txt
		// 1234567
		// abcdefg
		// 가나다라마바

		FileInputStream fis = null;

		try {
			fis = new FileInputStream("c:\\java\\test1.txt");	//파일 열기

			int data = 0;
			data = fis.read();

			// ascii code값 
			System.out.println(data);
			System.out.println((char)data);

			data = fis.read();		// read의 갯수 = 읽을 문자의 갯수 
			System.out.println(data);
			System.out.println((char)data);


		} catch (FileNotFoundException e) {	// 파일이 없을때 Exception
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("[에러] : " + e.getMessage());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 파일 닫기 
			//예외처리를 따로 안해줘도 된다 , 보통 한줄로 
			if(fis != null) try { fis.close();} catch (IOException e) {} 
		}

	}
}
