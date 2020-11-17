public class JuminCheckEx02{
    public static void main(String[] args){
 
        if(args.length!=1){
            System.out.println("java 클래스명 xxxxxx-xxxxxxx 형식으로 입력해야합니다.");
            System.exit(0);
        }

        if(args[0].length()!=14){
            System.out.println("14자리를 입력해야합니다.");
            System.exit(0);
        }

        String jumin = args[0].replaceAll("-", "");
        int[] bits = { 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5 };
        int sum = 0;
        for( int i=0; i<bits.length; i++){
            sum += Integer.parseInt( jumin.substring(i, i+1) ) *bits[i];
        }

        int lastNum = Integer.parseInt( jumin.substring(12, 13) );
        int resultNum = (11 - (sum % 11)) % 10;

        //System.out.println(resultNum);
        //System.out.println(lastNum);

        if(lastNum==resultNum){
            System.out.println("맞다");
        } else {
            System.out.println("틀리다");
        }
    }
}