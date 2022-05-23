package example;

public class Check {

	// 필드
	String id;
	String pw;
	
	// 생성자
	Check(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	void Idc (Check check) { // Check check 클레스 변수
		if(id.equals("admin") && pw.equals("1111")) {
			System.out.println("부모클래스.로그인성공");
		}else {
			System.out.println("부모클래스.로그인실패");
		}
	}
}
