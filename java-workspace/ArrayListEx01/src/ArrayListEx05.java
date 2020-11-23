import java.util.ArrayList;

public class ArrayListEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 배열 + 객체 : 2차원 배열
		Person p1 = new Person("1111", "홍길동", 25);
		Person p2 = new Person("1112", "박문수", 35);
		Person p3 = new Person("1113", "강감찬", 45);
		
		ArrayList<Person> al = new ArrayList<Person>();
		al.add(p1);
		al.add(p2);
		al.add(p3);
		
		for(Person p : al) {
			System.out.println(p.toString());
		}
		
	}

}
