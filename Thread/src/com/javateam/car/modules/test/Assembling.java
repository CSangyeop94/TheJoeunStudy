package com.javateam.car.modules.test;

import com.javateam.car.modules.*;
import com.javateam.car.Car.Car;
import com.javateam.car.CarImpl;

public class Assembling{

	public static void main(String[] args) {
		
		Car car = new CarImpl(new Body("�����ٰ�"), 
				new Engine("4������ ���̺긮�� ����"), 
				new Wheel("������ũ Ÿ�̾�"));
		
		car.completeCar();
	}

}
