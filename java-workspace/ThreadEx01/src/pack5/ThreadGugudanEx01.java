package pack5;

public class ThreadGugudanEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 구구단 단수를 입력받아 출력하는 스레드 작성 - 익명 클래스 이용
		
		int dan1 = 3;
		int dan2 = 6;
		
		Thread t1 = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=1; i<=9; i++) {
					System.out.printf("%s x %s  = %s\n", dan1, i, (dan1 * i));
				}
			}
			
		});
		
		Thread t2 = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=1; i<=9; i++) {
					System.out.printf("%s x %s  = %s\n", dan2, i, (dan2 * i));
				}
			}
			
		});
		
		t1.start();
		t2.start();
	}

}
