package pack3;

public class ThreadEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Runnable 인터페이스를 구현한 클래스의 스레드 실행 
		
		Go g = new Go();
		Come c = new Come();
		
		Thread t1 = new Thread(g);
		Thread t2 = new Thread(c);
		
		System.out.println("시작");
		t1.start();
		t2.start();
		System.out.println("끝");
	}

}
