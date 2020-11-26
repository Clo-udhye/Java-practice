import java.util.Calendar;
import java.util.Date;

public class ThreadEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1초마다 시간을 출력하는 시계
		
		//Date date = new Date();
		//Calendar c = Calendar.getInstance();
		//System.out.println(c.getTime());

		while(true) {
			try {
				//date = new Date();
				//System.out.println(date.getHours()+"시 "+date.getMinutes()+"분 "+date.getSeconds()+"초");
				
				Calendar c = Calendar.getInstance();
				int hour = c.get(Calendar.HOUR);
				int minute = c.get(Calendar.MINUTE);
				int second = c.get(Calendar.SECOND);
				System.out.printf("%s : %s : %s\n", hour, minute, second);

				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
