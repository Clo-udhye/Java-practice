package gugudan;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPGugudanClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 서버에 단수를 보내고 구구단 문자열을 받아 출력
		
		Socket socket = null;
		
		BufferedWriter bw = null;
		BufferedReader br = null;
		
		try {
			socket = new Socket("localhost", 7777);
			
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			bw.write("5" + "\n");
			bw.flush();
			
			String strGugudan = br.readLine();
			strGugudan = strGugudan.replace("<Enter>", "\n");
			
			System.out.println(strGugudan);
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] " + e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("[에러] " + e.getMessage());
		} finally {
			if(bw!=null) try {bw.close();} catch(IOException e) {}
			if(br!=null) try {br.close();} catch(IOException e) {}
			
			if(socket!=null) try {socket.close();} catch(IOException e) {}
		}
	}

}
