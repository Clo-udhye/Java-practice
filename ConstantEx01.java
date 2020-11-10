public class ConstantEx01{
    public static void main( String[] args ){
        //변수 
        int num = 10;
        num = 20;
        System.out.println( num );

        //상수 (대문자로 선언, _)
        final int C_NUM = 10;
        System.out.println(C_NUM);
        //C_NUM = 30;   //error
        //System.out.println(C_NUM);
    }
}