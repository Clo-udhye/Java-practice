public class BoxingUnBoxingExample{
    public static void main(String[] srgs){
        //Boxing - 기본자료형을 객체로 만드는것
        Integer obj1 = new Integer(100);
        Integer obj2 = new Integer("200");
        Integer obj3 = Integer.valueOf("300");

        //UnBoxing - 객체에서 값을 꺼내오는 것 
        int value1 = obj1.intValue();
        int value2 = obj2.intValue();
        int value3 = obj3.intValue();

        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
    }
}