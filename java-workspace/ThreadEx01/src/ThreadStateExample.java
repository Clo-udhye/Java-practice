
public class ThreadStateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//p.600 예제 스레드 상태 출력 예제 
		
		StatePrintThread statePrintThread = new StatePrintThread(new TargetThread());
		statePrintThread.start();
	}

}
