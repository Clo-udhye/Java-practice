import java.util.Arrays;

public class ArraysEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사용자 정의 클래스의 sort p.524 
		Member m1 = new Member("홍길동");
		Member m2 = new Member("박동수");
		Member m3 = new Member("김민수");
		
		Member[] members = {m1, m2, m3};
		
		Arrays.sort(members);
		for(int i=0; i<members.length; i++) {
			System.out.println("memebers["+i+"].name = "+members[i].getName());
		}
	}

}
