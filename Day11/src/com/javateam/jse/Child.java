package com.javateam.jse;

import com.javateam.jse.Parent;

// �ڳ� Ŭ���� : Child/sub(����)/derived(�Ļ�) �θ�Ŭ���� : Parent
public class Child extends Parent {

	// is - A ���� --��Ӱ���
	// A Truck(�ڳ�Ŭ����) "is A" Car(�θ�Ŭ����).
	// has-A : ����(aggregation) ����, ���� ����. �ɹ�(�Ҽ�)
	// A Child(��ü/����ü) has A String(�ɹ�)
	
		String str; // has - A ����
		
		void method () {
			System.out.println("Child2");
		}
	
}

/*
 * long money = 100000;
 * 
 * void ChildMethod() { System.out.println(this.money + super.money); } Child()
 * { System.out.println();
 * 
 * } // @Override (an-notation) // void parentMethod(String name) {} x public
 * void parentMethod() {
 * 
 * super.ParentMethod(); System.out.println("�ڳ� Ŭ������ �������̵��� �޼���"); }
 * 
 * @Override void abstractMethod() { // super.abstractMethod();
 * System.out.println("���ô�� �����ϴ�."); }
 */