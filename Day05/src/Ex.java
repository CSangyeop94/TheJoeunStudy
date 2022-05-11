import java.util.Scanner;

public class Ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("메뉴선택" + "\n" + "1번 구구단" + "\n" + "2번 성적입력");
			int num = 0;
			num = sc.nextInt();

			if (num == 1) {

				gugudan();

			} else if (num == 2) {

				String grade = sungjuk();
				System.out.println("결과 : " + grade);

			} else {
				System.out.println("종료");
			}
			break;
		}

	}

	public static void gugudan() {
		for (int i = 1; i <= 9; i++) {
			System.out.println(i + "단");
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
		System.out.println("kor 점수 입력 : ");
		kor = sc.nextInt();
		System.out.println("eng 점수 입력 : ");
		eng = sc.nextInt();
		System.out.println("mat 점수 입력 : ");
		mat = sc.nextInt();
		System.out.println();
		int tot = kor + eng + mat;
		System.out.println("총점 : " + tot);
		int avg = tot / 3;
		System.out.println("평균 : " + avg);

		if (avg >= 60 && kor >= 40 && eng >= 40 && mat >= 40) {
			grade = "합격";
		} else {
			grade = "불합격";
		}
		return grade;
	}
}
