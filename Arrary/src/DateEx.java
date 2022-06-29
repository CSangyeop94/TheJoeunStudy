import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		System.out.println(date.toString());
		
	SimpleDateFormat ft = new SimpleDateFormat("yyyy.MM.dd 'at' hh:mm:ss a zzz");
	// 마지막 a는 오전 오후인지 표시해줄것임
	// zzz는 표준시간 ex) KST
	
	System.out.println(ft.format(date));
	System.out.println(date.getTime());
	long today = System.currentTimeMillis();
	System.out.println(today);
	// 시간을 long 값으로 구함
	
	System.out.println(today - date.getTime());
	}

}
