package pack4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.ServerSocket;
import java.net.Socket;

public class GugudanServerEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket serverSocket = null;
		Socket socket = null;	

		BufferedReader br = null;
		BufferedWriter bw = null;

		try {
			serverSocket = new ServerSocket(7777);

			// 항시 대기 서버 
			while(true) {
				try {
					System.out.println("서버 시작");
					socket = serverSocket.accept();
					
					br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "utf-8"));
					bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), "utf-8"));
					
					String dan = br.readLine();
					System.out.println("구구단 생성 : " + dan);
					
					StringBuffer msg = new StringBuffer();
					for(int i=1; i<=9; i++) {
						msg.append(dan+"X"+i+"="+(Integer.parseInt(dan)*i) + ":");
					}
					
					bw.write(msg.toString() + "\n");
					bw.flush();

					System.out.println("전송 완료");

				} catch(IOException e) {
					System.out.println("[에러] " + e.getMessage());
				} finally {
					if(br!=null) try {br.close();} catch(IOException e) {}
					if(bw!=null) try {bw.close();} catch(IOException e) {}

					if(socket!=null) try {socket.close();} catch(IOException e) {}
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] " + e.getMessage());
		} finally {
			if(serverSocket!=null) try {serverSocket.close();} catch(IOException e) {}
		}
	}

}
