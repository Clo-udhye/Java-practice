public class ArrayEx07{
    public static void main(String[] args){
        // 가변 배열
        int[][] arrs = new int[3][];
        // 열의 갯수가 다른 행으로 생성 
        arrs[0] = new int[3];
        arrs[1] = new int[2];
        arrs[2] = new int[1];

        for(int row=0; row<arrs.length; row++){
            System.out.println( arrs[row].length );
        }
        System.out.println();
        //선언 생성 초기화
        int[][] arrs2 = {{10, 20, 30}, {40, 50}, {60}};
        
        int[][] arrs3 = new int[3][3];
        arrs3[0][0] = 10;
        arrs3[0][1] = 20;
        arrs3[0][2] = 30;
        arrs3[1][0] = 40;
        arrs3[1][1] = 50;
        arrs3[2][0] = 60;

        for(int[] cols : arrs){
            for(int data: cols){
                System.out.print(data + "\t");
            }
            System.out.println();
        }
        System.out.println();
        //향상된 for문으로 출력
        for(int[] cols : arrs2){
            for(int data: cols){
                System.out.print(data + "\t");
            }
            System.out.println();
        }
        System.out.println();
        for(int[] cols : arrs3){
            for(int data: cols){
                System.out.print(data + "\t");
            }
            System.out.println();
        }
    }
}