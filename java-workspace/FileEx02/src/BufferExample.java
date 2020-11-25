import java.nio.Buffer;
import java.nio.ByteBuffer;

public class BufferExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// p.1129 예제 BufferExample
		
		System.out.println("[7바이트 크기로  버퍼 생성]");
		ByteBuffer buffer = ByteBuffer.allocateDirect(7);	//다이렉트 버퍼 생성
		printState(buffer);
		
		buffer.put((byte)10);	// 상대적 저장
		buffer.put((byte)11);
		System.out.println("[2바이트 저장 후]");
		printState(buffer);
		
		buffer.put((byte)12);	// 상대적 저장
		buffer.put((byte)13);
		buffer.put((byte)14);
		System.out.println("[3바이트 저장 후]");
		printState(buffer);
		
		buffer.flip();		// 데이터를 읽기 위해 위치 속성값 변경
		System.out.println("[flip() 실행 후]");
		printState(buffer);
		
		buffer.get(new byte[3]);	// 상대적 읽기
		System.out.println("[3바이트 읽은 후]");
		printState(buffer);
		
		buffer.mark();		// 마크하기
		System.out.println("---------[현재위치에 마크 해놓음]");
		
		buffer.get(new byte[2]);	// 상대적 읽기
		System.out.println("[2바이트 읽은 후]");
		printState(buffer);
		
		buffer.reset();		// 마크위치로 position 이동
		System.out.println("[reset() 실행 후]");
		printState(buffer);
		
		buffer.rewind();	// position을 0으로 이동
		System.out.println("[rewind() 실행 후]");
		printState(buffer);
		
		buffer.clear();		// 모든 위치 속성값 초기화
		System.out.println("[clear() 실행 후]");
		printState(buffer);
		
		
	}
	public static void printState(Buffer buffer) {
		System.out.print("\tposition : " + buffer.position() + ", ");
		System.out.print("\tlimit : " + buffer.limit() + ", ");
		System.out.println("\tcapacity : " + buffer.capacity());
	}

}
