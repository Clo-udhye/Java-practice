interface InterA{
    String Str1 = "홍길동";
    void methodA();
}

//인터페이스끼리 상속 가능 (extends)
interface InterB extends InterA{
    String Str2 = "박문수";
    void methodB();
}

class Parent {
    Parent(){
        System.out.println("Parent 생성자");
    }
}

class Child extends Parent implements InterB{
    Child(){
        System.out.println("Child 생성자");
    }

    public void methodA(){
        System.out.println("methodA 호출");
    }

    public void methodB(){
        System.out.println("methodB 호출");
    }
}

public class InterfaceEx02{
    public static void main(String[] args){
        Child c = new Child();
        c.methodA();
        c.methodB();
        
    }
}