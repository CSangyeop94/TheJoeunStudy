import java.util.Calendar;

public class EnumWeekEx {

	public static void main(String[] args) {
		Week today = null; // ���� Ÿ�� ���� ����
		
		Calendar cal = Calendar.getInstance();
		int week = cal.get(Calendar.DAY_OF_WEEK);
		// ��1~��7������ ���ڸ� �������ݴϴ�.
		
		switch(week) {
		// ���� ����� ����
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
		
		System.out.println("���� ���� : " + today);
		
		if(today == Week.SUNDAY) {
			System.out.println("�Ͽ��Ͽ��� �౸�� �մϴ�.");
		}else {
			System.out.println("������ �ڹ� ���θ� �մϴ�.");
		}

	}

}
