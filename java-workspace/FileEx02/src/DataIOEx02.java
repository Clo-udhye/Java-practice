import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DataIOEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DataInputStream dis = null;
		
		try {
			dis = new DataInputStream( new FileInputStream("./value.dat"));
			System.out.println(dis.readInt());
			System.out.println(dis.readUTF());
			System.out.println(dis.readFloat());
			
			System.out.println("출력 완료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace(); 
		}finally {
			if (dis!= null)try {dis.close();} catch(IOException e) {}
		}

	}
	

}
