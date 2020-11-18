class Parent{
    Parent(){
        System.out.println("Parent 생성자");
    }
}

class Child extends Parent{
    Child(){
        System.out.println("Child 생성자");
    }
}

public class PolyEx01{
    public static void main(String[] args){
        Parent p1 = new Parent();
        Child c1 = new Child();

        //얕은 복사
        Child c2 = c1;
        System.out.println(c1);
        System.out.println(c2);

        //자동 형변환
        Parent p2 = c1;             //부모는 자식클래스로 만들어질수있다
        System.out.println(p2);
        System.out.println(c1);
        Parent p3 = new Child();

        // 모든 클래스는 Object로 자동형변환 가능 
        Object o1 = new Child();
        Object o2 = new Parent();

        //강제 형변환 
        Child c3 = (Child)p2;       // 자식클래스로 만들어진 부모는 해당 자식 클래스로 돌아갈수있다.
        //Child c4 = (Child)p1;   //Exception
        //Child c5 = (Child)new Parent();   //Exception
        
    }
}