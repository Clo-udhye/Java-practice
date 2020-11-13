public class Ex01{ 
    public static void main(String[] args){
        //ln : + 엔터키(줄바꿈)
        System.out.println("안녕 자바");
        System.out.println("안녕 자바");

        System.out.print("안녕 자바");
        System.out.print("안녕 자바\n");

        System.out.println("안녕" + "자바");
        System.out.println("안녕" +123+ "자바");

        //형식대로 출력
        //printf("데이터형식지정", 데이터);       
        System.out.printf("%s %s %s", "안녕", "자바", "hello"); //%s=> 문자열 
    }
}