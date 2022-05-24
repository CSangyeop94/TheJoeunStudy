package package100;

import java.util.Scanner;

public class SungEx {

	public static void main(String[] args) {
		int num;
		String[] name=new String[3];
		int[] kor=new int[3];
		int[] eng=new int[3];
		int[] mat=new int[3];
		int[] tot=new int[3];
		double[] avg=new double[3];
		String[] grade=new String[3];
		String id ;String pw;
		Scanner sc=new Scanner(System.in);
		while(true) {
	System.out.println("메뉴 1. 점수 입력 2. 점수 출력  3. 합격여부 4.아이디체크 5. 종료");
	num=sc.nextInt();
	
	if(num==1) {
		
		for(int i=0;i<3;i++) {
		System.out.println("이름 :");
		name[i]=sc.next();
		System.out.println("국어점수 :");
		kor[i]=sc.nextInt();
		System.out.println("영어점수 :");
		eng[i]=sc.nextInt();
		System.out.println("수학점수 :");
		mat[i]=sc.nextInt();
		Sung sung=new Sung(name[i],kor[i],eng[i],mat[i]);
		tot[i]=sung.getTot();
		avg[i]=sung.getAvg();
		grade[i]=sung.getGrade();
		}
		
	}else if(num==2) {
		
		for(int i=0;i<3;i++) {
			System.out.println("이름 :" + name[i]);
			System.out.println("국어점수 : " + kor[i]);
			System.out.println("영어점수 : " + eng[i]);
			System.out.println("수학점수 :" + mat[i]);
		}
	}else if(num==3) {
		for(int i=0;i<3;i++) {
			System.out.println("이름 :" + name[i]);
			System.out.println("총점 :" + tot[i]);
			System.out.println("평균 : " + avg[i]);
			System.out.println("합격여부 : " + grade[i]);
		}
	}else if(num==4) {
		System.out.println("아이디 :");
		id=sc.next();
		System.out.println("암호 :");
		pw=sc.next();
		Sung sung=new Sung();
		sung.idCheck(id, pw);
	}else {
		break ;
			}
		}
	}
}