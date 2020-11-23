import java.io.File;

public class FileEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// java.io.File
		// 파일이나 디렉토리 (없으면 - 생성 / 있으면 - 관리)
		
		// 디렉토리 - 절대경로
		File f1 = new File("c:\\java");	//window 표기법
		File f2 = new File("c:/java");	//unix
		
		// 파일
		File f3 = new File("c:\\java\\text.txt");
		File f4 = new File("c:/java/text.txt");
		
		//상대경로
		File f5 = new File("./java");
	}

}
