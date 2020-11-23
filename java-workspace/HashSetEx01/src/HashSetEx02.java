import java.util.HashSet;

public class HashSetEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Member m1 = new Member("홍길동", 25);
		Member m2 = new Member("홍길동", 25);
		
		// 내용은 같으나 참조값이 틀린 멤버
		HashSet<Member> hs = new HashSet<Member>();
		hs.add(m1);
		hs.add(m2);
		
		System.out.println(hs.size());
	}

}
