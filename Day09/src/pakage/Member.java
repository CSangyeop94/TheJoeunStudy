package pakage;

public class Member {
	
	public String id; 
	public String pw;
	Member(String id,String pw) {
		this.id = id;
		this.pw = pw;
	}
	
	
	void idCheck(String id, String pw) {
		
		if(id.equals("admin") && pw.equals("1111")) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
	}
}
