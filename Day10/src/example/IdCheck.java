package example;

public class IdCheck extends Check {
	

	// 생성자
	IdCheck(String id, String pw) {
		super(id, pw);
		
	}
	// 메소드 재정의
	 void Idc(Check check) {
		
		if(id.equals("admin") && pw.equals("1234")) {
			System.out.println("자식클래스.로그인성공");
		}else {
			System.out.println("자식클래스.로그인실패");
		}
	}

	
}
