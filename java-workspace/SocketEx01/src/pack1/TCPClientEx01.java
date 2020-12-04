package pack1;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClientEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("시작");
		
		Socket socket = null;
		
		try {
			System.out.println("서버와 연결 중");
			socket = new Socket("localhost", 7777);	// ip, port
			System.out.println("연결 완료");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] " + e.getMessage());	// 서버가 안켜져있으면 error
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] " + e.getMessage());
		} finally {
			if(socket!=null) try {socket.close();} catch(IOException e) {}
		}
		
		System.out.println("끝");
	}

}
