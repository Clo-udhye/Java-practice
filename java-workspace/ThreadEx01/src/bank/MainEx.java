package bank;

public class MainEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 공유 객체 동기화 
		// 스레드 때문에 통잔 잔고가 마이너스가 되는 일이 벌어질수있다.
		// => synchronized 키워드의 추가로 한번에 한 스레드만 메서드를 실행하도록 함 
		
		Account account = new Account();
		
		Client client1 = new Client(account);
		Client client2 = new Client(account);
		
		Thread t1 = new Thread(client1);
		Thread t2 = new Thread(client2);
		
		t1.start();
		t2.start();
	}

}
