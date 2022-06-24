import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		// 오입력 :
		// Exception in thread "main"
		// java.util.InputMismatchException
		Scanner sc = new Scanner(System.in);
		
		try {
			
			int korean = sc.nextByte();
		}
		catch (InputMismatchException e) {
			// 처리
			System.out.println("오입력");
			
			// 재입력 조치
		}
	}

}
