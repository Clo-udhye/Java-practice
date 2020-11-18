public class ObjectEx02{
    public static void main(String[] args){
        Object o = new Object();
        System.out.println( o );    //=>java.lang.Object@15db9742 =>객체의 타입, 참조값
        
        // class 이름
        // System.out.println(o.getClass());
        System.out.println(o.getClass().getName()); 
        System.out.println(o.hashCode()); //10진법
        System.out.printf("%x\n", o.hashCode()); //16진법

        String s = new String("Hello");
        System.out.println(s);
        //getClass=>상속
        System.out.println(s.getClass().getName()); 
        //haashCode=>오버라이딩
        System.out.println(s.hashCode()); //10진법
        System.out.printf("%x\n", s.hashCode()); //16진법

        }
}