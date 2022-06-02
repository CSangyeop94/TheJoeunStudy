package com.javateam.car;

import com.javateam.car.Car.Car;
import com.javateam.car.modules.Body;
import com.javateam.car.modules.Engine;
import com.javateam.car.modules.Wheel;

public class CarImpl implements Car {
	Body body;
	Engine engine;
	Wheel wheel;
	
	// �⺻������
	public CarImpl() {
		
	};
	// �������̵��� ������ 
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
		System.out.println("���� ������ �Ϸ� �Ǿ����ϴ�.");
	}

	
}
