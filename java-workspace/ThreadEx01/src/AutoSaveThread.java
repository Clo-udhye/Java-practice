
public class AutoSaveThread extends Thread {
	public void save() {
		System.out.println("내용 저장");
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				break;
			}
			save();
		}
	}
}
