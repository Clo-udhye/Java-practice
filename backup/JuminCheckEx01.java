public class JuminCheckEx01{
    public static void main(String[] args){
 
        if(args.length!=1){
            //비정상처리
            System.out.println("java 클래스명 xxxxxx-xxxxxxx 형식으로 입력해야합니다.");
            System.exit(0);
        }

        if(args[0].length()!=14){
            System.out.println("14자리를 입력해야합니다.");
            System.exit(0);
        }

        //정상처리
        //System.out.println("정상");
        String jumin = args[0].replaceAll("-", "");
        //System.out.println( jumin );

        int num01 = Integer.parseInt( jumin.substring(0, 1) ) *2;
        int num02 = Integer.parseInt( jumin.substring(1, 2) ) *3;
        int num03 = Integer.parseInt( jumin.substring(2, 3) ) *4;
        int num04 = Integer.parseInt( jumin.substring(3, 4) ) *5;
        int num05 = Integer.parseInt( jumin.substring(4, 5) ) *6;
        int num06 = Integer.parseInt( jumin.substring(5, 6) ) *7;
        int num07 = Integer.parseInt( jumin.substring(6, 7) ) *8;
        int num08 = Integer.parseInt( jumin.substring(7, 8) ) *9;
        int num09 = Integer.parseInt( jumin.substring(8, 9) ) *2;
        int num10 = Integer.parseInt( jumin.substring(9, 10) ) *3;
        int num11 = Integer.parseInt( jumin.substring(10, 11) ) *4;
        int num12 = Integer.parseInt( jumin.substring(11, 12) ) *5;

        //System.out.println(num01);
        //System.out.println(num12);
        int lastNum = Integer.parseInt( jumin.substring(12, 13) );
        int sum = num01 + num02 + num03 + num04 + num05 + num06 + num07 + num08 + num09 + num10 + num11 + num12;
        
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