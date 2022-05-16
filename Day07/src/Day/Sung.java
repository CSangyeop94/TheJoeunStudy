package Day;

import java.util.Scanner;

public class Sung {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int kor=0; int eng=0; int mat=0;
		System.out.println("kor 점수 : ");
		kor = sc.nextInt();
		System.out.println("eng 점수 : ");
		eng = sc.nextInt();
		System.out.println("mat 점수 : ");
		mat = sc.nextInt();
		
		Sung1 ss1 = new Sung1();
		System.out.println("이름 : " + ss1.name);
		ss1.tot(kor, eng, mat);
		double avg = ss1.avg();
		System.out.println("avg 점수 : "+ avg);
		

	}

}
