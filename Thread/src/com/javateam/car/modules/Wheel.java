package com.javateam.car.modules;

import com.javateam.car.CarImpl;

public class Wheel extends CarImpl{
	// �ʵ� ����
	String wheelName;
	// ������
	public Wheel(String wheelName) {
		
		this.wheelName = wheelName;
	}
	public void combine() {
		System.out.println(wheelName + " ������ �����մϴ�.");
	}
}
