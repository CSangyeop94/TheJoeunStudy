package p1;

public class A {
	
	//�ʵ�
	public int field1;
	int field2;
	private int field3;
	
	// �޼ҵ�
	public void method1() {}
	void method2() {}
	private void method3() {}
	
	//������
	public A() {
		field1 = 1;
		field2 = 1;
		field3 = 1;
		
		method1();
		method2();
		method3();
		
	}
}

// �ʵ�

/*
 * A a1 = new A(true); A a2 = new A(1); A a3 = new A("���ڿ�");
 * 
 * // ������ public A(boolean B) {} // <-- public ���� ���� A(int b) {} // <-- default
 * ���� ���� private A(String s) {}
 */// <== private ���� ����