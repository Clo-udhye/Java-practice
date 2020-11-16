import java.util.Calendar;
import java.util.Date;
public class CalendarEx02{
    public static void main(String[] args) throws Exception{
        Calendar c = Calendar.getInstance();

        // c.get() / c.set()
        c.set(2020, 11-1, 1);
        System.out.println( c.toString() );
        System.out.println( c.getTime() );

        Date d = c.getTime();
        System.out.println(d.toLocaleString());

        //2020년 12월 31일 의 요일
        //2021년 1월 1일의 전날 
        //c.set(2021, 1-1, 1-1);
        c.set(2020, 12-1, 31);
        System.out.println(c.get(c.DAY_OF_WEEK)); //-> 요일
        
        /*
        switch(c.get(c.DAY_OF_WEEK)){
            case 1 : 
                System.out.println("일요일");
                break;
            case 2 : 
                System.out.println("월요일");
                break;
            case 3 : 
                System.out.println("화요일");
                break;
            case 4 : 
                System.out.println("수요일");
                break;
            case 5 : 
                System.out.println("목요일");
                break;
            case 6 : 
                System.out.println("금요일");
                break;
            case 7 : 
                System.out.println("토요일");
                break;
        }*/

        String[] weeks = {"일", "월", "화", "수", "목", "금", "토"};
        System.out.print(c.get(c.YEAR)+"년 "+(c.get(c.MONTH)+1)+ "월 " +c.get(c.DATE) +"일은 ");
        System.out.println( weeks[ c.get(c.DAY_OF_WEEK) - 1] +"요일 입니다."); //->요일

    }
};