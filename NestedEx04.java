interface Inner {
    int x = 100;
    void viewInner();
}

//클래스를 만들어서 구현
public class NestedEx04 {
    public static void main(String[] args){
        int y = 100;
        // 익명 Inner 클래스
        Inner i = new Inner(){
            public void viewInner(){
                System.out.println( x );
                System.out.println( y );    //지역변수에 접근가능
            }
        };
        i.viewInner();
    }
}