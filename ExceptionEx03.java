public class ExceptionEx03{
    public static void main(String[] arg){
        System.out.println("시작");

       
        int num1 = 0;
        int num2 = 10;

        // try - catch 구문을 이용한 Exception처리 
        try {
            int result = num2 / num1;
            System.out.println( result );
        } catch (ArithmeticException e) {
            //ArithmeticException e = new rithmeticException();  
            System.out.println("Exception 발생 : " + e.getMessage()); //e 를 통해 Exception에 대한 내용을 볼수있음 
        } finally {
            System.out.println( "무조건 실행" );
        }

        System.out.println("종료");
    }
}