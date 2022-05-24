package com.javateam.jse;

// 자녀 클래스 : Child/sub(서브)/derived(파생) 부모클래스 : Parent
public class Child extends Parent {

		long money = 100000;
		
	void ChildMethod() {
		System.out.println(this.money + super.money);
	}
	Child() {
		System.out.println();
	
	}
	//	@Override  (an-notation)
	//	void parentMethod(String name) {} x
	public void parentMethod() {
		
		super.ParentMethod();
		System.out.println("자녀 클래스의 오버라이딩된 메서드");
	}
	@Override
	void abstractMethod() {
		// super.abstractMethod();
		System.out.println("지시대로 수행하다.");
	}
	
}
