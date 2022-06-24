import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String id = null;
		String pw = null;

		System.out.println("id를 입력해주세요");
		id = sc.next();

		System.out.println("id : " + id);
		switch (id) {
		case "admin":
		case "Admin":
			System.out.println("관리자");
			break;
		default:
			System.out.println("비관리자입니다.");
			break;
		}

	}
}
