package pack2;

public class ThreadEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Thread 클래스를 상속한 클래스의 스레드 실행 
		
		Go g = new Go();
		Come c = new Come();

		//g.run();
		//c.run();

		// start() : 스레드 시작
		System.out.println("시작");
		g.start();
		c.start();
		System.out.println("종료");
	}

}
