package pack5;

public class Gugudan implements Runnable {
	private int dan;
	
	public Gugudan(int dan) {
		this.dan = dan;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println(Thread.currentThread().getName() + " 시작");
		
		for(int i=1; i<=9; i++) {
			//System.out.println(dan + " x " + i + " = " + (dan * i));
			System.out.printf("%s x %s  = %s\n", dan, i, (dan * i));
		}
	}
}
