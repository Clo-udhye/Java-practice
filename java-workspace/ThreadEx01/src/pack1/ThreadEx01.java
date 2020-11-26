package pack1;

public class ThreadEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Go g = new Go();
		Come c = new Come();
		
		// 메인 스레드의 순차처리
		g.run();
		c.run();
	}

}
