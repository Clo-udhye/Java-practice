package bank;

public class User2 extends Thread{
	private Calculator calculator;
	
	public void setCalulator(Calculator calculator) {
		this.setName("User2");
		this.calculator = calculator;
	}
	
	@Override
	public void run() {
		calculator.setMemory(50);
	}
}
