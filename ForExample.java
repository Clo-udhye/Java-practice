public class ForExample{
    public static void main(String[] args){
        /*
        for문 두개를 써서
        a
        ab
        abc
        abcd
        ...
        abcdefgh
        */
       
        /*
        //for문 하나
        char ch = 'a';
        String str="";
        str += ch;
        for(int i=0; i<=6; i++){
            ch = (char)(ch + 1);
            str += ch;
            System.out.println(str);
        }
        */

        //for문 두개
        char ch = 'a';
        for(int i=0; i<=7; i++){
            for(int j=0; j<=i; j++){
                System.out.print((char)(ch+j));
            }
            System.out.println();
        }
    }
}