public class ObjectEx01{
    public static void main(String[] args){
        Object o = new Object();
        //객체의 참조값(주소) 출력
        System.out.println( o );    
        // = 객체의 참조값(주소) 출력
        System.out.println( o.toString() );    

        //String 클래스가 Object의 toString이 오버라이딩 한것 
        String s = new String("Hello");
        System.out.println(s);
        System.out.println(s.toString());
    }
}