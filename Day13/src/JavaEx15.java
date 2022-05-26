

public class JavaEx15 {
	
	// 실행 소요 시간 => 성능
	public static void main(String[] args) throws InterruptedException {
		long beforeTime = System.currentTimeMillis();
		// Thread 일의 단위
		Thread t = new Thread();
		
		for(int i =0; i<1000; i++) {
			t.sleep(1); //지정된 시간 동안 현재 스레드를 일시 중단합니다.
		}
		long afterTime = System.currentTimeMillis();
		
		System.out.println(afterTime - beforeTime);
	}
}
