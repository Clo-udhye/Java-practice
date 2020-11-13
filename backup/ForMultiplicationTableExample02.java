public class ForMultiplicationTableExample02{
    public static void main(String[] args){
        /*
        2x1 = 2  2x2 = 4  2x3 = 6  ... 2x9 = 18
        ...
        9x1 = 9  9x2 = 18  9x3 = 27  ... 9x9 = 81
        */
        
        for(int m=2; m<=9; m++){
            for(int n=1; n<=9; n++){
                System.out.print(m + "X" + n + "=" + (m*n) + "\t");
            }
            System.out.println();
        }
    }
}