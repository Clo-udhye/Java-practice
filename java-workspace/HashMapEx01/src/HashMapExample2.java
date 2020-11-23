import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//p. 745 예제 
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		
		map.put(new Student(1,"홍길동"), 90);		//key 값이 동일 
		map.put(new Student(1,"홍길동"), 95);
		
		System.out.println("총 Entry 수  : " + map.size());
	}

}
