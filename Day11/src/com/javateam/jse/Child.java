package com.javateam.jse;

// �ڳ� Ŭ���� : Child/sub(����)/derived(�Ļ�) �θ�Ŭ���� : Parent
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
		System.out.println("�ڳ� Ŭ������ �������̵��� �޼���");
	}
	@Override
	void abstractMethod() {
		// super.abstractMethod();
		System.out.println("���ô�� �����ϴ�.");
	}
	
}
