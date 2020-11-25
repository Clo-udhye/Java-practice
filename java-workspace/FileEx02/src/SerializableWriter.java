import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializableWriter {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		// p.1046 예제 역직렬화해서 복원한 필드 조사
		
		FileOutputStream fos = new FileOutputStream("./Object.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		ClassA classA = new ClassA();
		classA.field1 = 1;
		classA.field2.field1 = 2;
		classA.field3 = 3;
		classA.field4 = 4;
		oos.writeObject(classA);
		oos.flush(); oos.close(); fos.close();
		
	}

}
