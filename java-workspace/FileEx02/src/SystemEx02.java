import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class SystemEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// InputStreamReader를 이용한 다국어 변환 
		
		InputStream is = null;
		InputStreamReader isr = null;
		try {
			is = System.in;
			isr = new InputStreamReader(is);
			
			System.out.print("데이터 입력 : ");
			
			System.out.println("입력데이터 : " + (char)isr.read());
			System.out.println("입력데이터 : " + (char)isr.read());
			System.out.println("입력데이터 : " + (char)isr.read());
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(is!=null) try {is.close();} catch(IOException e) {}
			if(is!=null) try {isr.close();} catch(IOException e) {}
		}
	}

}
