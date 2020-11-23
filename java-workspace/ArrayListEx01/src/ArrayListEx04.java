import java.util.List;
import java.util.Arrays;

public class ArrayListEx04 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> al1 = Arrays.asList("홍길동", "신용권", "김자바");
		
		// 검색
		int index = al1.indexOf("김자바");
		System.out.println(index);
	}

}
