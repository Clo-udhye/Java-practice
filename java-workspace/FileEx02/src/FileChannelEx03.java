import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileChannelEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// p. 1140 예제 파일 복사
		Path from = Paths.get("./Jellyfish.jpg");
		Path to = Paths.get("./copy_Jelly_fish.jpg");
		
		FileChannel readChannel = null;
		FileChannel writeChannel = null;
		
		try {
			readChannel = FileChannel.open(from, StandardOpenOption.READ);
			writeChannel = FileChannel.open(to, StandardOpenOption.CREATE, StandardOpenOption.WRITE);
			
			ByteBuffer buffer = ByteBuffer.allocate(100);
			int byteCount;
			
			while(true) {
				buffer.clear();
				byteCount = readChannel.read(buffer);
				if(byteCount == -1) break;
				buffer.flip();
				writeChannel.write(buffer);
			}
			
			System.out.println("파일 복사 성공");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(readChannel!=null) try {writeChannel.close();} catch(IOException e) {}
			if(writeChannel!=null) try {writeChannel.close();} catch(IOException e) {}
		}
	}

}
