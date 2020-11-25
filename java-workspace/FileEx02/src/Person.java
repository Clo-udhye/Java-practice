import java.io.Serializable;

public class Person implements Serializable{
	//Serializable의 구현 클래스 => 직렬화가능
	/**
	 * 
	 */
	private static final long serialVersionUID = 2201104396491192512L;	
	// generate serialVersionUID
	// 역직렬화 할때 클래스가 수정되었을때 같은 클래스임을 알려주는 식별자


	
	private String name;
	private String phone;
	private int age;
	
	public Person(String name, String phone, int age) {
		super();
		this.name = name;
		this.phone = phone;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", phone=" + phone + ", age=" + age + "]";
	}
	
}
