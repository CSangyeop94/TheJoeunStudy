package Day;

import java.util.Scanner;
import java.util.*;
public class Ex01 {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int kor; int eng; int tot; 
		Enum<Grade> grade = null;
		System.out.println("kor ���� �Է� : ");
		kor = sc.nextInt();
		System.out.println("eng ���� �Է� : ");
		eng = sc.nextInt();
		
		tot = kor+eng;
		System.out.println("���� : " + tot);
		int avg = tot/2;
		System.out.println("��� : " + avg);
		
		switch(avg/10) { 
		// 100~90 ������ ���ڵ��� �� ������ ������  
		
		// ����� 10���� ������ �Ǽ��� �����µ� int���̶� �Ǽ��� ������� ����������
		case 10 :
		case 9 : // 90�� �̻� A
		grade = Grade.A;
		break;
		case 8 : // 80�� �̻� B
			grade = Grade.B;
			break;
		case 7 : // 70�� �̻� C
			grade = Grade.C;
			break;
		case 6 : // 60�� �̻� D
			grade = Grade.D;
		default : // ������ ���� F
			grade = Grade.F;
			break;
		
		}
		System.out.println(grade + "���");
	}
}
