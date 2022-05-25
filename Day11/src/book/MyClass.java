package book;

public class MyClass {

	// 필드 RemoteControl rc
	RemoteControl rc = new Television();
	
	// 생성자 
	// RemoteControl rc <- MyClass mc = new MyClass(new Television());
	MyClass(RemoteControl rc) {
		this.rc = rc;
	}
	
	// 메소드
	void methodA() {
		// 로컬 변수
		RemoteControl rc = new Audio();
	}
	
	// RemoteControl rc = mc.methodB(new Audio());
	void methodB(RemoteControl rc) {}
}
