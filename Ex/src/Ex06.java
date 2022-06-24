import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String id = null;
		String pw = null;
		System.out.println("id를 입력해주세요");
		id = sc.next();
		if(id.equals("admin")) {
			System.out.println("id가 확인되었습니다. 비밀번호를 입력해주세요");
			System.out.println("비밀번호 : ");
			pw = sc.next();
			if(pw.equals("1234")) {
				System.out.println("접속 되었습니다..");
			}else {
				System.out.println("비밀번호가 틀립니다..");
			}
		}else {
			System.out.println("잘못된 아이디입니다.");
		}
	}

}
