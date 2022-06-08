import java.awt.Toolkit;

public class BeepPrintEx {
	
	// 메인 스레드만 이용한 경우
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		// toolkit 객체 얻기
		
		for(int i =0; i<5; i++) {
			toolkit.beep(); // 비프음 발생
			try {Thread.sleep(500);} catch(Exception e) {}
			 // Thread.sleep(500) - 0.5초간 일시정지
		}
		for(int i=0; i<5; i++) {
			System.out.println("띵");
			try {Thread.sleep(500);} catch(Exception e) {}
		}
	
	}
}
