package book;

public class MyClass {

	// �ʵ� RemoteControl rc
	RemoteControl rc = new Television();
	
	// ������ 
	// RemoteControl rc <- MyClass mc = new MyClass(new Television());
	MyClass(RemoteControl rc) {
		this.rc = rc;
	}
	
	// �޼ҵ�
	void methodA() {
		// ���� ����
		RemoteControl rc = new Audio();
	}
	
	// RemoteControl rc = mc.methodB(new Audio());
	void methodB(RemoteControl rc) {}
}
