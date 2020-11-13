public class VariableEx03{
    public static void main(String[] args){
        // '':문자 / "":문자열 
        char c1 = 'a';
        //char c2 = "a";  //error
        //char c2 = 'ab'  //error
        char c2 = '한'; //한글 가능
        // ASCII code - 영문, 특수 글자는 코드값으로 처리
        // a : 97 ~, A : 65 ~
        char c3 = 65;    

        // unicode - 다국어
        char c4 = '\uc790';

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);
        System.out.println(c4);

        //이스케이프코드
        // \n \t \' \" 처리가능 

        char s1 = 'a';
        char s2 = '\n';
        char s3 = 'b';
        //System.out.println( s1 + s2 + s3 ); // 205 => ASCII code : 97(a) + 10(\n) + 98(b)
        System.out.println( "" + s1 + s2 + s3 );

    }
}