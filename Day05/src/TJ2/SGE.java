package TJ2;

import java.util.Scanner;

public class SGE {
	public void SGE() {
		
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
		System.out.println(grade);
	}
	
}
