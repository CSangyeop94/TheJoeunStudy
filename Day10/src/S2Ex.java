import java.util.Scanner;

public class S2Ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// ���� �Է����ִ� �κ�
		System.out.println("�̸� : ");
		String name = sc.next();
		System.out.println("kor : ");
		int kor = sc.nextInt();
		System.out.println("mat : ");
		int eng = sc.nextInt();
		System.out.println("eng : ");
		int mat = sc.nextInt();

		// ���� �Է¹޴� �κ�
		S2 s2 = new S2(name, kor, eng, mat);
		
		// �޼ҵ� ���
		s2.print();
		s2.tot();
		s2.avg();
		
	}
}
