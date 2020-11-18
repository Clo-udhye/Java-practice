public class JuminCheck{
    public static void main(String[] args){
        /*
            주민등록번호 검사용 클래스 
            java JuminCheck 123456-1234567
            맞다 / 틀리다
        */
        
        if(args.length!=1 || args[0].length()!=14 || !(args[0].substring(6, 7)).equals("-")){
            System.out.println("입력 형식 오류 : xxxxxx-xxxxxxx");
            System.exit(0);
        }

        String juminStr =  args[0].replaceAll("-", "");
        int[] calValue = {2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5};
        int sum = 0; 
        
        for(int i=0; i<12; i++){
            //System.out.println(Integer.parseInt(juminStr.substring(i,i+1)));
            sum +=  Integer.parseInt(juminStr.substring(i,i+1)) * calValue[i];
        }
        Integer checkValue = (11 - (sum % 11)) % 10;
        //System.out.println(checkValue);
        //System.out.println(juminStr.substring(12));
        
        if( (juminStr.substring(12)).equals((checkValue.toString()))){
            System.out.println("맞다");
        } else {
            System.out.println("아니다");
        }
    }
}