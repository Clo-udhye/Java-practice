import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 문제
		 * 엔터키('\n') -> (n) 으로 바꿔서 출력해보기 
		 */
		FileInputStream fis = null;

		try {
			// 상대경로
			fis = new FileInputStream("./test.txt");

			int data = 0;
			while((data = fis.read()) != -1) { 
				// 엔터키값
				// windows	= \r\n
				// unix		= \n
				if(data == '\r'){
					System.out.print("(r)");
				}else if(data == '\n') {
					System.out.print("(n)");
				}else {
					System.out.print((char)data);
				}
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
