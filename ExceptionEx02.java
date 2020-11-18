public class ExceptionEx02{
    public static void main(String[] arg){
        System.out.println("시작");

        String data = null;
        //System.out.println( data.toString() );  //참조 한 주소가 없으므로 Exception , java.lang.NullPointerException

        if(data==null){
            System.out.println("객체 사용 불가");
        } else {
            System.out.println( data.toString() );
        }

        System.out.println("끝");
    }
}