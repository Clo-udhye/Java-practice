package pack5;

public class ThreadEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 구구단 단수를 입력받아 출력하는 스레드 작성 - Runnable 인터페이스의 구현
		
		Thread t1 = new Thread(new Gugudan(3));
		Thread t2 = new Thread(new Gugudan(6));
		
		t1.setName("3단 구구단");	// Thread이름 설정 (default - Thread-0 .. );
		t2.setName("6단 구구단");
		
		t1.start();
		t2.start();
	}

}
