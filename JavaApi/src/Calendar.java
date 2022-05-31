import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Calendar {

	public static void main(String[] args) {
		// ��¥ ���
		LocalDate currDate = LocalDate.now();
		System.out.println("���� ��¥ : " + currDate);
		
		LocalDate targetDate = LocalDate.of(2022, 5, 10);
		System.out.println("��ǥ ��¥ : " + targetDate + "\n");
		
		// �ð� ���
		LocalTime currTime = LocalTime.now();
		System.out.println("���� �ð� : " + currTime);
		
		LocalTime targetTime = LocalTime.of(6, 30, 0);
		System.out.println("��ǥ �ð� : " + targetTime + "\n");
		
		// ��¥�� �ð� ���
		LocalDateTime currDateTime = LocalDateTime.now();
		System.out.println("���� ��¥�� �ð� : " + currDateTime + "\n");
		
		LocalDateTime targetDateTime = LocalDateTime.of(2022, 5, 10, 6, 30, 0, 0);
		System.out.println("��ǥ ��¥�� �ð� : " + targetDateTime + "\n");
	} 

}
