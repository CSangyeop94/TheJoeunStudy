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
			return "�հ�"; 
		 }else {
			 return "���հ�";
		 }
	 }
	 void input () {
		 Scanner sc = new Scanner(System.in);
		
			System.out.println("������ �Է����ּ���");
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
		 System.out.println("���� : " + tot());
		 System.out.println("��� : " + avg());
		 System.out.println("��� : " + grade());
	 }
}
