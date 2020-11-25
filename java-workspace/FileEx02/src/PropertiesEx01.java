import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Properties를 이용한 데이터 저장
		
		Properties props = new Properties();
		props.setProperty("id", "andy");
		props.setProperty("pass", "1234");
		props.setProperty("addr", "198.168.0.11");
		
		FileWriter fw = null;
		try {
			fw = new FileWriter("./config.properties");
			// save -> store
			props.store(fw, "System Config");
			System.out.println("저장 완료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(fw != null) try {fw.close();} catch(IOException e) {}
		}
	}

}
