/*class Employee{
    void salary() {
        System.out.println("Employee salary()");
    }
}*/

abstract class Employee{
    abstract void salary();      //상속받으면 반드시 구현!
}

//임원 
class ChildEmployee1 extends Employee{
    //override
    void salary() {
        System.out.println("임원 salary()");
    }
}

//정직원
class ChildEmployee2 extends Employee{
    //override
    void salary() {
        System.out.println("정직원 salary()");
    }
}

public class PolyEx04{
    public static void main(String[] args){
        //기본 호출 방법
        ChildEmployee1 ce1 = new ChildEmployee1();
        ChildEmployee2 ce2 = new ChildEmployee2();
        ce1.salary();
        ce2.salary();

        //다형성을 통한 호출 
        Employee e1 = new ChildEmployee1();
        Employee e2 = new ChildEmployee2();
        e1.salary();
        e2.salary();
    }
}