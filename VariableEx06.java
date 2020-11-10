public class VariableEx06{
    public static void main( String[] args ){
        //int i = 2.5;  //error
        double d = 2.5;     //실수는 기본 double형 
        float f = 2.5f;     //float는 뒤에 f를 붙여준다
        
        System.out.println(d);
        System.out.println(f);

        //지수 
        double d2 = 1.0e3;  //=>1000.0 , 실수로 취급 
        System.out.println(d2);
    }
}