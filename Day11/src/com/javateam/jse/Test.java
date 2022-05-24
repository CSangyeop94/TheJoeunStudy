package com.javateam.jse;

public class Test {
	
	
	public static void main(String[] args) {
		
		// Parent parent = new Parent(); // x
		// 추상클레스 생성자는 간접적으로 관여한다. 직접적으로 하지는 못함
		Child child = new Child();
		
		child.ChildMethod();
		

	}

}
