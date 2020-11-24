
public class Member implements Comparable<Member> {
	// sort 하기위해서는 Comparable의 구현 클래스이어야함
	private int serial;
	private String name;
		
	public Member(String name) {
		this(1111, name);
	}
	
	public Member(int serial, String name) {
		this.serial = serial;
		this.name = name;
	}

	
	public String getName() {
		return name;
	}

	@Override	
	public int compareTo(Member arg0) {
		// TODO Auto-generated method stub
		return name.compareTo(arg0.name);	//name으로 sort
	}
	
}
