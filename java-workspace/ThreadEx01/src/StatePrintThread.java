
public class StatePrintThread extends Thread {
	private Thread targetThread;

	public StatePrintThread(Thread targetThread) {	//상태를 조사할 스레드
		this.targetThread = targetThread;
	}
	
	@Override
	public void run() {
		while(true) {
			Thread.State state = targetThread.getState(); //스레드 상태 얻기
			System.out.println("타겟 스레드 상태 : " + state);
			
			if(state == Thread.State.NEW) {	// 객체 생성상태일 경우 실행 대기상태로 만듬
				targetThread.start();
			}
			
			if(state == Thread.State.TERMINATED) {	// 종료 상태일 경우 루프 종료
				break;
			}
			
			try {
				//0.5초간 일시정지
				Thread.sleep(500);
			} catch (InterruptedException e) {}
		}
	}
	
}
