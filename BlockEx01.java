class CodeBlock{
    //멤버필드의 초기화
    String name1;
    static String name2;    
    {   
        //간접적으로 실행문을 쓰기위해 블럭을 사용 but 생성자를 쓰는 것이 좋다
        System.out.println("인스턴스 초기화 블럭");
        this.name1 = "홍길동";
    }
    static {
        System.out.println("클래스 초기화 블럭");
        CodeBlock.name2 = "박문수";
    }
}
public class BlockEx01{
    public static void main(String[] args){
        System.out.println("시작");
        CodeBlock cb = new CodeBlock();
        System.out.println(cb.name1);
        System.out.println(CodeBlock.name2);
        System.out.println("끝");
    }
}