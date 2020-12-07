package pack5;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class GugudanClientEx01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Socket socket = null;
		
		BufferedReader br = null;
		BufferedWriter bw = null;
		
		try {
			socket = new Socket("localhost", 7777);
		
			bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), "utf-8"));
			br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "utf-8"));
			
			bw.write(args[0] + "\n");		// eclipse에서 main에 args 보내기 
			bw.flush();						// Run as -> Run Configurations -> Arguments -> Program arguments
			//System.out.println("전송 완료");	
			
			String msg = null;
			while((msg=br.readLine())!=null) {
				System.out.println(msg);
			}
			
			
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
