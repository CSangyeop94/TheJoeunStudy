import java.util.Scanner;

public class ScannerEx1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("id를 입력해주세요");
		String id = sc.next();
		System.out.println("pw를 입력해주세요");
		String pw = sc.next();
		
		if(id.equals("admin") && pw.equals("1111")) {
			System.out.println("접속에 성공하였습니다.");
		}else {
			System.out.println("접속에 실패 하였습니다.");
		}
	}

}
