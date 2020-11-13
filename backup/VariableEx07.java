class Variable{
    //전역
    //멤버변수  - 자동 초기화
    //제어문(X)
    int data1;

    void dofunc(){
        //지역
        //지역변수 - 초기화해야지 사용가능
        //제어문(O)
        int data2;
        data2 = 10;
        int data1 = 20;

        System.out.println("data1 : " + data1);     //같은 이름일경우 지역변수
        //전역을 부르고 싶을 경우 자기참조(this)
        System.out.println("this.data1 : " + this.data1);
        System.out.println("this : " + this);
        System.out.println("data2 : " + data2);
    }
}

public class VariableEx07{
    public static void main(String[] args){
        Variable v = new Variable();
        v.dofunc();
        System.out.println("v : " + v);
    }
}