
public class JoinExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//p. 607예제 다른 스레드가 종료될 때까지 일시정지 상태 유지
		
		SumThread sumThread = new SumThread();
		sumThread.start();
		
		try {
			sumThread.join();	//sumThread가 종료될 때까지 메인 스레드를 정지시킴
		} catch (InterruptedException e) {}
		
		System.out.println("1~100까지 합 : " + sumThread.getSum());
	}

}
