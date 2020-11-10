class Variable{
    //멤버변수 / 필드
    //instance 필드
    int data1 = 10;

    // static(클래스) 필드
    static int data2 = 20;

    void dofunc1(){
        System.out.println("dofunc1() 호출");
        System.out.println(this.data1);
        System.out.println(this.data2);
    }
    //static(정적, 클래스) 메서드
    static void dofunc2(){
        System.out.println("dofunc2() 호출");
        //this 사용불가, instance 와 관련된 것은 사용불가
        //System.out.println(data1);
        System.out.println(Variable.data2);
    }
}

public class VariableEx09{
    public static void main(String[] args){
        Variable v = new Variable();
        System.out.println(v.data1);
        System.out.println(v.data2);

        System.out.println(Variable.data2); //클래스이름으로 바로 접근 가능

        v.dofunc1();
        v.dofunc2();

        Variable.dofunc2();
    }
}