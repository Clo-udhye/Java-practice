import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectIOEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체의 저장
		
		ObjectOutputStream oos = null;
		
		try {
			oos = new ObjectOutputStream(new FileOutputStream("./data.dat"));
			
			// 내장 객체 / 기본 객체 
			String[] names = {"홍길동", "박문수", "이몽룡"};
			int[] ages = {55, 23, 47};
			double[] weights = {71.4, 67.9, 58.6};
			
			oos.writeObject(names);
			oos.writeObject(ages);
			oos.writeObject(weights);
			
			System.out.println("저장 완료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(oos != null) try{oos.close();} catch(IOException e) {}
		}
	}

}
