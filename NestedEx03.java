class Outer{
    //선언
    void viewInner(){
        class Inner{
            void view(){
                System.out.println("view 호출");
            }
        }
        //생성과 실행
        Inner i = new Inner();
        i.view();
    }
}

public class NestedEx03{
    public static void main(String[] args){
        Outer o = new Outer();
        o.viewInner();
    }
}