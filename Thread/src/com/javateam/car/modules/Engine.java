package com.javateam.car.modules;

import com.javateam.car.CarImpl;

public class Engine extends CarImpl{
	// �ʵ� ����
	String engineName;
	// ������
	public Engine(String engineName) {
		
		this.engineName = engineName;
	}
	public void combine() {
		System.out.println(engineName + "�� �����մϴ�.");
	}
}
