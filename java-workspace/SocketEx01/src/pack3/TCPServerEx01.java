package pack3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 클라이언트가 보내는 메세지를 받아서 다시 보내주기
		
		System.out.println("시작");
		
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			serverSocket = new ServerSocket(7777); 	//port
			System.out.println("서버가 준비되었습니다.");
			socket = serverSocket.accept();			// client가 접속할때까지 대기
			System.out.println("클라이언트와 연결되었습니다.");
			
			//br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));			
			br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "utf-8"));	// 다국어 처리
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), "utf-8"));
			
			// echo
			String msg = br.readLine();
			System.out.println("Client msg : " + msg);
			bw.write(msg + "\n");
			bw.flush();
			
			System.out.println("전송 완료");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] " + e.getMessage());
		} finally {
			if(br!=null) try {br.close();} catch(IOException e) {}	// socket을 닫기전에 먼저 닫아줘야한다.
			if(bw!=null) try {bw.close();} catch(IOException e) {}
			
			if(socket!=null) try {socket.close();} catch(IOException e) {}
			if(serverSocket!=null) try {serverSocket.close();} catch(IOException e) {}
		}
		System.out.println("끝");
	}

}
