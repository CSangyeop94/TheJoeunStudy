package com.Package1;

public class AA {
	String name;
	int num1;
	int num2;
	int num3;
	private int num4;

	// ������
	public AA(String name, int num1, int num2) {
		this.name = name;
		this.num1 = num1;
		this.num2 = num2;
	}

	// ������ - ���� ��Ű���� �Ͽ�
	AA(int num3, int num4) {
		this.num3 = num3;
		this.num4 = num4;
	}

	public void getCalc() { // �ʵ��� num1 num2 ���
		System.out.println("�� ���� �� : " + (num1 + num2));
		System.out.println("�� ���� ���� : " + (num1 - num2));
		System.out.println("�� ���� �� : " + (num1 * num2));
		System.out.println("�� ���� ������ : " + (num1 / num2));
	}

	boolean getEven(int num) {
		this.num3 = num;
		if (num3 % 2 == 0) {
			return true;
		} else {
			System.out.print("Ȧ���Դϴ�.");
		}	return false;
	}

	public int getNum(int num) {
		
		System.out.print("�ٲﰪ : " + num4);
		return this.num4 = num;
	}

}
