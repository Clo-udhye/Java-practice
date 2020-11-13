class Variable{
    int data = 10;

    void dofunc1(){
        System.out.println("dofunc1() 호출");
        //자기참조를 명시적으로 표기해주기!
        System.out.println("data : " + this.data );
        this.dofunc2(); //함수내에서 다른함수 호출 가능
    }

    void dofunc2(){
        System.out.println("dofunc2() 호출");
    }
}

public class VariableEx08{
    public static void main(String[] args){
        Variable v = new Variable();
        v.dofunc1();
    }
}