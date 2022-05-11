import java.util.Scanner;

public class BreakEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//
		
		
		
		while(true) {
			System.out.println("메뉴 선택" + "\n" 
		+ "1. 구구단"+ "\n" 
					+ "2.id check"+ "\n"
		+ "3.배수출력" + "\n"
					+ "4.종료");
			int cnt = sc.nextInt();
			
			
			if(cnt ==1) {
				System.out.println("구구단");
				int num; int j;
				System.out.println("단을 입력 해주세요");
				num = sc.nextInt();
				for(int i=0; i<=9; i++) {
					System.out.println(num + "단" + num + "*" + i + "=" + (num*i));
					
					/*함수 사용시
					 * 함수호출
					 * 함수이름(); = gugudan();*/
				}
				
			}else if(cnt ==2) {
				System.out.println("id check");
				String id; String pw;
				System.out.println("id를 입력해주세요");
				id = sc.next();
				System.out.println("pw를 입력해주세요");
				pw = sc.next();
				if(id.equals("admin")) {
					System.out.println("비밀번호를 입력해주세요");
					if(pw.equals("1111")) {
						System.out.println("접속 되었습니다.");
					}else {
						System.out.println("비밀번호가 잘못되었습니다.");
					}
				}else {
					System.out.println("존재 하지 않는 아이디입니다.");
				}
				// System.out.println(idcheck()); - 리턴값만 출력
				// String id = idcheck(); -- 리턴값을 변수에 넣기
				// System.out.println(idcheck()); --> 변화된 변수값을 출력
				// System.out.println(id);
				
			}else if(cnt ==3) {
				System.out.println("배수출력");
				int num;	int num1=0;
				//System.out.println("숫자입력 해주세요");
				//num = sc.nextInt();
				for(num=0; num<=100; num++) {
					if(num%2 ==0) {
						num1 += num;
						
					}
				}System.out.println("1~100까지의 짝수의 합 : " + num1); 
				
			}else if(cnt ==4) {
				System.out.println("종료");
				break;
			}
		}
		
		
		/*
		 * int i = 0; int sum =0; int j; while(true) { //1~5까지의 합을 구한후 break;로 빠져나오기 sum
		 * += i; i++; if(i>5) { break; } } System.out.println("1부터5까지의 합 : " + sum);
		 * 
		 */
			
			}
	
		// 클레스 안에 들어간 Scanner은 클레스 안에서만 작동
		// 함수 사용시 다시한번 Scanner 선언
		public static void gugudan() {//void는 리턴값이 없음 
			for(int i=1; i<=9; i++) {
				System.out.println(i);
			}
		}
		public static String idcheck() {
			Scanner sc = new Scanner(System.in); // 다시 선언해서 사용
			System.out.println("id입력:");
			String id = sc.next(); //클레스에 선언한거라 sc라는 참조변수가 작동이안됨
			return id;
		}
	}


