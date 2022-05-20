package com.Package1;

public class AA {
	String name;
	int num1;
	int num2;
	int num3;
	private int num4;

	// 생성자
	public AA(String name, int num1, int num2) {
		this.name = name;
		this.num1 = num1;
		this.num2 = num2;
	}

	// 생성자 - 같은 패키지만 하용
	AA(int num3, int num4) {
		this.num3 = num3;
		this.num4 = num4;
	}

	public void getCalc() { // 필드의 num1 num2 사용
		System.out.println("두 수의 합 : " + (num1 + num2));
		System.out.println("두 수의 빼기 : " + (num1 - num2));
		System.out.println("두 수의 곱 : " + (num1 * num2));
		System.out.println("두 수의 나누기 : " + (num1 / num2));
	}

	boolean getEven(int num) {
		this.num3 = num;
		if (num3 % 2 == 0) {
			return true;
		} else {
			System.out.print("홀수입니다.");
		}	return false;
	}

	public int getNum(int num) {
		
		System.out.print("바뀐값 : " + num4);
		return this.num4 = num;
	}

}
