import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String id = null;
		String pw = null;
		System.out.println("id�� �Է����ּ���");
		id = sc.next();
		if(id.equals("admin")) {
			System.out.println("id�� Ȯ�εǾ����ϴ�. ��й�ȣ�� �Է����ּ���");
			System.out.println("��й�ȣ : ");
			pw = sc.next();
			if(pw.equals("1234")) {
				System.out.println("���� �Ǿ����ϴ�..");
			}else {
				System.out.println("��й�ȣ�� Ʋ���ϴ�..");
			}
		}else {
			System.out.println("�߸��� ���̵��Դϴ�.");
		}
	}

}
