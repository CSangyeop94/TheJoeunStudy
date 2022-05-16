package Day;
import java.util.Calendar;
import java.util.Scanner;
public class EnumMethodEx {

	public static void main(String[] args) {
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println(name);
		
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		
		System.out.println(result1);
		System.out.println(result2);
		
		if(args.length == 1) { // ���� �����ǰܳ��̼� ���� args�� ���� �־�� ��µ�
			String strDay = args[0];
			Week weekDay = Week.valueOf(strDay);
			if(weekDay == Week.SATUDAY || weekDay == Week.SUNDAY) {
				System.out.println("�ָ��Դϴ�");
			}else {
				System.out.println("�����Դϴ�");
			}
		}
		// values() �޼ҵ�
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day);
		}
		

	}

}