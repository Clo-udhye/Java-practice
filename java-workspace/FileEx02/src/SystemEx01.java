import java.io.IOException;
import java.io.InputStream;

public class SystemEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.in을 통해 데이터 읽기
		// 다국어 입력 X
		InputStream is = null;
		
		try {
			is = System.in;
			System.out.print("데이터 입력 : ");
			
			//int data = is.read();
			//System.out.println("입력데이터 : " + data);
			//System.out.println("입력데이터 : " + (char)data);
			System.out.println("입력데이터 : " + (char)is.read());
			System.out.println("입력데이터 : " + (char)is.read());
			System.out.println("입력데이터 : " + (char)is.read());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(is!=null) try {is.close();} catch(IOException e) {}
		}
	}

}
