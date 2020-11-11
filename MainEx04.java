public class MainEx04{
    public static void main(String[] args){ 
        //args : class파일 실행시 옵션값을 받는다 java MainEx04 abc bcd efg    => 3개의 옵션 , 공백으로 구분 
        System.out.println(args.length);
        for(String arg : args){
            System.out.print( arg + "\t" );
        }
        System.out.println();

       
    }
}