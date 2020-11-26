
public class ThreadEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("시작");
		
		try {
			Thread.sleep(1000);	// sleep(ms) : (ms/1000)초간 일시정지
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("끝");
	}

}
