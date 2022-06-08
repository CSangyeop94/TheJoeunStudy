package singletonEx;

public class Singleton {
	
	// �̱��� ��ü�� static ������ ����
	private static Singleton instance;
	private int msg;
	
	// �ܺο��� ������ ȣ�� ����
	private Singleton(int msg) {
		try {
			Thread.sleep(100);
			this.msg = msg;
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	// �ν��Ͻ��� ����
	public static Singleton getInstance(int msg) {
		if(instance == null) {
			instance = new Singleton(msg);
		}
		return instance;
	}
	public int getMsg() {
		return msg;
	}
}
