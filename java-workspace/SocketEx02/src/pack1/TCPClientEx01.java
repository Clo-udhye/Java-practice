package pack1;

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
		
		Socket socket = null;
		
		BufferedWriter bw = null;
		BufferedReader br = null;
		
		try {
			socket = new Socket("localhost", 7777);
			
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), "utf-8"));
			br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "utf-8"));
			
			bw.write("Hello Server" + "\n");
			bw.flush();
			System.out.println("전송 완료");
			
			String msg = br.readLine();
			System.out.println("서버 메세지 : " + msg);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] " + e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] " + e.getMessage());
		} finally {
			if(br!=null) try {br.close();} catch(IOException e) {}
			if(bw!=null) try {bw.close();} catch(IOException e) {}
			
			if(socket!=null) try {socket.close();} catch(IOException e) {}
		}
	}
}
