import java.util.Scanner;

public class Ex01 {
	
	public static void main(String[] args) {
		// 조건
		// 0. 번호를 입력해주세요
		// (1.성적계산 2.구구단 3.아이디 체크)
		// if문으로 구성
		Scanner sc = new Scanner(System.in);
		
		int kor; int eng; int mat; 
		String name;
		String id =null; String pw = null;
		System.out.println("번호를 입력해주세요");
		System.out.println("0.시스템 종료" + "\n"
				+"1. 성적 계산"+ "\n"+
				"2. 구구단"+ "\n"+
				"3. 아이디 체크");
		int num = sc.nextInt();
		if(num != 0) {
			if(num == 1) {
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
				
					}
			else if (num == 2) {
				System.out.println("dan 을 입력해주세요");
				int dan = sc.nextInt();
				for(int i =1; i<10; i++) {
					System.out.println(dan+"dan");
					System.out.println(dan+"*"+i+ "="+(dan*i));
				}
			}
			else if (num == 3) {
				System.out.println("아이디와 비밀번호를 입력해주세요");
				if(id.equals("admin") && pw.equals("1234")) {
					System.out.println("접속 되었습니다.");
				}else {
					System.out.println("접속 실패하였습니다.");
				}
			}
		}else {
			System.out.println("시스템이 종료됩니다");
		}
		
		
		
	}

}
