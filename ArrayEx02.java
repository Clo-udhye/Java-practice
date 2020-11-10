public class ArrayEx02{
    public static void main(String[] args){
        //선언과 생성
        int[] arr1 = new int[3];
        //선언 생성 초기화
        int[] arr2 = new int[]{10, 20, 30};
        int[] arr3 = {10, 20, 30};  


        arr1[0] = 10;
        System.out.println( arr1[0] );
        System.out.println( arr2[0] );
        System.out.println( arr3[0] );

        System.out.println( arr3.length );

    }
}