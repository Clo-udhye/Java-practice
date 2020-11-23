import java.util.LinkedList;
import java.util.Queue;

public class LinkedListEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> queue = new LinkedList<String>();
		queue.offer("홍길동");
		queue.offer("박문수");
		queue.offer("이몽룡");
		
		System.out.println(queue.toString());
		System.out.println(queue.size());
		
		System.out.println(queue.poll());	// 먼저 넣은 item부터 추출

		System.out.println(queue.toString());
		System.out.println(queue.size());
		
		
		//전부다 추출
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
	}

}
