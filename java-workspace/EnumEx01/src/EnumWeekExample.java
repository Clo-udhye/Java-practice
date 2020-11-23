//import java.util.Calendar;

public class EnumWeekExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Week today = null;
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);

		switch(week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}
	
		
		System.out.println("오늘 요일 : " + today);
		
		if(today==Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		} else {
			System.out.println("열심히 자바 공부를 합니다.");
		}
		*/
		Week week1 = Week.SUNDAY;
		Week week2 = Week.SUNDAY;
		
		System.out.println(week1 == week2);
		
		//return이 String
		System.out.println( week1.name() );
		
		//return이 Week
		System.out.println( Week.SUNDAY );
		
		System.out.println( week1.ordinal() ); 
		
		Week[] days = Week.values(); //Enum안의 값을 배열화
		for( Week day : days) {
			System.out.println( day );
		}
	}

}
