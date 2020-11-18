public class CalculatorEx01{
    public static void main(String[] args){
        
        if(args.length != 3){
            System.out.println("입력 오류! 숫자 연산자 숫자 로 입력해주세요.");
        } /*else if(!Character.isDigit(args[0].charAt(0)) || !Character.isDigit(args[2].charAt(0))){
            System.out.println("입력 오류! 숫자 연산자 숫자 로 입력해주세요.");
        }*/
        else {
            //System.out.println("정상");
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[2]);
            Character oper = args[1].charAt(0);
        
            //System.out.println(num1 +" "+ oper +" "+num2);
            switch(oper){
                case '+' :  
                    System.out.println( "결과 : " +  (num1 + num2) );
                    break;
                case '-' : 
                    System.out.println( "결과 : " + (num1 - num2) );
                    break;
                case 'x' : 
                    System.out.println( "결과 : " + (num1 * num2) );
                    break;
                case '/' : 
                    System.out.println( "결과 : " + (num1 / num2) );
                    break;
                default :
                    System.out.println("연산자 오류! + - x / 중 하나로 입력하세요.");
            }
        }
    }
}