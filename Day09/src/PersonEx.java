import java.util.Scanner;

public class PersonEx {

		public static void main(String[] args) {
			Person ps = new Person();
			Scanner sc = new Scanner(System.in);
			System.out.println("�����Է� : ");
			
			Person.salary = sc.nextInt();
			
			int tax1 = (int)ps.getTax(); // ����
			int tax2 = (int)ps.getTax2();
			System.out.println("���� : " + ps.salary + "��");
			System.out.println("�ҵ漼 : "+ tax1 + "��"); // �ҵ漼
			System.out.println("���漼 : " + tax2 + "��"); // ���漼
			System.out.println("�Ѽ��� : " + (tax1+tax2) + "��");
			System.out.println("�Ǽ��ɾ� : " +(int)(ps.salary - (tax1 + tax2)) + "��" );
		}
}
