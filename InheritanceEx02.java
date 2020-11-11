class Parent{
    //디폴트 생성자
    /*
    Parent(){
        System.out.println("Parent 생성자 :\t" + this); //this 나 자신의 참조주소
    }
    */
    Parent(String data){
        System.out.println("Parent 생성자 :\t" + this);
    }
}

class Child extends Parent{
    Child(){
        super("홍길동");        //super() : 디폴트가 아닌 다른 생성자를 호출해줄수있다 
        System.out.println("Child 생성자 :\t" + this);
    }
}

public class InheritanceEx02{
    public static void main(String[] args){
        Child c1 = new Child(); //Parent 먼저 메모리가 잡힌다 . -> 부모 생성자가 먼저 호출
        System.out.println("c :\t\t" + c1); 

    }
}