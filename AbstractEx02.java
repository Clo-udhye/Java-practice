class Parent1 {
    Parent1(){
        System.out.println("Parent1 생성자");
    }
    //추상 메서드 : {} - 내용에 대한 구현 , => 추상 메소드에는 {}이 없다
    //abstract void viewParent1();
}

abstract class Parent2 {    
    Parent2(){
        System.out.println("Parent2 생성자");
    }
    abstract void viewParent2();
}

}

public class AbstractEx02{
    public static void main (String[] args){
        //Parent1 p1 = new Parent1(); //error : 추상 메서드가 있으면 반드시 추상화 되어야함 
    
    }
}
