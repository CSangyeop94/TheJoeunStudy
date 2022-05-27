import java.util.Scanner;
import java.util.regex.Pattern;

public class JavaEx21 {
	
	public static void main(String[] args) {
		
		// ��ȭ��ȣ ex) 010-1234-5678
		// ����(ǥ��)�� : regular expression (regex)
		// http://rad-software-regular-expression-designer.software.informer.com/download/
		// ���� : [0-9] or \\d
		
		System.out.println("�Է� : ");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		System.out.println("�Է� : " + input);
		String regex = "010-\\d{4}-\\d{4}";
		//  \\d - ����(0~9) {}�ȿ� ���ڸ� ������ ��Ȯ�� ���¶�
		// {4} = ��Ȯ�ϰ� 4��      {4.} = �ּ��� 4��
		// {n. m} = n������ m�� ����
		boolean flag = Pattern.matches(regex, input);
		
		System.out.println(flag == true ? "��ȿ" : "��ȿ");
		
		sc.close();
	}
}
