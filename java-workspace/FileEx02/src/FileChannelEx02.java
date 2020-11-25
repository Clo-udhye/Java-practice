import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileChannelEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//p.1139 파일 읽기
		
		Path srcFile = Paths.get("./channel.txt");
		
		FileChannel readChannel = null;
		
		try {
			// 파일 채널 생성
			readChannel = FileChannel.open(srcFile, StandardOpenOption.READ);
			
			ByteBuffer byteBuffer = ByteBuffer.allocate(100);
			
			Charset charset = Charset.defaultCharset();
			String data = "";
			int byteCount;
			
			while(true) {
				byteCount = readChannel.read(byteBuffer);	// 파일로부터 데이터 읽기
				if(byteCount == -1) break;
				byteBuffer.flip();
				data += charset.decode(byteBuffer).toString();
				byteBuffer.clear();
			}
			
			System.out.println("channel.txt : " + data );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(readChannel!=null) try {readChannel.close();} catch(IOException e) {}
		}
		
	}

}
