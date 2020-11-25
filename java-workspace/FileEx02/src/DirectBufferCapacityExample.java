import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.IntBuffer;

public class DirectBufferCapacityExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// p. 1120 예제 다이렉트 버퍼 저장용량 확인 
		
		ByteBuffer byteBuffer = ByteBuffer.allocateDirect(100);
		System.out.println("저장용량 : " + byteBuffer.capacity()+"바이트");
		
		CharBuffer charBuffer = ByteBuffer.allocateDirect(100).asCharBuffer();
		System.out.println("저장용량 : " + charBuffer.capacity()+"바이트");
		
		IntBuffer intBuffer = ByteBuffer.allocateDirect(100).asIntBuffer();
		System.out.println("저장용량 : " + intBuffer.capacity()+"바이트");
		
	}

}
