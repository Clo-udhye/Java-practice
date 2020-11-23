import java.io.File;

public class FileEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 디렉토리 - 파일 / 디렉토리 목록

		// list		:String[]
		// listFiles : File[]
		
		File f = new File("c://");
		
		//String[] lists = f.list();
		//for(String list : lists) {
		//	System.out.println(list);
		//}
		
		File[] fileLists = f.listFiles();
		for(File fileList : fileLists) {
			System.out.println(fileList.getName());
		}
	
	}

}
