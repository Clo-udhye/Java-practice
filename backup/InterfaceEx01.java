//인터페이스 선언
interface InterA{
    //상수
    public static final String STR1 = "홍길동";
    String STR2 = "박문수"; //인터페이스안의 필드는 전부 상수이기때문에 생략가능
    
    //추상메서드
    public abstract void methodA();
    void methodB();  //인터페이스안의 메서드는 전부 추상메서드이기때문에 생략가능
}

interface InterB{
    String STR1 = "이몽룡";
    void methodC();
}

/*
//구현
class ClassA implements InterA{
    public void methodA(){
        System.out.println("methodA 호출");
    }

    public void methodB(){
        System.out.println("methodB 호출");
    }
}
*/

//다중 구현
class ClassA implements InterA, InterB{
    public void methodA(){
        System.out.println("methodA 호출");
    }

    public void methodB(){
        System.out.println("methodB 호출");
    }

    public void methodC(){
        System.out.println("methodC 호출");
    }
}

public class InterfaceEx01{
    public static void main(String[] args){
        ClassA ca = new ClassA();
        ca.methodA();
        ca.methodB();
        ca.methodC();
        
        System.out.println(InterA.STR1);
        System.out.println(InterB.STR1);
        
        //System.out.println(ClassA.STR1); //error - ambiguous
    
        
    }
}