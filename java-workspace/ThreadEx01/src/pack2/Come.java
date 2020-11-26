package pack2;

public class Come extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=1; i<=50; i++) {
			System.out.println("come : " + i);
		}
	}
}
