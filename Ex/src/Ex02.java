import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kor;
		int eng;
		int mat;
		String name;

		System.out.println("이름은?");
		name = sc.next();
		System.out.println("kor 점수를 입력해주세요");
		kor = sc.nextInt();
		System.out.println("eng 점수를 입력해주세요");
		eng = sc.nextInt();
		System.out.println("mat 점수를 입력해주세요");
		mat = sc.nextInt();
		int tot = kor + eng + mat;
		int avg = tot / 3;
		System.out.println("이름 : " + name);
		System.out.println("kor : " + kor);
		System.out.println("eng : " + eng);
		System.out.println("mat : " + mat);
		System.out.println("tot : " + tot);
		System.out.println("avg : " + avg);

		int score = avg / 10;

		switch (score) {
		case 10:
		case 9:
			System.out.println("A학점 입니다.");
			break;
		case 8:
			System.out.println("B학점 입니다.");
			break;
		case 7:
			System.out.println("C학점 입니다.");
			break;
		case 6:
			System.out.println("D학점 입니다.");
			break;
		default:
			System.out.println("F학점 입니다.");
			break;
		}

	}

}
