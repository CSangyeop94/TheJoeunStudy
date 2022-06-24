import java.util.ArrayList;
import java.util.Scanner;

public class Ex09 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.println("(1~10)성적을 입력할 인원수를 입력해주세요 : ");
		i = sc.nextInt();
		// 교과수
		String subject[] = {"국어","영어","수학"};
		// 학생수
		int student[] = new int[i];
		// 점수를 받을 배열
		int jumsu[] = new int[3];
		try{
			if(0>=i && i>10) {	
				System.out.println(i+"명 입니다.");
			}else {
				System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
			}
		}catch(Exception e) {
			System.out.println("잘못된 입력입니다. 다시 입력해주세요.");
		}
		int length = student.length;
		System.out.println(length + "명 입니다.");
		System.out.println("메뉴를 선택해주세요");
		System.out.println("1번 성적계산 2번 성적 현황 3번 성적 총괄 현황");
		
		String name = null;
		int tot = (jumsu[0]+jumsu[1]+jumsu[2]); 
		double avg = tot/3.0;
		while(true) {
			int num = sc.nextInt();
			if(num == 1) {
				for(int j=0; j<student.length; j++) {
					System.out.println("이름은?");
					name = sc.next();
					System.out.println("kor 점수를 입력해주세요");
					jumsu[0] = sc.nextInt();
					System.out.println("eng 점수를 입력해주세요");
					jumsu[1] = sc.nextInt();
					System.out.println("mat 점수를 입력해주세요");
					jumsu[2] = sc.nextInt();
					System.out.println("이름 : " + name +"\n"+ subject[0] + jumsu[0]+"\n"+
							subject[1] + jumsu[1]+"\n"+ subject[2] + jumsu[2]+"\n"+"tot : " + tot
							+"\n"+"avg : " + avg);
					}
				
			}
		}
	}
}
