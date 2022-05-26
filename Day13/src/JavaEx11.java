import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class JavaEx11 {
	public static void main(String[] args) {

		// 자원 자동 반납(close)
		// 자원 반납 안하면 자원 리크(resource leak) 발생
		// 시스탬 자원(메모리, CPU, HDD, SSD, 주면ID 장치들.....)
		// 자원은 다른 프로세스들과 공유해야 됨
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("a.txt");
			int result = 0;

			while ((result = fis.read()) != -1) {
				System.out.print((char) result);

			}
			// fis.close(); // 자원반납

		} catch (FileNotFoundException e) {
			System.out.println("File : 파일이 없음");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IOE : ID 예외 발생");
			e.printStackTrace();
			/*
			 * } finally { try { if (fis != null) fis.close(); } catch (IOException e) {
			 * System.out.println("자원 반납 실패"); e.printStackTrace(); }
			 */
		}
	}
}
