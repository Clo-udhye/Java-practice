import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectIOEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사용자 객체의 출력
		
		ObjectInputStream ois = null;
		
		try {
			ois = new ObjectInputStream(new FileInputStream("./serial.dat"));
			
			Person p = (Person)ois.readObject();
			System.out.println(p.toString());
			
			System.out.println("출력 완료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(ois!=null) try{ois.close();} catch(IOException e) {}
		}
	}

}
