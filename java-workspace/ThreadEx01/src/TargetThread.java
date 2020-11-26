
public class TargetThread extends Thread {
	@Override
	public void run() {
		
		for(long i=0; i<=1000000000; i++) {}
		
		try {
			//1.5초간 일시정지
			Thread.sleep(1500);
		} catch (InterruptedException e) {}
		
		for(long i=0; i<=1000000000; i++) {}
	}
}
