import java.io.File;

public class FileEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 파일(디렉토리 포함) 생성/이름변경/삭제
		// 생성 : mkdir() / createNewFile()
		
		File f = new File("c:\\java", "test.txt");
		File f1 = new File("c:\\java", "newtest.txt");
		
		//같은 디렉토리에 있으면 이름변경 / 다른 디렉토리이면 이동 
		/*
		if(f.renameTo(f1)) {
			System.out.println("변경 완료");
		} else {
			System.out.println("변경 실패");
		}
		*/
		if(f1.delete()) {
			System.out.println("삭제 완료");
		} else {
			System.out.println("삭제 실패");
		}
		
		
		
		
	}

}
