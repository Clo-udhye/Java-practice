import java.util.Enumeration;
import java.util.Properties;

public class PropertiesEx01 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		// generic (X)
		Properties props = new Properties();
		props.setProperty("timeout", "30");
		props.setProperty("language", "kr");
		props.setProperty("size", "10");
		
		System.out.println(props.toString());
		
		System.out.println(props.getProperty("size"));
		System.out.println(props.getProperty("language"));
		
		// Enumeration (Iterator와 비슷)
		Enumeration e = props.propertyNames();	//key값만 가져오기
		while(e.hasMoreElements()) {
			System.out.println((String)e.nextElement());
		}
	}
}
