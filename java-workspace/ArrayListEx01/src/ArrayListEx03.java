import java.util.ArrayList;

public class ArrayListEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 문자열 자료를 넣는 ArrayList
		ArrayList<String> al1 = new ArrayList<String>();
		//Integer 
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		
		al1.add("이몽룡");
		al1.add("박문수");
		//al1.add(1);
		
		al2.add(1);
		al2.add(2);
		//al2.add("박문수");
	
		for(String str : al1) {
			System.out.println(str);
		}
		
		// 데이터 수정
		// set(intdex,"바꿀 문자열")
		al1.set(0, "월매");	
		for(String str : al1) {
			System.out.println(str);
		}
		
		// 데이터 삭제
		// 하나지우기 - remove, 전체지우기 - removeAll, clear
		al1.remove(0);
		for(String str : al1) {
			System.out.println(str);
		}
	}
}
