package TJ2;

import java.util.Scanner;

public class SGE {
	public void SGE() {
		
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
		System.out.println(grade);
	}
	
}
