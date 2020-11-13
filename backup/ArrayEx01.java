public class ArrayEx01{
    public static void main(String[] args){
        //배열의 선언
        int[] arr1;
        int arr2[];

        //배열의 생성
        arr1 = new int[4];

        //초기화
        arr1[0] = 10;
        arr1[1] = 20;
        arr1[2] = 30;
        //arr1[3] = 10;

        System.out.println(arr1);   //참조값
        System.out.println(arr1[0]);
    }
}