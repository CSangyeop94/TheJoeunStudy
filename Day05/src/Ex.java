import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("�޴�����" + "\n" + "1�� ������" + "\n" + "2�� �����Է�");
			int num = 0;
			num = sc.nextInt();

			if (num == 1) {

				gugudan();

			} else if (num == 2) {

				String grade = sungjuk();
				System.out.println("��� : " + grade);

			} else {
				System.out.println("����");
			}
			break;
		}

	}

	public static void gugudan() {
		for (int i = 1; i <= 9; i++) {
			System.out.println(i + "��");
			for (int j = 2; j <= 9; j++) {

				System.out.println(i + "*" + j + "=" + (i * j));
			}

		}
	}

	public static String sungjuk() {
		Scanner sc = new Scanner(System.in);
		int kor;
		int eng;
		int mat;
		String grade;
		System.out.println("kor ���� �Է� : ");
		kor = sc.nextInt();
		System.out.println("eng ���� �Է� : ");
		eng = sc.nextInt();
		System.out.println("mat ���� �Է� : ");
		mat = sc.nextInt();
		System.out.println();
		int tot = kor + eng + mat;
		System.out.println("���� : " + tot);
		int avg = tot / 3;
		System.out.println("��� : " + avg);

		if (avg >= 60 && kor >= 40 && eng >= 40 && mat >= 40) {
			grade = "�հ�";
		} else {
			grade = "���հ�";
		}
		return grade;
	}
}
