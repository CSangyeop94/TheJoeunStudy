import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id = null;
		String pw = null;

		System.out.println("id�� �Է����ּ���");
		id = sc.next();

		System.out.println("id : " + id);
		switch (id) {
		case "admin":
		case "Admin":
			System.out.println("������");
			break;
		default:
			System.out.println("��������Դϴ�.");
			break;
		}

	}
}
