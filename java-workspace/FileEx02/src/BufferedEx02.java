import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedEx02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader( new FileReader("./test.txt") );
			
			// 한글자씩 읽기 (엔터키도 문자로 취급)
			//int data = 0;
			//while( (data = br.read()) != -1 ) {
			//	System.out.print((char)data);
			
			// 한 줄씩 읽기 (엔터키 전까지)
			String data = null;
			while((data=br.readLine()) != null) {
				System.out.println( data );
			}
			
			System.out.println();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(br != null) try {br.close();} catch(IOException e) {}
		}
	}
}
