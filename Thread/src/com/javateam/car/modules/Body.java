package com.javateam.car.modules;

import com.javateam.car.CarImpl;


public class Body extends CarImpl{
	// 필드 생성
	String bodyNmae;
	// 생성자
	public Body(String bodyNmae) {
		
		this.bodyNmae = bodyNmae;
		
	}
	
	public void combine() {
		System.out.println(bodyNmae + " 차체를 결합합니다.");
	}
}
