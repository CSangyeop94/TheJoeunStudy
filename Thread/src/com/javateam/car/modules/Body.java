package com.javateam.car.modules;

import com.javateam.car.CarImpl;


public class Body extends CarImpl{
	// �ʵ� ����
	String bodyNmae;
	// ������
	public Body(String bodyNmae) {
		
		this.bodyNmae = bodyNmae;
		
	}
	
	public void combine() {
		System.out.println(bodyNmae + " ��ü�� �����մϴ�.");
	}
}
