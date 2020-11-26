
public class ThreadEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadGroup threadGroup = new ThreadGroup("myGroup");
		
		WorkThread workThreadA = new WorkThread(threadGroup, "workTreadA"); //스레드 그룹에 넣음 
		WorkThread workThreadB = new WorkThread(threadGroup, "workTreadB");
		//workThreadA.setPriority(3);
		
		workThreadA.start();
		workThreadB.start();
		
		System.out.println("리스트 보기 : ");
		ThreadGroup group = Thread.currentThread().getThreadGroup(); // 현재 실행중인 스레드 그룹
		group.list(); 	//Prints information about this thread group to the standardoutput. 
						//Thread[ThreadName,Priority,GroupName]
		System.out.println();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("interrupt");
		group.interrupt();// 그룹 내의 스레드 전부 정지 
	}

}
