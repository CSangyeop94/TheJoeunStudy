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
			System.out.println("�α��� ����");
		}else {
			System.out.println("�α��� ����");
		}
	}
}
