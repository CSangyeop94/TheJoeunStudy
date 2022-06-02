package com.javateam.car.modules;

import com.javateam.car.CarImpl;

public class Wheel extends CarImpl{
	// 필드 생성
	String wheelName;
	// 생성자
	public Wheel(String wheelName) {
		
		this.wheelName = wheelName;
	}
	public void combine() {
		System.out.println(wheelName + " 바퀴를 결합합니다.");
	}
}
