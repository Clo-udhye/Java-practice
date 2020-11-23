import java.util.Properties;
import java.util.Set;

public class PropertiesEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 시스템 환경설정 가져오기 
		Properties props = System.getProperties();
		Set keys = props.keySet();
		
		for(Object obj : keys) {
			String key = (String)obj;
			System.out.println(key + " : " + System.getProperty(key));
		}
	}

}
