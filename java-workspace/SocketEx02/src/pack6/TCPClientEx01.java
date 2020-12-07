package pack6;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPClientEx01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Socket socket = null;
		BufferedWriter bw = null;
		
		try {
			socket = new Socket("localhost", 7777);
			
			System.out.println("접속 완료");
		
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), "utf-8"));
			bw.write(args[0]);
			bw.flush();
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] " + e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] " + e.getMessage());
		} finally {
			
			if(socket!=null) try {socket.close();} catch(IOException e) {}
		}
	}
}
