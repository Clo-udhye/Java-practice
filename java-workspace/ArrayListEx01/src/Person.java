
public class Person {
	private String jumin;
	private String name;
	private int age;
	
	// 생성자
	// setter 대용
	public Person(String jumin, String name, int age) {
		this.jumin = jumin;
		this.name = name;
		this.age = age;
	}

	@Override
	// getter 대용
	public String toString() {
		return "Person [jumin=" + jumin + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
	
	
}
