public class ExceptionEx07 {
    // instance
    public void method1( int num ){
        System.out.println("시작");
        try{
            if(num < 100){
                //강제 익셉션 발생 - 메서드에서 많이 이용 
                throw new Exception("익셉션 발생"); //꼭 try - catch구문이 필요함!
            }
        } catch(Exception e) {
            System.out.println( "[익셉션]" + e.getMessage() );
        }

        System.out.println("끝");
    }

    public void method2( int num ) throws Exception { //메서드 밖으로 예외 넘기기(위임)
        System.out.println("시작");
        if(num < 100){
            throw new Exception("익셉션 발생");
        }
            System.out.println("끝");
    }

    public static void main(String[] args){
        ExceptionEx07 e = new ExceptionEx07();  //메서드가 인스턴스이기때문에 꼭 객체화 
        e.method1( 101 );   //정상
        e.method1( 10 );    //비정상
    
        try {
            e.method2( 10 );    //예외를 받는다
        } catch (Exception e1) {
            System.out.println( "[익셉션]" + e1.getMessage() );
        }
    }
}