package com.javateam.jse;

public class MyClassB implements MyInterface {

	@Override
	public void method1() {
		System.out.println("MyClassB-method 실행");
	}
	
	@Override // 디폴트 메서드 재정의
	public void method2() {
		System.out.println("MyClassB-method2() 실행");
	}
}
