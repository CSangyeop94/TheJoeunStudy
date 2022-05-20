package pakage;

public class Member2 extends Member{
	
	String name; String ssn;
	
	Member2(String id, String pw, String name, String ssn) {
		super(id, pw);
		this.name = name;
		this.ssn = ssn;
	}
	Member2 m2 = new Member2("admin", "1111", "ȫ�浿", "1234");
	
}
