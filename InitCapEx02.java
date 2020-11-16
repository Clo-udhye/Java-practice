public class InitCapEx02{
    // 구조적 프로그래밍 - 함수화
    public static String capitalizeName ( String name ){
        String[] names = name.split(" ");
            
        String result="";
        for( String name1 : names ){
            result += name1.substring(0, 1).toUpperCase() + name1.substring( 1 ) + " ";
        }

        return result.trim();
    }

    public static void main( String[] args ){
        
        //입력값 검사
        if( args.length!= 1 ){
            System.out.println("1개를 입력해야 합니다");
        } else {
            System.out.println("정상");

            String result = InitCapEx02.capitalizeName(args[0]);
            System.out.println("결과 : " + result );

            //String strName = args[0];
            //System.out.println("결과 : " + capitalizeName(strName) );
        }

    }
}