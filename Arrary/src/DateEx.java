import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date = new Date();
		System.out.println(date.toString());
		
	SimpleDateFormat ft = new SimpleDateFormat("yyyy.MM.dd 'at' hh:mm:ss a zzz");
	// ������ a�� ���� �������� ǥ�����ٰ���
	// zzz�� ǥ�ؽð� ex) KST
	
	System.out.println(ft.format(date));
	System.out.println(date.getTime());
	long today = System.currentTimeMillis();
	System.out.println(today);
	// �ð��� long ������ ����
	
	System.out.println(today - date.getTime());
	}

}
