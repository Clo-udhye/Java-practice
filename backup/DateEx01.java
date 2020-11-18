import java.util.Date;

public class DateEx01{
    public static void main(String[] args) throws Exception{
        //java.util.Date d = new java.util.Date();    //system의 현재 시간 가져오기 
        Date d = new Date();

        System.out.println( d.toString() );
        System.out.println( d.toLocaleString() );

        System.out.println(d.getYear() + 1900); //주의! - 년도(+1900), 월(+1)
        System.out.println(d.getMonth() + 1 );
        System.out.println(d.getDate());
    }
}