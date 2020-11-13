public class AlphabetEx02 {
    public static void main(String[] args){ 
        /*
        for문 두개를 써서
        a
        ab
        abc
        abcd
        ...
        abcdefgh
        강사님 코드 
        */

        /*
        //ver.1
        for( int i=0; i<=10; i++){
            for( int j=65; j<=65+i; j++){
                //한행을 출력
                System.out.print( (char)j );
            }
            System.out.println();
        }
        */
        
        //ver.2
        for( int i=0; i<=10; i++){
            String rowStr="";
            for( int j=65; j<=65+i; j++){
                rowStr += (char)j;
            }
            System.out.println(rowStr);
        }
    }
}