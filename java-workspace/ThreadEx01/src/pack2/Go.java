package pack2;

public class Go extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		// 스레드에 작업할 (병렬 처리할) 내용
		
		for(int i=1; i<=50; i++) {
			System.out.println("go : " + i);
		}
	}
}
