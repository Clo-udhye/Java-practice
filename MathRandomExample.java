public class MathRandomExample{
    public static void main(String[] args){
        //Math.random() 으로 주사위 눈 뽑기
        int num = (int)(Math.random() * 6) + 1;
        System.out.println("주사위 눈: " + num);
    }
}