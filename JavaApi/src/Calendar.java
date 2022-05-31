import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Calendar {

	public static void main(String[] args) {
		// 날짜 얻기
		LocalDate currDate = LocalDate.now();
		System.out.println("현재 날짜 : " + currDate);
		
		LocalDate targetDate = LocalDate.of(2022, 5, 10);
		System.out.println("목표 날짜 : " + targetDate + "\n");
		
		// 시간 얻기
		LocalTime currTime = LocalTime.now();
		System.out.println("현재 시간 : " + currTime);
		
		LocalTime targetTime = LocalTime.of(6, 30, 0);
		System.out.println("목표 시간 : " + targetTime + "\n");
		
		// 날짜와 시간 얻기
		LocalDateTime currDateTime = LocalDateTime.now();
		System.out.println("현재 날짜와 시간 : " + currDateTime + "\n");
		
		LocalDateTime targetDateTime = LocalDateTime.of(2022, 5, 10, 6, 30, 0, 0);
		System.out.println("목표 날짜와 시간 : " + targetDateTime + "\n");
	} 

}
