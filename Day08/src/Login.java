import java.util.Scanner;

public class Login {
	Scanner sc = new Scanner(System.in);
	String id; String pw;
	
	//������ -- �����ڴ� ���� �޾� �ʱ�ȭ ��Ų��.
	Login(String id, String pw) {
		this.id = id; this.pw = pw;
		
	}
	
	String idCheck() {
		if(id.equals("admin") && pw.equals("1111")) {
			return"�α��� ����";
		}else {
			return"�α��� ����";
		}
	}
}
	

