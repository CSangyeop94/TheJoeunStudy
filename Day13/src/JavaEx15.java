

public class JavaEx15 {
	
	// ���� �ҿ� �ð� => ����
	public static void main(String[] args) throws InterruptedException {
		long beforeTime = System.currentTimeMillis();
		// Thread ���� ����
		Thread t = new Thread();
		
		for(int i =0; i<1000; i++) {
			t.sleep(1); //������ �ð� ���� ���� �����带 �Ͻ� �ߴ��մϴ�.
		}
		long afterTime = System.currentTimeMillis();
		
		System.out.println(afterTime - beforeTime);
	}
}
