package com.javateam.jse;

import com.javateam.jse.JavaEx3.DemoInterface;

public class JavaEx4 {
	public static void main(String[] args) {
		
		// new JavaEx3() => 익명 객체(인스턴스)
		// DemoInterface obj = new JavaEx3();
		// obj.order();
		// 익명 구현 객체
		// 인터페이스 생성자(x)
		// {...} : 클래스
		// DemoInterface => {...구현...} : 익명(구현) 클래스 (객체)
		// 즉시성, 일회성 => 성능
		// 변형 문법
		// UI 프로그래밍 ex) 안드로이드 어플리케이션
		DemoInterface obj2 = new DemoInterface() {
			
			@Override
			public void order() {
				
			}
		};
	}
}
