import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		
		// ���Է� :
		// Exception in thread "main"
		// java.util.InputMismatchException
		Scanner sc = new Scanner(System.in);
		
		try {
			
			int korean = sc.nextByte();
		}
		catch (InputMismatchException e) {
			// ó��
			System.out.println("���Է�");
			
			// ���Է� ��ġ
		}
	}

}
