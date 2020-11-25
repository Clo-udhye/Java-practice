import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectIOEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사용자 객체의 저장
		// java.io.NotSerializableException => 객체 직렬화 
		
		ObjectOutputStream oos = null;
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream("./serial.dat"));
			
			Person p = new Person("홍길동", "010-1111-1111", 30);
			oos.writeObject(p);
			
			System.out.println("저장 완료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(oos != null) try {oos.close();} catch(IOException e) {}
		}
		
	}

}
