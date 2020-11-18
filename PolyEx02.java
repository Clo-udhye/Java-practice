class Parent{
    Parent(){
        System.out.println("Parent 생성자");
    }

    void viewParent1(){
        System.out.println("viewParent1()");
    }

    void viewParent2(){
        System.out.println("viewParent2()");
    }
}

class Child extends Parent{
    Child(){
        System.out.println("Child 생성자");
    }
    
    void viewChild1(){
        System.out.println("viewChild1()");
    }

    //override
    void viewParent2(){
        System.out.println("Child viewParent2()");
    }
}

public class PolyEx02{
    public static void main(String[] args){
        Child c1 = new Child();
        Parent p1 = new Child();

        c1.viewParent1();
        p1.viewParent1();

        c1.viewChild1();
        //p1.viewChild1();  //error 자식 고유의 것에는 접근 불가 

        c1.viewParent2();
        p1.viewParent2();   //Child의 메서드 호출 

    }
}