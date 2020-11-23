import java.text.MessageFormat;

public class MessageFormatExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// p.548 예제
		
		String id = "java";
		String name = "신용권";
		String tel = "010-123-5678";
		
		String text = "회원 ID : {0} \n회원이름 : {1} \n회원 전화 : {2}";
		String result = MessageFormat.format(text, id, name, tel);
		System.out.println(result);
	}

}
