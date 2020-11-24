import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferedEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		try {
			//fis = new FileInputStream("./test.txt");
			//bis = new BufferedInputStream( fis ); // FileInputStream과 연결
			bis = new BufferedInputStream( new FileInputStream("./test.txt") ); // 합쳐서 쓰기도 한다
			
			int data = 0;
			while( (data=bis.read()) != -1) {	// 속도 향상
				System.out.print((char)data);
			}
			System.out.println();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(bis != null) try {bis.close();} catch (IOException e) {}
			//if(fis != null) try {fis.close();} catch (IOException e) {}
		}
		
	}

}
