public class VariableEx05 { 
    public static void main (String[] args){
        int i = 1;      //(*)
        byte b = 1;
        short s = 1;
        
        long l1 = 1;    //long 일때는 뒤에 L을 붙인다 
        long l2 = 1L;   //출력 차이 x

        System.out.println( l1 );
        System.out.println( l2 );

        int i2 = 0b1010;    // 2진수 저장
        int i8 = 030;       // 8진수 저장
        int i16 = 0x44;     //16진수 저장

        System.out.println( i2 );   //출력 : 10진수로 변환해서 출력 
        System.out.println( i8 );
        System.out.println( i16 );

        //10진수 -> 2, 8, 16진수 로 변환
        int i10 = 100;
        System.out.printf( "8진수 : %o\n", i10);
        System.out.printf( "16진수 : %x", i10);

    }
}