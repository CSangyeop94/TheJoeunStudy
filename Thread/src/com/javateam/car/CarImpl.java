package com.javateam.car;

import com.javateam.car.Car.Car;
import com.javateam.car.modules.Body;
import com.javateam.car.modules.Engine;
import com.javateam.car.modules.Wheel;

public class CarImpl implements Car {
	Body body;
	Engine engine;
	Wheel wheel;
	
	// 기본생성자
	public CarImpl() {
		
	};
	// 오버라이딩될 생성자 
	public CarImpl(Body body, Engine engine, Wheel wheel) {
		this.body = body;
		this.engine = engine;
		this.wheel = wheel;
	}

	@Override
	public void cornbineEngine() {
		engine.combine();
	}
	@Override
	public void cornbineBody() {
		body.combine();
	}
	@Override
	public void cornbineWheel() {
		wheel.combine();
	}
	@Override
	public void completeCar() {
		this.cornbineBody();
		this.cornbineEngine();
		this.cornbineWheel();
		System.out.println("차량 제작이 완료 되었습니다.");
	}

	
}
