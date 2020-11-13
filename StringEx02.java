public class StringEx02{
    public static void main(String[] args){
        String str1 = "Hello World World";
        System.out.println(str1.length()); //문자열 길이
        System.out.println("Hello java".length());

        //문자열 -> 문자(char) : charAt()
        //문자열 -> 문자열

        //String pstr1 = str1.substring(2);
        String pstr1 = str1.substring(2, 4); //index : 2 ~ /4
        System.out.println( pstr1 );

        //위치검색
        //indexOf / lastIndexOf
        int pos1 = str1.indexOf("ll");   //"ll"을 검색-> 시작 index
        //int pos2 = str1.lastIndexOf("ll");
        System.out.println( pos1 );
       // System.out.println( pos2 );

       //존재검색
       //startsWith / endsWith / contains
       boolean b1 = str1.startsWith("He"); //"He"로 시작하면 true, 대소문자 구문
       //boolean b2 = str1.startsWith("he"); 
       System.out.println(b1);

        //치환
        String rstr1 = str1.replaceAll("World", "세상"); //replaceAll(바꾸기전문자열, 바꾼 후 문자열)
        System.out.println(rstr1);

        //문자열 +, concat
        String jstr1 = str1.concat(" 안녕");
        System.out.println(jstr1);

        //대소문자변환
        System.out.println("world".toUpperCase());
        System.out.println("HELLO".toLowerCase());

        //공백제거
        //앞뒤 공백 제거/ 문자 사이의 공백은 제거 x
        String ostr1 = "              hello               "  ;
        System.out.println(ostr1 + "끝");
        System.out.println(ostr1.trim()+"끝");
        System.out.println("안녕안녕     안녕".trim());

        //문자열 분리
        //spilt
        String sstr1 ="사과,딸기,수박,바나나,참외";
        String[] strarr = sstr1.split(","); //구분자로 분리 
        for(String str : strarr){
            System.out.println(str);
        }

        //분리된 문자열 결합
        String fstr1 = String.join(",", strarr); //join함수는 static 함수=>class이름으로 호출
        System.out.println(fstr1);

        //형식화된 문자열 결합
        String fstr2 = String.format("%s %s %s", strarr[0], strarr[1], strarr[2]);
        System.out.println(fstr2);
     }
}