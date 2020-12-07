package pack2;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ServerSocket serverSocket = null;
		Socket socket = null;	

		try {
			serverSocket = new ServerSocket(7777);
			
			// 항시 대기 서버 
			while(true) {
				try {
					System.out.println("서버 시작");
					socket = serverSocket.accept();

					System.out.println("접속 완료");
				} catch(IOException e) {
					System.out.println("[에러] " + e.getMessage());
				} finally {
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
