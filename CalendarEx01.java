import java.util.Calendar;

public class CalendarEx01{
    public static void main(String[] args) throws Exception{
        Calendar c = Calendar.getInstance();
        //System.out.println(c.toString()); //날짜에 대한 정보가 다나옴!
        
        /*String[] str = c.toString().split(",");
        for(String value : str){
            System.out.println(value);
        }*/

        //사용 - get을 이용해 필요한 정보만 추출 
        System.out.println( c.get(Calendar.YEAR));
        System.out.println( c.get(Calendar.MONTH) + 1);
        // System.out.println( c.get(Calendar.DAY_OF_MONTH)); // = Calendar.DATE와 같음
        System.out.println( c.get(Calendar.DATE));

    }
}