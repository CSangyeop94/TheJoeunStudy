package singletonEx;

public class Singleton {
	
	// 싱글톤 객체를 static 변수로 선언
	private static Singleton instance;
	private int msg;
	
	// 외부에서 생성자 호출 막기
	private Singleton(int msg) {
		try {
			Thread.sleep(100);
			this.msg = msg;
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	// 인스턴스를 전달
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
