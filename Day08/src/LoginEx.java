

import java.util.Scanner;

public class LoginEx {

	public static void main(String[] args) {
		
		String id; String pw;
		
		while(true) { // ���ѷ���
			Scanner sc = new Scanner(System.in);
			System.out.println("id : ");
			id = sc.next();
			System.out.println("pw : ");
			pw = sc.next();
			Login login = new Login(id, pw); // id.pw�� �Է��� ���� ��
			String result = login.idCheck();
			if(result == "�α��� ����") {
				System.out.println("id " + login.id + "\npw : " + login.pw + "�α��� ����" );
				break; // while ����
			} else {
				System.out.println("id " + login.id + "\npw : " + login.pw + "�α��� ����" );

			}
		}
		
		
		
		
	}
}
	