import com.exam.Car;	//ctrl + space 로 자동 추가 가능

public class JavaEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello Java");
		
		Car car = new Car();
		System.out.println( car.toString() );
		
		Car car1 = new Car("tester1", 4, "red");
		System.out.println( car1.toString() );
	}
}