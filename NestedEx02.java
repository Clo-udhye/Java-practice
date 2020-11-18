class Outer{
    //멤버필드
    private int x1=100;
    public int x2=100;
    public static int test = 500;

    Outer(){
        System.out.println( "Outer 생성자" );
    }

    //static 멤버 클래스
    static class Inner {
        private int y1 = 200;
        public int y2 = 200;
    
        Inner(){
            System.out.println( "Inner 생성자" );
        }

        public void viewInner(){
            //System.out.println( x1 ); // 인스턴스 멤버변수라 접근 불가 
            //System.out.println( x2 );
            System.out.println( test ); // static 멤버변수는 접근 가능   
            System.out.println( y1 );
            System.out.println( y2 );
        }
    }
}

public class NestedEx02{
    public static void main(String[] args){
        //Outer o = new Outer();
        Outer.Inner oi = new Outer.Inner();
        oi.viewInner();

    }
}