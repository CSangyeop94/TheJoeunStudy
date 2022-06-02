package com.javateam.car.modules.test;

import com.javateam.car.modules.*;
import com.javateam.car.Car.Car;
import com.javateam.car.CarImpl;

public class Assembling{

	public static void main(String[] args) {
		
		Car car = new CarImpl(new Body("하이텐강"), 
				new Engine("4륜구동 하이브리드 엔진"), 
				new Wheel("스파이크 타이어"));
		
		car.completeCar();
	}

}
