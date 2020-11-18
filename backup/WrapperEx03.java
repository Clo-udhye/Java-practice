public class WrapperEx03{
    public static void main(String[] args){
        //Boxing 
        Integer i1 = new Integer( 123 );

        //Auto Boxing
        Integer i2 = 123;

        //Auto UnBoxing
        int i3 = i2;

        int sum = i3 + i1;
        System.out.println( sum );
    }
}