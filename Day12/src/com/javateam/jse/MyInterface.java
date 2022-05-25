package com.javateam.jse;

public interface MyInterface {
	// 추상 메서드
	public void method1();
	
	// 디폴트 메서드 
	public default void method2() {
		System.out.println("MyInterface-method2 실행");
	}
}
