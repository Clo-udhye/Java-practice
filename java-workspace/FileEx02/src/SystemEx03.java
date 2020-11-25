import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class SystemEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// BufferedReader로 가속화 
		
		//InputStream is = null;
		//InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			//is = System.in;
			//isr = new InputStreamReader(is);
			//br = new BufferedReader(isr);
			br = new BufferedReader(new InputStreamReader( System.in ));
			
			System.out.print("데이터 입력 : ");
			
			//System.out.println("입력데이터 : " + (char)br.read());
			//System.out.println("입력데이터 : " + (char)br.read());
			//System.out.println("입력데이터 : " + (char)br.read());
			
			System.out.println("입력데이터 : " + br.readLine());	// 엔터값까지 읽기 
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(br!=null) try {br.close();} catch(IOException e) {}
			//if(isr!=null) try {isr.close();} catch(IOException e) {}
			//if(is!=null) try {is.close();} catch(IOException e) {}
			
		}
	}

}
