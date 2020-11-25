import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectIOEx02 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체의 출력
		
		ObjectInputStream ois= null;
		
		try {
			ois = new ObjectInputStream(new FileInputStream("./data.dat"));
			
			String[] names = (String[])ois.readObject();	//형변환!
			int[] ages = (int[])ois.readObject();
			double[] weights = (double[])ois.readObject();
			
			for(int i=0; i<names.length; i++) {
				System.out.println(names[i]);
				System.out.println(ages[i]);
				System.out.println(weights[i]);
			}
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
			if(ois!=null) try {ois.close();} catch(IOException e) {}
		}
	}

}
