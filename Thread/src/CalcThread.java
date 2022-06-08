// 작업 스레드
public class CalcThread extends Thread {
	public CalcThread(String name) {
		setName(name);
		// 스레드 이름 변경
	}
	
	public void run() {
		for(int i =0; i<2000000000; i++) {
		// 스레드가 실행할 내용
		}
		System.out.println(getName());
	}
}
