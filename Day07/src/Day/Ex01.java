package Day;

import java.util.Scanner;
import java.util.*;
public class Ex01 {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int kor; int eng; int tot; 
		Enum<Grade> grade = null;
		System.out.println("kor 점수 입력 : ");
		kor = sc.nextInt();
		System.out.println("eng 점수 입력 : ");
		eng = sc.nextInt();
		
		tot = kor+eng;
		System.out.println("총점 : " + tot);
		int avg = tot/2;
		System.out.println("평균 : " + avg);
		
		switch(avg/10) { 
		// 100~90 까지의 숫자들을 다 쓸수는 없으니  
		
		// 평균을 10으로 나누면 실수가 나오는데 int형이라 실수는 사라지고 정수만남음
		case 10 :
		case 9 : // 90점 이상 A
		grade = Grade.A;
		break;
		case 8 : // 80점 이상 B
			grade = Grade.B;
			break;
		case 7 : // 70점 이상 C
			grade = Grade.C;
			break;
		case 6 : // 60점 이상 D
			grade = Grade.D;
		default : // 나머지 점수 F
			grade = Grade.F;
			break;
		
		}
		System.out.println(grade + "등급");
	}
}
