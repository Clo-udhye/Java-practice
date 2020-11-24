import java.io.File;

public class FileEx04_ver2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
	 		문제 _ 강사님 버전
	 		c:\\java의 파일 목록을 읽어 출력하기
	 		디렉토리 이름에 [ ]가 붙여서 출력
		*/
		
		// 디렉토리 내부의 디렉토리나 파일 목록
		// list() 		- String[]
		// listFiles() 	- File[]
		
		
		File f = new File("c:\\java");
		/*
		String[] lists = f.list();
		for(String list : lists) {
			// isDirectory / isFile
			File subfile = new File("c:\\java\\"+list);
			if(subfile.isDirectory()) {
				// 디렉토리
				System.out.println("["+ list + "]");
			} else {
				// 파일
				System.out.println(list);
			}
		}
		*/
		
		File[] lists = f.listFiles();
		for(File list : lists) {
			if(list.isDirectory()) {
				System.out.println("["+ list.getName() + "]");
			} else {
				System.out.println(list.getName());
			}
		}
		
	}

}
