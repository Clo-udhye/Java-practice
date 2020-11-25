import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileChannelEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//p. 1138 파일 채널 생성 및 쓰기

		Path srcFile = Paths.get("./channel.txt"); 
		Charset utf8 = Charset.forName("utf-8");

		FileChannel writeChannel = null;

		try {
			// 파일 채널 생성 , option : 없으면 만들고 써라
			writeChannel = FileChannel.open(srcFile, StandardOpenOption.CREATE, StandardOpenOption.WRITE);	//(path, option)

			String msg = "Hello FileChannel";			
			ByteBuffer bytebuffer = utf8.encode(msg);	//버퍼에 쓴다
			
			int byteCount = writeChannel.write(bytebuffer);	// 파일에 데이터 쓰기

			System.out.println("출력 완료 : " + byteCount );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(writeChannel!=null) try {writeChannel.close();} catch(IOException e) {}
		}

	}

}
