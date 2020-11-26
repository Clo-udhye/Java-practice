package pack3;

public class Go implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

		for(int i=1; i<=50; i++) {
			System.out.println("go : " + i);
		}
	}

}
