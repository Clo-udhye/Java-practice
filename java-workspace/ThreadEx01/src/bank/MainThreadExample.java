package bank;

public class MainThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// p.591 예제 
		Calculator calculator = new Calculator();
		User1 user1 = new User1();
		user1.setCalulator(calculator);
		user1.start();

		User2 user2 = new User2();
		user2.setCalulator(calculator);
		user2.start();

	}

}
