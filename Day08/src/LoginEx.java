

import java.util.Scanner;

public class LoginEx {

	public static void main(String[] args) {
		
		String id; String pw;
		
		while(true) { // 무한루프
			Scanner sc = new Scanner(System.in);
			System.out.println("id : ");
			id = sc.next();
			System.out.println("pw : ");
			pw = sc.next();
			Login login = new Login(id, pw); // id.pw에 입력한 값이 들어감
			String result = login.idCheck();
			if(result == "로그인 성공") {
				System.out.println("id " + login.id + "\npw : " + login.pw + "로그인 성공" );
				break; // while 종료
			} else {
				System.out.println("id " + login.id + "\npw : " + login.pw + "로그인 실패" );

			}
		}
		
		
		
		
	}
}
	