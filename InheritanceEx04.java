class Parent{
    void viewParent(){
        System.out.println("viewParent() 호출");
    }
}

class Child extends Parent{
    
    //재정의 Override
    void viewParent(){
    //void viewParent(int data){ //매개변수의 갯수, 타입, 순서가 다를경우 오버로딩!! 
        System.out.println("child vieParent() 호출");
    }
    void viewChild(){
        super.viewParent(); //부모의 함수를 부르고싶을때
        this.viewParent();  //나의 함수를 부르고 싶을때
        System.out.println("viewChild() 호출");
    }

}

public class InheritanceEx04{
    public static void main(String[] args){
        Child c1 = new Child();
        //c1.viewParent();    //Child의 함수를 호출
        //c1.viewParent(11);
        c1.viewChild();

    }
}