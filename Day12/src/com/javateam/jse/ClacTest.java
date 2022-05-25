package com.javateam.jse;

public class ClacTest extends CalcClass{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calclnterface calc = new CalcClass();
		
		int x = 10;
		int y = 2;
		System.out.println(calc.add(x, y));
		System.out.println(calc.subtract(x, y));
		System.out.println(calc.divide(x, y));
		System.out.println(calc.multiply(x, y));
		System.out.println(calc.remainder(x, y));
	}

}
