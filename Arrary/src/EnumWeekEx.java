import java.util.Calendar;

public class EnumWeekEx {

	public static void main(String[] args) {
		Week today = null; // 열거 타입 변수 선언
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		// 일1~토7까지의 숫자를 리턴해줍니다.
		
		switch(week) {
		// 열거 상수를 대입
		case 1:
			today = Week.SUNDAY; break;
		case 2:
			today = Week.Monday; break;
		case 3:
			today = Week.TUESDAY; break;
		case 4:
			today = Week.WEDENSDAY; break;
		case 5:
			today = Week.THURSDAY; break;
		case 6:
			today = Week.FRIDAY; break;
		case 7:
			today = Week.SATUDAY; break;
		}
		
		System.out.println("오늘 요일 : " + today);
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		}else {
			System.out.println("열심히 자바 공부를 합니다.");
		}

	}

}
