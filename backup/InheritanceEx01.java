class SubParent{

}

class Parent extends Object {
    //has~a 관rP\\계
    SubParent sp;
    String p;
    void viewParent(){
        System.out.println("viewParent() 호출");
    }
}

/*
class Child1{ //독립된 클래스
    String c1;
    void viewChild1(){
        System.out.println("viewChild1() 호출");
    }
}
*/

//is~a 관계
class Child1 extends Parent {   //상속된 클래스 
    String c1;
    void viewChild1(){
        System.out.println("viewChild1() 호출");
    }
}

class Child2 extends Parent {   //상속된 클래스 
    String c2;
    void viewChild2(){
        System.out.println("viewChild2() 호출");
    }
}

public class InheritanceEx01{
    public static void main(String[] args){
        Parent p = new Parent();
        p.viewParent();

        Child1 c1 = new Child1();
        c1.viewChild1();
        c1.viewParent();
    
        c1.c1 = "홍길동";
        c1.p = "박문수";

        System.out.println(c1.c1);
        System.out.println(c1.p);

        Child2 c2 = new Child2();
        c2.viewChild2();
        c1.viewParent();

    }
}