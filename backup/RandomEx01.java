import java.util.Random;

public class RandomEx01{
    public static void main(String[] args){
        int[] selectNumber = new int[6];

        //Random() : 현재시간을 시드값으로 설정 : 실행할때마다 다른 값
        //Random(long seed) : seed 값이 같으면 실행할때마다 같은 값이 나온다.
        Random random = new Random();
        for( int i=0; i<6; i++){
            selectNumber[i] = random.nextInt(45) + 1;
            System.out.print( selectNumber[i] + " " );
        }
        System.out.println();
    }
}