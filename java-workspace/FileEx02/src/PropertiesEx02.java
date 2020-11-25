import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Properties를 이용한 데이터 출력
		
		Properties props = new Properties();
		
		FileReader fr = null;
		
		try {
			fr = new FileReader("./config.properties");
			props.load(fr);
			
			System.out.println(props.getProperty("id"));
			System.out.println(props.getProperty("pass"));
			System.out.println(props.getProperty("addr"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(fr!=null) try {fr.close();} catch(IOException e) {}
		}
	}

}
