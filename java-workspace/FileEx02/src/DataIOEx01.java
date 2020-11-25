import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataIOEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		DataOutputStream dos = null;
		
		try {
			dos =  new DataOutputStream(new FileOutputStream("./value.dat"));
			
			
			//파일안에 순차적으로 저장
			dos.writeInt( 2020 );
			dos.writeUTF("UTF-8형식으로 저장");
			dos.writeFloat( 1.8f );
			
			System.out.println( "출력 완료" );
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if (dos != null) try {dos.close();} catch(IOException e) {}
		}

	}

}
