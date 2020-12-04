package pack2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClientEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 서버에 접속해서 데이터 받기 
		
		System.out.println("시작");
		
		Socket socket = null;
		
		BufferedReader br = null;
			
		try {
			System.out.println("서버와 연결 중");
			socket = new Socket("localhost", 7777);	// ip, port
			System.out.println("연결 완료");
			
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			System.out.println("MSG : " + br.readLine());
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] " + e.getMessage());	// 서버가 안켜져있으면 error
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] " + e.getMessage());
		} finally {
			if(br!=null) try {br.close();} catch(IOException e) {}
			if(socket!=null) try {socket.close();} catch(IOException e) {}
		}
		
		System.out.println("끝");
	}

}
