import java.util.Scanner;

public class Ex05 {
	public static void main (String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("메뉴 \n" + "1. 배수 출력\n"+"2. 성적 처리\n");
		
		int kor; int eng; int mat; 
		String name;
		int num;
		int sum = 0; // 배수
		int sum1 = 0; // 홀수의 합
		int sum2 = 0; // 짝수의 합
		int sum3 = 0; // 4의 배수의합
		num = sc.nextInt();
		switch(num) {
		case 1
		: System.out.println("배수 출력");
		for(int i=5; i<20; i++) {
			sum += i;
			if (sum % 3 == 0) {
				sum1 += i;
			}else {
				sum2 += i;
			}
			if(sum % 4 == 0) {
				sum3 += i;
			}
		}
		System.out.println("홀수의 합 : " + sum1);
		System.out.println("짝수의 합 : " + sum2);
		System.out.println("3.4배수의 합 : " +(sum1+sum3));
		break;
		case 2
		: 
			System.out.println("이름은?");
		name = sc.next();
		System.out.println("kor 점수를 입력해주세요");
		kor = sc.nextInt();
		System.out.println("eng 점수를 입력해주세요");
		eng = sc.nextInt();
		System.out.println("mat 점수를 입력해주세요");
		mat = sc.nextInt();
		int tot = kor+eng+mat; 
		double avg = tot/3.0;
		System.out.println("이름 : " + name);
		System.out.println("kor : " + kor);
		System.out.println("eng : " + eng);
		System.out.println("mat : " + mat);
		System.out.println("tot : " + tot);
		System.out.println("avg : " + avg);
		if(avg>=60 && kor>=40 && eng>=40 && mat>=40) {
			System.out.println("합격입니다.");
		}else {
			System.out.println("불합격입니다.");
		}
		break;
		}
		 
		
			
		
	}
}
