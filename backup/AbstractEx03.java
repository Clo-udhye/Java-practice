abstract class Parent1 {    
    Parent1(){
        System.out.println("Parent1 생성자");
    }
    abstract void viewParent1();
}

class Child1 extends Parent1{
    Child1(){
        System.out.println("Child1 생성자");
    }

    //추상화 메서드의 구현
    void viewParent1(){
        System.out.println("viewParent1 호출");
    };   
}

abstract class Child2 extends Parent1{  // 추상메서드를 구현 안하면 Child도 추상클래스
    Child2(){
        System.out.println("Child2 생성자");
    }   
}

class GrandChild2 extends Child2{
    GrandChild2(){
        System.out.println("GrandChild2 생성자");
    }

    void viewParent1(){
        System.out.println("viewParent1 호출");
    };   
}
public class AbstractEx03{
    public static void main (String[] args){
        Child1 c = new Child1();
        c.viewParent1();

        GrandChild2 gc2 = new GrandChild2();
        gc2.viewParent1();
    
    }
}
