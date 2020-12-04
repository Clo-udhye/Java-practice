package pack3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClientEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 서버에 메세지를 보내고 다시 받기
		
		System.out.println("시작");
		
		Socket socket = null;
		
		BufferedWriter bw = null;
		BufferedReader br = null;
		
		try {
			System.out.println("서버와 연결 중");
			socket = new Socket("localhost", 7777);	// ip, port
			System.out.println("연결 완료");
			
			//bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			//br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), "utf-8")); // 다국어처리
			br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "utf-8"));
			
			bw.write("Hello Server 안녕 서버" + "\n");	// 다국어 깨져서 나온다. => 다국어처리
			System.out.println("전송 완료");
			bw.flush();	
			
			String msg = br.readLine();
			System.out.println("MSG : " + msg);
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] " + e.getMessage());	// 서버가 안켜져있으면 error
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] " + e.getMessage());
		} finally {
			if(bw!=null) try {bw.close();} catch(IOException e) {}
			if(br!=null) try {br.close();} catch(IOException e) {}
			
			if(socket!=null) try {socket.close();} catch(IOException e) {}
		}
		
		System.out.println("끝");
	}

}
