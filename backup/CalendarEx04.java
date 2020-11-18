import java.util.Calendar;

public class CalendarEx04{
    public static void main (String[] args){
        // 날짜 전 / 후
        // add

        Calendar c= Calendar.getInstance();
        System.out.println( c.getTime() );

        c.add( Calendar.DATE, 1 );          //DATE + 1 -> 다음날로 이동
        System.out.println( c.getTime() );

        c.add( Calendar.MONTH, -6 );        // MONTH + -6 -> 6개월전으로 이동 
        System.out.println( c.getTime() );  
 
    }
}