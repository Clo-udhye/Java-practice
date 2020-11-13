class Parent{
    final void viewParent(){    //final메서드는 오버라이드될수없다
        System.out.println("Parent viewParent() 호출");
    }
}

class Child extends Parent{
    //오버라이드
    void viewParent(){
        System.out.println("Child viewParent() 호출");
    }
}

public class InheritanceEx06{
    public static void main(String[] args){
        Child c1 = new Child();
        c1.viewParent();
    }
}