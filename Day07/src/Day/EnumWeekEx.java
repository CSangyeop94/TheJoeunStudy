package Day;
import java.util.Calendar;
public class EnumWeekEx {

	public static void main(String[] args) {
	Week today = null;
	Calendar cal = Calendar.getInstance();
	int week = cal.get(Calendar.DAY_OF_WEEK);
	switch(week) {
	case 1:
		today = Week.SUNDAY; break;
	case 2:
		today = Week.MONDAY; break;
	case 3:
		today = Week.TUSEDAY; break;
	case 4:
		today = Week.WEDNESDAY; break;
	case 5:
		today = Week.THUSDAY; break;
	case 6:
		today = Week.FRIDAY; break;
	case 7:
		today = Week.SATUDAY; break;	
	}
	System.out.println("���� ���� :" + today);
	if(today == Week.SUNDAY) {
		System.out.println("�Ͽ��Ͽ��� ��ȭ");
	}else {
		System.out.println("������ �ڹ� ����");
		}

	}
}