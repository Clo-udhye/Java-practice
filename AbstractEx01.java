class Parent1 {
    Parent1(){
        System.out.println("Parent1 생성자");
    }
}

// 미완성 -> 인스턴스화 불가능 
// 상속을 통해 완성시킨다
// abstact class <- 추상 메서드  
abstract class Parent2 {    
    Parent2(){
        System.out.println("Parent2 생성자");
    }
}

class Child extends Parent2{
    Child(){
        System.out.println("Child 생성자");
    }
}

public class AbstractEx01{
    public static void main (String[] args){
        Parent1 p1 = new Parent1();
        //Parent2 p2 = new Parent2();   //error 추상클래스는 인스턴스화 불가
        Child c = new Child();
    }
}
