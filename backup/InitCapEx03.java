public class InitCapEx03{
    public static void main( String[] args ){
        //입력값 검사
        if( args.length!= 1 ){
            System.out.println("1개를 입력해야 합니다");
        } else {
            System.out.println("정상");
            //객체화
            UtilEx u = new UtilEx();
            String result = u.capitalizeName(args[0]);
            System.out.println("결과 : " + result );
        }
    }
}