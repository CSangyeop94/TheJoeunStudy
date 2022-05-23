package package100;

import java.util.Scanner;

public class SungEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("메뉴를 선택해주세요");
		String name = null;
		String id = null;
		String pw = null;
		
		int[] score = new int[6];
		score[i] = kor; score[i] = eng; score[i] = mat; 
		
		
		int kor = 0;
		int eng = 0;
		int mat = 0;
		Sung s1 = new Sung(kor, eng, mat, id, pw);
		while (true) {

			System.out.println("1. 점수입력\n" + "2. 점수 출력\n" + "3.합격 여부\n" + "4. 아이디체크\n" + "5. 종료");
			int num = sc.nextInt();
			if (num == 1) {	
				for(int i = 0; i<5; i++) {
					int[] arr = new int[i];
					System.out.println("점수를 입력해주세요");
					System.out.println("name : ");
				    name[i] = sc.next();
					System.out.println("kor : ");
					kor[i] = sc.nextInt();
					System.out.println("eng : ");
					eng[i] = sc.nextInt();
					System.out.println("mat : ");
					mat[i] = sc.nextInt();
				}
				
			} else if (num == 2) {
				System.out.println("name : " + name);
				System.out.println("kor : " + kor);
				System.out.println("eng : " + eng);
				System.out.println("mat : " + mat);
				return;
			} else if (num == 3) {
				System.out.println("name : " + name);
				System.out.println("총점 : " + s1.getTot());
				System.out.println("평균 : " + s1.getAvg());
				System.out.println("합격여부 : " + s1.getGrade());
				return;
			} else if (num == 4) {
				System.out.println("id/pw 입력해주세요");
				System.out.println("id : ");
				id = sc.next();
				System.out.println("pw : ");
				pw = sc.next();
				s1.getIdCheck(id, pw);
				return;
			} else if (num == 5) {
				System.out.println("종료합니다.");
				return;
			} else {
				System.out.println("잘못된 입력입니다.");
			}

		}

	}

}
