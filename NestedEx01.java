class Outer{
    //멤버필드
    private int x1=100;
    public int x2=100;

    Outer(){
        System.out.println( "Outer 생성자" );
    }

    //인스턴스 멤버 클래스
    class Inner {
        private int y1 = 200;
        public int y2 = 200;
    
        Inner(){
            System.out.println( "Inner 생성자" );
        }

        public void viewInner(){
            System.out.println( x1 );
            System.out.println( x2 );
            System.out.println( y1 );
            System.out.println( y2 );
        }
    }
}

public class NestedEx01{
    public static void main(String[] args){
        Outer o = new Outer();
        Outer.Inner oi = o.new Inner();

        //System.out.println( o.x1 ); //private
        System.out.println( o.x2 );

        oi.viewInner();
    }
}