package com.javateam.jse;

public interface MyInterface {
	// �߻� �޼���
	public void method1();
	
	// ����Ʈ �޼��� 
	public default void method2() {
		System.out.println("MyInterface-method2 ����");
	}
}
