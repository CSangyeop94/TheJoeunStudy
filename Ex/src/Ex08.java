import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		/* -------------- 국/영/수 (입력부) -------------- */

		// TODO
		// 국/영/수 점수 입력
		// 조건)
		// 1) 각 과목을 별도로 입력
		// 2) 과목 입력 타이틀(표제) 출력
		// ex) 국어 점수 입력 :
		// 3) 각 과목 입력값 => 각 과목 변수 대입

		// TODO
		// 데이터 입력 유효성 검사/재입력 유도
		// 예외처리(try ~ catch)
		// 0 ~ 100 사이의 정수 입력 되면 유효 판정
		//
		// 무한 루프/분기

		int kor;
		int eng;
		int mat;
		Scanner sc = new Scanner(System.in);

		String subjects[] = { "국어", "영어", "수학" };
		int[] scores = new int[subjects.length];

		for (int i = 0; i < subjects.length; i++) {

			while (true) {

				System.out.println(subjects[i] + "값을 입력해주세요");

				try {
					scores[i] = sc.nextInt();

				} catch (InputMismatchException e) {
					// 잘못된 데이터 값을 넣어주면 오류 발생 
					System.out.println("잘못된 값의 입력입니다.");
					continue; 
					// 오류가 나온다고 끝나지않게 continue;
				}
				// i가 0~100 사이로 나오게 검사
				if (scores[i] >= 0 && scores[i] <= 100) {
					break;
				} else {
					System.out.println("잘못된 값입니다.");
				}

			}
		}
		kor = scores[0];
		eng = scores[1];
		mat = scores[2];
		System.out.println("kor : "+ kor);
		System.out.println("eng : "+eng);
		System.out.println("mat : "+mat);

		int tot = scores[0] + scores[1] + scores[2];
		double avg = tot / scores.length;
		System.out.println("tot : "+tot);
		System.out.println("avg : "+avg);
		sc.close();
	}	

}
