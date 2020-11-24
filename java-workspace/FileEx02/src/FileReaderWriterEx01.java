import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileReader fr = null;
		FileWriter fw = null;
		
		try {
			fr = new FileReader("./test.txt");
			fw = new FileWriter("./newtest2.txt");
			int data = 0;
			while((data = fr.read()) != -1) {
				fw.write((char)data);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(fr!=null) try { fr.close(); } catch (IOException e) {}
			if(fw!=null) try { fw.close(); } catch (IOException e) {}
		}
		
		System.out.println("복사 완료");
	}

}
