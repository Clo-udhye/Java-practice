public class ExceptionEx04 {
    public static void main(String[] args){
        System.out.println("시작");

        System.out.println("1");
        int num1 = 2;
        int num2 = 10;

        try {
            System.out.println("2");
            int result = num2 / num1;
            System.out.println("3");
            System.out.println("결과 : " + result );
        } catch (ArithmeticException e){
            System.out.println("4");
        } finally {
            System.out.println("5");
        }

        System.out.println("끝");
    }
}
