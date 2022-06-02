package com.javateam.car.modules;

import com.javateam.car.CarImpl;

public class Engine extends CarImpl{
	// 필드 생성
	String engineName;
	// 생성자
	public Engine(String engineName) {
		
		this.engineName = engineName;
	}
	public void combine() {
		System.out.println(engineName + "을 결합합니다.");
	}
}
