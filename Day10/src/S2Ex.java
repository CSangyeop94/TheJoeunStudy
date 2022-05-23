import java.util.Scanner;

public class S2Ex {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 값을 입력해주는 부분
		System.out.println("이름 : ");
		String name = sc.next();
		System.out.println("kor : ");
		int kor = sc.nextInt();
		System.out.println("mat : ");
		int eng = sc.nextInt();
		System.out.println("eng : ");
		int mat = sc.nextInt();

		// 값을 입력받는 부분
		S2 s2 = new S2(name, kor, eng, mat);
		
		// 메소드 출력
		s2.print();
		s2.tot();
		s2.avg();
		
	}
}
