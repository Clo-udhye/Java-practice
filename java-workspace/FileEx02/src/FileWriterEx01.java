import java.io.FileWriter;
import java.io.IOException;

public class FileWriterEx01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileWriter fw = null;
		
		try {
			//fw = new FileWriter("./newtest3.txt");
			// FileWriter(String "PathName", boolean appendMode)
			// appendMode true - 이어서 쓰기
			// appendMode false - 덮어 쓰기
			fw = new FileWriter("./newtest3.txt", true); 
			String msg = "hello";
			msg += "\n";
			msg += "hello";
			msg += "\n";
			msg += "hello";
			msg += "\n";
			msg += "hello";
			fw.write(msg);
			
			/*
			fw.write("hello");
			fw.write("\n");
			fw.write("hello");
			fw.write("\n");
			fw.write("hello");
			*/
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if( fw!= null) try { fw.close(); } catch(IOException e) {}
		}
	
		System.out.println("출력 완료");
	}
}
