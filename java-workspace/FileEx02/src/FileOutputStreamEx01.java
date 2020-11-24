import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileOutputStream fos = null;
		
		try {
			// 파일이 없으면 생성
			// 파일이 있으면 덮어쓰기
			fos = new FileOutputStream("./newtest.txt");
			
			fos.write('1');
			fos.write('1');
			fos.write('1');
			fos.write('1');
			fos.write('1');
			//fos.write('\r'); //windows 전용버전
			fos.write('\n');
			fos.write('2');
			fos.write('2');
			fos.write('2');
			fos.write('2');
			System.out.println("출력 완료");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(fos != null) try { fos.close(); } catch(IOException e) {}
		}
	}

}
