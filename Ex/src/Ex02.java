import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor;
		int eng;
		int mat;
		String name;

		System.out.println("�̸���?");
		name = sc.next();
		System.out.println("kor ������ �Է����ּ���");
		kor = sc.nextInt();
		System.out.println("eng ������ �Է����ּ���");
		eng = sc.nextInt();
		System.out.println("mat ������ �Է����ּ���");
		mat = sc.nextInt();
		int tot = kor + eng + mat;
		int avg = tot / 3;
		System.out.println("�̸� : " + name);
		System.out.println("kor : " + kor);
		System.out.println("eng : " + eng);
		System.out.println("mat : " + mat);
		System.out.println("tot : " + tot);
		System.out.println("avg : " + avg);

		int score = avg / 10;

		switch (score) {
		case 10:
		case 9:
			System.out.println("A���� �Դϴ�.");
			break;
		case 8:
			System.out.println("B���� �Դϴ�.");
			break;
		case 7:
			System.out.println("C���� �Դϴ�.");
			break;
		case 6:
			System.out.println("D���� �Դϴ�.");
			break;
		default:
			System.out.println("F���� �Դϴ�.");
			break;
		}

	}

}
