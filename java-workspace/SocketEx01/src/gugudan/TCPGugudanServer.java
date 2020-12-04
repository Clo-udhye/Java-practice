package gugudan;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPGugudanServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 클라이언트에게 단수를 받고 구구단 문자열을 만들어서 보내기
		
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			serverSocket = new ServerSocket(7777); // 서버준비
			socket = serverSocket.accept();	// 연결 대기
			
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			String dan = br.readLine();
			
			String strGugudan = "";
			for(int i=1; i<=9; i++ ) {
				strGugudan += dan + " x " + i + " = " + (Integer.parseInt(dan)*i +"<Enter>");
			}
			
			bw.write(strGugudan + "\n");
			bw.flush();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] " + e.getMessage());
		} finally {
			if(br!=null) try {br.close();} catch(IOException e) {}
			if(bw!=null) try {bw.close();} catch(IOException e) {}
			
			if(socket!=null) try {socket.close();} catch(IOException e) {}
			if(serverSocket!=null) try {serverSocket.close();} catch(IOException e) {}
		}
		
		
	}

}
