class Parent{
    void method1(){
        System.out.println("Parent-method1()");
    }
    
    void method2(){
        System.out.println("Parent-method2()");
    }
}

class Child extends Parent{
    @Override
    void method2(){
        System.out.println("Child-method2()");
    }
    
    void method3(){
        System.out.println("Child-method3()");
    }
}

public class ChildExample{
    public static void main(String[] args){
        Child child = new Child();

        Parent parent = child;
        parent.method1();
        parent.method2();
        //parent.method3();     // Child만 가진 메서드는 호출 불가능
    }
}