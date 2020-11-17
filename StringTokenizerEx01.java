import java.util.StringTokenizer;

//String.split()
public class StringTokenizerEx01{
    public static void main(String[] agrs){

        //String data1 = "사과 배 복숭아";
        //StringTokenizer st1 = new StringTokenizer( data1 );           //default구분자 : " "

        //String data1 = "사과&배&복숭아";
        //StringTokenizer st1 = new StringTokenizer( data1, "&" );  

        String data1 = "x=100*(200+300)/2";
        StringTokenizer st1 = new StringTokenizer( data1, "=*+/()" );   //구분자 여러개 가능

        /*
        System.out.println(st1.countTokens());
        
        System.out.println(st1.nextToken());
        System.out.println(st1.nextToken());

        System.out.println(st1.hasMoreTokens());    // 다음 토큰이 존재 : true
        System.out.println(st1.nextToken());

        System.out.println(st1.hasMoreTokens());    // 다음 토큰 x : false
        //System.out.println(st1.nextToken());      //error 개수가 맞지 않으면 NoSuchElement
        */
        
        while( st1.hasMoreTokens() ){
            System.out.println( st1.nextToken() );
        }
    
    }
}