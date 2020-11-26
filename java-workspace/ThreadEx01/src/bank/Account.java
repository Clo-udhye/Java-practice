package bank;

public class Account {
	private int balance = 1000;	// 잔고
	
	public int getBalance() {
		return balance;
	}
	
	//출금 메서드
	public synchronized void withdraw(int money) {	//synchronized 키워드의 추가로 한번에 한 스레드만 메서드를 실행하도록 함 
		if(balance>=money) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			//출금
			balance -= money;
		} else {
			System.out.println("잔고가 부족합니다.");
		}
	}
}
