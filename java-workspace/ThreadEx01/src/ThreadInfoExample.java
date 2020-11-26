import java.util.Map;
import java.util.Set;

public class ThreadInfoExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// p.621 예제 현재 실행중인 프로세스 정보 
		
		AutoSaveThread autoSaveThread = new AutoSaveThread();
		autoSaveThread.setName("AutoSaveThread");
		autoSaveThread.setDaemon(true);
		autoSaveThread.start();
		
		Map<Thread, StackTraceElement[]> map = Thread.getAllStackTraces();
		Set<Thread> threads = map.keySet();
		
		for(Thread thread : threads) {
			System.out.println("Name : " + thread.getName() + ((thread.isDaemon())?"(데몬)" : "(주)"));
			System.out.println("\t" + "소속 그룹 : " + thread.getThreadGroup().getName());
			System.out.println();
		}
	}

}
