package p1;

public class A {
	
	//필드
	public int field1;
	int field2;
	private int field3;
	
	// 메소드
	public void method1() {}
	void method2() {}
	private void method3() {}
	
	//생성자
	public A() {
		field1 = 1;
		field2 = 1;
		field3 = 1;
		
		method1();
		method2();
		method3();
		
	}
}

// 필드

/*
 * A a1 = new A(true); A a2 = new A(1); A a3 = new A("문자열");
 * 
 * // 생성자 public A(boolean B) {} // <-- public 접근 제한 A(int b) {} // <-- default
 * 접근 제한 private A(String s) {}
 */// <== private 접근 제한