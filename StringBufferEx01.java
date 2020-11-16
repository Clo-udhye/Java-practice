public class StringBufferEx01{
    public static void main( String[] args ){
        //StringBuffer 생성 방법 3가지
        StringBuffer sb1 = new StringBuffer();                  // 그냥 만들기
        StringBuffer sb2 = new StringBuffer( 100 );             // capacity 정해서 만들기
        StringBuffer sb3 = new StringBuffer( "Hello World" );   // 문자열로 만들기

        System.out.println( sb1.capacity() );   //-> 16 : 디폴트 capacity - but 데이터를 추가하면 늘어난다 
        System.out.println( sb2.capacity() );   //-> 100
        System.out.println( sb3.capacity() );   //-> 27 : 디폴트 capacity + 문자열의 length

        // 문자단위조작 (문자열 -> 문자열로 데이터 처리를 하는것이 좋음)
        // chatAt() / setCharAt() / deleteCharAt()
        // substring() 

        // append / insert / delete
        System.out.println( sb3 );
        sb3.append( " 안녕 " );     //다시 할당 하지않아도 객체 내용이 바뀜 
        System.out.println( sb3 );
        sb3.insert( 3, " 추가 ");   // index 3 에 추가
        System.out.println( sb3 );
        sb3.delete( 0, 4 );         // index 0부터 4전 까지 삭제( 0~3 )
        System.out.println( sb3 );

        sb3.reverse();  
        System.out.println( sb3 );
    }
}