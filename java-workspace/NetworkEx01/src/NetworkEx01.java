import java.net.InetAddress;
import java.net.UnknownHostException;

public class NetworkEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//p.1056
		//ip정보 (도메인)
		try {
			InetAddress inetAddress1 = InetAddress.getByName("www.naver.com");
			System.out.println(inetAddress1.getHostName());
			System.out.println(inetAddress1.getHostAddress());
			
			InetAddress[] inetAddresses = InetAddress.getAllByName("www.naver.com");
			for(InetAddress inetAdddAddress : inetAddresses) {
				System.out.println(inetAdddAddress.getHostAddress());
				
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
