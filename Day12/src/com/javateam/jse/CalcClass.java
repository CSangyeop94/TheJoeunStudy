package com.javateam.jse;

public class CalcClass implements Calclnterface {
	
	
	@Override
	public int add(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
		
	}
	@Override
	public int subtract(int x, int y) {
		// TODO Auto-generated method stub
		
		return x-y;
	}

	@Override
	public int multiply(int x, int y) {
		// TODO Auto-generated method stub
		
		return x*y;
	}

	@Override
	public float divide(int x, int y) {
		// TODO Auto-generated method stub

		return x/y;
	}

	@Override
	public int remainder(int x, int y) {
		// TODO Auto-generated method stub
		 
		return x%y;
	}

	
}
