public class SystemEx03{
    public static void main(String[] args){
        int[] src = {1, 2, 3, 4, 5};

        //초기화 안하고 선언만
        int[] dest1 = null;

        //shadow copy (참조값 복사)
        dest1 = src;
        System.out.println( src[0] );
        System.out.println( dest1[0] );

        dest1[0] = 10;
        System.out.println( src[0] );
        System.out.println( dest1[0] );

        //deep copy (값 복사)   (부분복사도 허용)
        int[] dest2 = {0, 0, 0, 0, 0};
        System.arraycopy( src, 0, dest2, 0, src.length); // src의 0부터의 값을 dest2의 0부터에 src.length 만큼 값 복사
        
        System.out.println( src[0] );
        System.out.println( dest2[0] );

        dest2[0] = 20;
        System.out.println( src[0] );
        System.out.println( dest2[0] );

        /*        
        //부분 복사
        int[] dest3 = {0, 0, 0, 0, 0};
        System.arraycopy( src, 2, dest3, 0, src.length-2);ㅋ
        */
    }
}