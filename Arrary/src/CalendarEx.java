import java.util.Calendar;

public class CalendarEx {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		// Calendar �� �߻�Ŭ����
		// getInstance�� �ڱ��ڽ��� return����
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DATE));
		
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		System.out.println(cal.get(Calendar.MINUTE));
		
		cal.add(Calendar.HOUR, 5);
				// �ð��� 5�ð� �ķ� �ϰڴٴ� ��
		System.out.println(cal.get(Calendar.HOUR));
		// ����ð��� ���� 6 �ö� 6���� �����µ� +5����
		
		
		
	}
}
