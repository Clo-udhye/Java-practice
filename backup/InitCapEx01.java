public class InitCapEx01{
    public static void main( String[] args ){
        //입력값 검사
        if( args.length!= 1 ){
            System.out.println("1개를 입력해야 합니다");
        } else {
            System.out.println("정상");

            String strName = args[0];
            String[] names = strName.split(" ");

            //디버깅 
            //for( String name : names ){
            //    System.out.println( name );
            //}
            
            String result="";
            for( String name : names ){
                result += name.substring(0, 1).toUpperCase() + name.substring( 1 ) + " ";
            }

            System.out.println("결과 : " + result.trim());
        }
        
        /*
        //StringBuffer 이용하기
        String[] strNames = args[0].split(" ");
        StringBuffer[] names = new StringBuffer[strNames.length];
        for(int i=0; i<strNames.length; i++){
            names[i] = new StringBuffer(strNames[i]);
            names[i].insert(1, names[i].substring(0,1).toUpperCase());
            names[i].delete(0, 1);
        }
        for(StringBuffer s : names){
            System.out.print(s + " ");
        }
        */
    }
}