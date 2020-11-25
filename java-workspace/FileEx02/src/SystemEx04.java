import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			// 무한 입력
			while(true) {
				System.out.print("데이터 입력 : ");
				String data = br.readLine();
				if(data.equals("exit")) {
					break;
				}
				System.out.println(">> " + data);
			}
			System.out.println("프로그램 종료");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(br!=null) try {br.close();} catch(IOException e) {}
		}
	}

}
