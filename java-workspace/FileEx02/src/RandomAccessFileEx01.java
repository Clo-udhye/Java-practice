import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.RandomAccess;

public class RandomAccessFileEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RandomAccessFile raf = null;
		try {
			//r - read only 모드
			//rw = read / write가 동시에 진행 
			raf = new RandomAccessFile("./score.dat", "rw");
			
			int[] scores = {
				1, 100, 90, 90,
				2, 70, 90, 100,
				3, 100, 100, 70,
			};
			for(int i=0; i<scores.length; i++) {
				raf.writeInt(scores[i]);
				
				System.out.println("쓰기위치 : " + raf.getFilePointer()); //Pointer의 위치, 데이터의 사이즈만큼 옮겨가면서 쓰기
			}
			System.out.println("출력 완료");
			
			raf.seek(0);//Pointer의 위치(읽을 위치)를 바꾸기
			
			while( true ) {// break직접처리 불가 , 끝까지 읽으면 EOFException 
				System.out.println(raf.readInt());
			}
		}catch (EOFException e){//End of file
		System.out.println("읽기 종료");
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(raf != null)try {raf.close();}catch(IOException e) {}
		}
	}

}
