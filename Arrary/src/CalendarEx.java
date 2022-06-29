import java.util.Calendar;

public class CalendarEx {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		// Calendar 는 추상클래스
		// getInstance로 자기자신을 return해줌
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DATE));
		
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		System.out.println(cal.get(Calendar.MINUTE));
		
		cal.add(Calendar.HOUR, 5);
				// 시간을 5시간 후로 하겠다는 말
		System.out.println(cal.get(Calendar.HOUR));
		// 현재시간이 오후 6 시라 6으로 나오는데 +5가됨
		
		
		
	}
}
