import java.io.File;

public class FileEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 	문제
		 	c:\\java의 파일 목록을 읽어 출력하기
		 	디렉토리 이름에 [ ]가 붙여서 출력
		 */
		File file = new File("c:\\java");
		
		File[] fileLists = file.listFiles();
		for(File fileList : fileLists) {
			if(fileList.isDirectory()) {
				System.out.println("[" +fileList.getName()+ "]");
			} else {
				System.out.println(fileList.getName());
			}
		}
	}

}
