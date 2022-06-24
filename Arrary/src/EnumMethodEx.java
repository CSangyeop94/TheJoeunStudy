
public class EnumMethodEx {

	public static void main(String[] args) {
		// name() 메소드
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println(name);
		
		// ordinal() 메소드
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		// compareTo() 메소드
		Week day1 = Week.Monday;
		Week day2 = Week.WEDENSDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		
		// valueOf() 메소드
		if(args.length == 1) {
			String strDay = args[0];
			Week weekDay = Week.valueOf(strDay);
			if(weekDay == Week.SATUDAY || weekDay == Week.SUNDAY) {
				System.out.println("주말 입니다.");
			}else {
				System.out.println("평일 입니다.");
			}
		}
		
		// values() 메소드
		Week[] days = Week.values();
		for(Week day : days) {
			System.out.println(day);
		}

	}

}
