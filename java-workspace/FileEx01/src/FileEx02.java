import java.io.File;
import java.io.IOException;
import java.util.Date;

public class FileEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//File f1 = new File("c:\\java");
		File f1 = new File("c:\\java\\test.txt");
		
		//유무확인
		if(f1.exists()) {
			System.out.println("있음");
		} else {
			System.out.println("없음");
		}
		
		//디렉토리 생성 / 파일 생성
		File f2 = new File("c:\\java\\dir");
		//make directory
		if(f2.mkdir()) {
			System.out.println("생성완료");
		}
		
		File f3 = new File("c:\\java\\test2.txt");
		try {
			if(f3.createNewFile()) {
				System.out.println("생성완료");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(f3.getName());	// 파일의 이름
		System.out.println(f3.getParent());	// 파일이 속한 디렉토리 이름
		System.out.println(f3.getPath());	// 파일의 경로
		
		// canExcute : 실행가능 true/false / canRead : 읽기가능 true/false  / canWrite : 쓰기가능 true/false
		// isHidden	: 숨김상태 true/false
		// isAbsolute  : 절대경로설정 true/false
		
		if(f3.isHidden()) {
			System.out.println("숨김파일 입니다.");
		} else {
			System.out.println("일반파일 입니다.");
		}
		
		//length()	: 크기
		//lastModified() : 마지막수정일
		
		File f4 = new File("c:\\java\\Java.7z");
		long filesize = f4.length();
		System.out.println(filesize + " byte");	// byte/1024 -> Kbyte
		System.out.println(filesize/1024. + "Kbyte");
		
		// API
		long filedate = f3.lastModified();
		Date date = new Date(filedate);
		System.out.println(date.toLocaleString());
		
		
		
		
	}

}
