import java.util.Calendar;

public class MakeCalendar{
    public static void main(String[] args){
        /*
            java MakeCalendar 2020
            2020년 달력 전체 출력

            java MakeCalendar 2020 11
            2020년 11월 달력 출력
        */
        if(args.length == 1){
            int year = Integer.parseInt(args[0]);
            Calendar c = Calendar.getInstance();
            
            int startD;  //DayOfWeek
            int endD;
            int checkD;

            for(int m =1; m<=12; m++){
                c.set(year, m-1 , 1);
                System.out.println("\n\t\t" + c.get(c.YEAR)+"년 "+(c.get(c.MONTH)+1)+ "월 달력 \n");
                System.out.println("\t|  일\t|  월\t|  화\t|  수\t|  목\t|  금\t|  토\t|");
                System.out.println("\t--------------------------------------------------------");

                startD = c.get(c.DAY_OF_WEEK);
                checkD = startD;

                for(int t=1; t<=startD; t++){
                    System.out.print("\t");
                }

                c.set(year, m, 1-1);
                for(int d=1; d<=c.get(c.DATE); d++){
                    System.out.print("|  "+d+"\t");
                    checkD++;
                    if(checkD%7 == 1){
                        checkD = 1;
                        System.out.print("|\n\t--------------------------------------------------------\n\t");
                    }
                }
                if (checkD%7 != 1){
                    System.out.print("|");
                }
                System.out.println();
            }
        } else if(args.length == 2){
            int year = Integer.parseInt(args[0]);
            int month = Integer.parseInt(args[1]);
            Calendar c = Calendar.getInstance();
            c.set(year, month-1, 1);
            //System.out.print(c.get(c.YEAR)+"년 "+(c.get(c.MONTH)+1)+ "월 " +c.get(c.DATE) +"일");
        
            int startD = c.get(c.DAY_OF_WEEK);  //DayOfWeek
            int checkD = startD;
            System.out.println("\n\t\t" + c.get(c.YEAR)+"년 "+(c.get(c.MONTH)+1)+ "월 달력 \n");
            System.out.println("\t|  일\t|  월\t|  화\t|  수\t|  목\t|  금\t|  토\t|");
            System.out.println("\t--------------------------------------------------------");
            for(int t=1; t<=startD; t++){
                System.out.print("\t");
            }

            c.set(year, month, 1-1);
            for(int d=1; d<=c.get(c.DATE); d++){
                System.out.print("|  "+d+"\t");
                checkD++;
                if(checkD%7 == 1){
                    checkD = 1;
                    System.out.print("|\n\t--------------------------------------------------------\n\t");
                }
            }
            if (checkD%7 != 1){
                System.out.print("|");
            }
        }
    }
}