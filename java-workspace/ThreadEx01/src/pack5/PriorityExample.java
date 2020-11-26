package pack5;

public class PriorityExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// p. 590 예제 우선순위를 설정해서 스레드 실행
		
		for(int i=1; i<=10; i++) {
			Thread thread = new CalcThread("thread" + i);
			
			if(i!=10) {
				thread.setPriority(Thread.MIN_PRIORITY);
			} else {
				thread.setPriority(Thread.MAX_PRIORITY);
			}
			thread.start();
		}
		
	}

}
