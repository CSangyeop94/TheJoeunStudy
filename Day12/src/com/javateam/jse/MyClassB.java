package com.javateam.jse;

public class MyClassB implements MyInterface {

	@Override
	public void method1() {
		System.out.println("MyClassB-method ����");
	}
	
	@Override // ����Ʈ �޼��� ������
	public void method2() {
		System.out.println("MyClassB-method2() ����");
	}
}
