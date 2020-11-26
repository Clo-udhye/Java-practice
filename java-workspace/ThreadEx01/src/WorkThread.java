
public class WorkThread extends Thread {
	public WorkThread(ThreadGroup threadGroup, String threadName) {
		// TODO Auto-generated constructor stub
		super(threadGroup, threadName);
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println(getName() + " interrupted");
				break;
			}
		}
		
		System.out.println(getName() + " 종료");
	}
}
