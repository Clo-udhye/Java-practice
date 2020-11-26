package pack4;

public class ThreadEx01 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//익명클래스를 이용한 스레드 실행 (인터페이스 이용)

		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=1; i<=50; i++) {
					System.out.println("go : " + i);
				}
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=1; i<=50; i++) {
					System.out.println("come : " + i);
				}
			}
		});
		
		System.out.println("시작");
		t1.start();
		t2.start();
		System.out.println("종료");
		
	}
}
