public class ArrayEx06{
    public static void main(String[] args){
        // 2차원
        int[][] arr1;
        arr1 = new int[3][2];   //3 * 2

        arr1[0][0] = 10;
        arr1[0][1] = 20;
        arr1[1][0] = 30;
        arr1[1][1] = 40;
        arr1[2][0] = 50;
        arr1[2][1] = 60;

        System.out.println(arr1[0][0]);
        System.out.println(arr1[2][1]);

        int[][] arr2 = new int[][] {{10, 20}, {30, 40}, {50, 60}};
        int[][] arr3 = {{10, 20}, {30, 40}, {50, 60}};

        System.out.println(arr3[0][0]);
        System.out.println(arr3[2][1]);

        System.out.println(arr1.length);    //행의 길이
        System.out.println(arr1[0].length); //열의 길이

        for(int row=0; row<arr1.length; row++){
            for(int col=0; col<arr1[row].length; col++){
                System.out.print(arr1[row][col] + "\t");
            }
            System.out.println();
        }

        System.out.println();
        //향상된 for문 이용
        for (int[] cols : arr1 ){   //열의 배열
            for (int data: cols){
                System.out.print( data + "\t" );
            }
            System.out.println();
        }
        
        //2차원 이상의 배열은 1차원 배열의 결합 
        System.out.println(arr1);   //참조값(주소값)
        System.out.println(arr1[0]);//참조값(주소값)
        System.out.println(arr1[0][0]);

    }
}