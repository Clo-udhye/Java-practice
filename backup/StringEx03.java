public class StringEx03{
    public static void main(String[] args){
        //String의 특성 1.
        String str = "ABC";
        str += "BCD";

        System.out.println( str );

        String pstr = str.replaceAll("ABC", "CDE");
        // 불변성 : 원래 데이터(str)은 바뀌지 않음 / immutable (<-> mutable)
        System.out.println( str );
        System.out.println( pstr );

        //2. 
        String str11 = "Hello World";           // 메모리에 같은 값이 있는지 확인 
        String str12 = "Hello World";           // 있으면 새로 생성x  

        String str21 = new String("Hello World");   //but 생성자로 객체 생성시 같은 내용이라도 새로 만들어진다.
        String str22 = new String("Hello World");

        if(str21 == str22){
            System.out.printf("str21 : %x str22: %x 참조값이 같음\n", str21.hashCode(), str22.hashCode());
        } else {
            System.out.printf("str21 : %x str22: %x 참조값이 다름\n", str21.hashCode(), str22.hashCode());
        }
        if(str21.equals(str22)){ //String의 값비교는 equals 써야함 !
            System.out.println("str21 : " + str21 + ", str22 : " + str22 + " 내용값이 같음");
        } else {
            System.out.println("str21 : " + str21 + ", str22 : " + str22 + " 내용값이 다름");
        }

        if(str11 == str12){
            System.out.printf("str11 : %x str12: %x 참조값이 같음\n", str11.hashCode(), str12.hashCode());
        } else {
            System.out.printf("str11 : %x str12: %x 참조값이 다음\n", str11.hashCode(), str12.hashCode());
        }
        if(str11.equals(str12)){ 
            System.out.println("str11 : " + str11 + ", str12 : " + str12 + " 내용값이 같음");
        } else {
            System.out.println("str11 : " + str11 + ", str12 : " + str12 + " 내용값이 다름");
        }

        System.out.println( str11.hashCode() );
        System.out.println( str12.hashCode() );
        /*
        System.out.println(str11.equals(str12));
        System.out.println(str11==str12?"true":"false");    //true
        System.out.println(str21==str22?"true":"false");    //false
         */


        
    }
}