class Parent{
    Parent(String data){
        System.out.println("Parent 생성자 :\t" + this);
    }

    void viewParent(){
        System.out.println("viewParent() 호출");
    }
}

class Child extends Parent{
    Child(String data){
        super(data);
        System.out.println("Child 생성자 :\t" + this);
    }
    /*
    void viewChild(){
        System.out.println("viewChild() 호출");
    }*/

}

public class InheritanceEx03{
    public static void main(String[] args){
        Child c1 = new Child("데이터");
        c1.viewParent();

    }
}