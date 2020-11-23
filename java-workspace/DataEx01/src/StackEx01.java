import java.util.Stack;

public class StackEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack();
		
		stack.push("박문수");
		stack.push("홍길동");
		stack.push("이몽룡");
		stack.add("월매");	//add도 가능 but push가 더 알맞는 용어 
	
		System.out.println(stack.toString());
		System.out.println(stack.size());
		
		System.out.println(stack.pop());	// 제일 끝에 들어간 item이 먼저 나옴 
		System.out.println(stack.size());
		
	}

}
