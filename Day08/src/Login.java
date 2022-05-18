import java.util.Scanner;

public class Login {
	Scanner sc = new Scanner(System.in);
	String id; String pw;
	
	//생성자 -- 생성자는 값을 받아 초기화 시킨다.
	Login(String id, String pw) {
		this.id = id; this.pw = pw;
		
	}
	
	String idCheck() {
		if(id.equals("admin") && pw.equals("1111")) {
			return"로그인 성공";
		}else {
			return"로그인 실패";
		}
	}
}
	

