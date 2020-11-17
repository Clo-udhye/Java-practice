import java.util.Calendar;

public class CalendarEx03{
    public static void main (String[] args){
        //날짜차이
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        c2.set(2020, 11-1, 1);

        //측정단위(밀리세컨드)
        long diffTime = c1.getTimeInMillis() - c2.getTimeInMillis();
        System.out.println( diffTime );

        long diffSecond = diffTime / 1000;
        System.out.println( diffSecond + "초" );

    }
}
