import java.util.Scanner;

public class ScannerEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("id�� �Է����ּ���");
		String id = sc.next();
		System.out.println("pw�� �Է����ּ���");
		String pw = sc.next();
		
		if(id.equals("admin") && pw.equals("1111")) {
			System.out.println("���ӿ� �����Ͽ����ϴ�.");
		}else {
			System.out.println("���ӿ� ���� �Ͽ����ϴ�.");
		}
	}

}
