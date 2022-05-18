package Tj;

import java.util.Scanner;

public class Calc {
	int kor; int eng; int mat;
	int tot; 
	
	
	 int tot() {
		 
		return kor+eng+mat;
	}
	 double avg () {
		 
		 return (kor+eng+mat)/3;
	 }
	 String grade() {
		 
		 double avg = avg();
		 if(avg >=60 && kor >= 40 && eng >= 40 && mat >= 40) {
			return "합격"; 
		 }else {
			 return "불합격";
		 }
	 }
	 void input () {
		 Scanner sc = new Scanner(System.in);
		
			System.out.println("점수를 입력해주세요");
			System.out.println("kor : ");
			kor = sc.nextInt();
			System.out.println("eng : ");
			eng = sc.nextInt();
			System.out.println("mat : ");
			mat = sc.nextInt();
			
	 }
	 void excute () {
		 input();
		 System.out.println("kor : " + kor);
		 System.out.println("eng : " + eng);
		 System.out.println("mat : " + mat);
		 System.out.println("총점 : " + tot());
		 System.out.println("평균 : " + avg());
		 System.out.println("결과 : " + grade());
	 }
}
