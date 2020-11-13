class Method{
    //메서드 오버로딩
   void dofunc1(){
        System.out.println("dofunc1() 호출 1");
    }
    
    void dofunc1(int data1){    //매개변수의 갯수가 다름
        System.out.println("dofunc1() 호출 2");
    }

    void dofunc1(float data1){  //매개변수의 타입이 다름
        System.out.println("dofunc1() 호출 3");
    }
    
    //매개변수의 순서가 다름
    void dofunc1(int data1, double data2){
        System.out.println("dofunc1() 호출 4");
    }
    void dofunc1(double data1, int data2){  
        System.out.println("dofunc1() 호출 5");
    }

}

public class MethodEx02{
    public static void main(String[] args){
        Method m = new Method();
        m.dofunc1();
        m.dofunc1(10);
        m.dofunc1(10.0f);
        m.dofunc1(10, 10.0);
        m.dofunc1(10.0, 10);
    }
}