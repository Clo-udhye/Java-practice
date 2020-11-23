import java.util.ArrayList;

public class ArrayListEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 데이터 안정성
		// 자료구조 내부에 동일 자료를 넣는다 
		
		ArrayList al1 = new ArrayList();
		ArrayList<String> al2 = new ArrayList<String>();	//제네릭을 사용하면 해당 자료형만 저장 가능
	
		// Object
		al1.add( "박문수" );	// String -> Object	
		al1.add( "이몽룡" );
		//al1.add( 1 );		//int -> Integer -> Object
		
		// 데이터를 가져올때
		for(int i=0; i<al1.size(); i++) {
			// 형변환을 거쳐 가져옴
			String str = (String)al1.get(i);	// String이 아닌 데이터가 있으면 에러
			System.out.println(str);
		}
		
		al2.add("이몽룡");	
		//al2.add(1); //error
		al2.add("박문수");
		for(String str : al2) {
			System.out.println(str);
		}
		
	}

}
