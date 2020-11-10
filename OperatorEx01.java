public class OperatorEx01{
    public static void main(String[] args){
        int i1 = 10;
        int i2 = 20;
        int sum1 = i1 + i2;
        System.out.println(sum1);

        short s1 = 10;
        short s2 = 20;
        //short sum2 = s1 + s2;   //error
        
        // +연산자에의해 두항을 int 변환된 후 연산, 해결방법 2가지 
        //int sum2 = s1 + s2;
        short sum2 = (short)(s1 + s2);
        System.out.println(sum2);
    }
}