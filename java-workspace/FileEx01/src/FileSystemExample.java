import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class FileSystemExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		//p.1106 예제
		FileSystem fileSystem = FileSystems.getDefault();
		for(FileStore store:fileSystem.getFileStores()) {
			System.out.println("드라이버명 : " + store.name());
			System.out.println("파일시스템 : " + store.type());
			System.out.println("전체 공간 : " + store.getTotalSpace());
			System.out.println("사용중인 공간 : " + (store.getTotalSpace() - store.getUnallocatedSpace()));
			System.out.println("사용가능한 공간 : " + store.getUnallocatedSpace());
			System.out.println();
		}
		System.out.println("파일 구분자 : " + fileSystem.getSeparator());
		System.out.println();
		
		for(Path path : fileSystem.getRootDirectories()) {
			System.out.println(path.toString());
		}
	}

}
