public class ExceptionEx01{
    public static void main(String[] arg){
        System.out.println("시작");

        //int num1 = 2;
        int num1 = 0;
        int num2 = 10;

        /*
        int result = num2 / num1;   // 나누기 0이면 런타임 에러! java.lang.ArithmeticException: / by zero
        */

        // Exception의 고전적인 처리
        if(num1 == 0){
            System.out.println( "0으로 나눌 수 없습니다." );    
        }else {
            int result = num2 / num1;
            System.out.println( result );
        }
       

        System.out.println("종료");
    }
}