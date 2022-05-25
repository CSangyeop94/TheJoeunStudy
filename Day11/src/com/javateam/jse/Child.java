package com.javateam.jse;

import com.javateam.jse.Parent;

// 자녀 클래스 : Child/sub(서브)/derived(파생) 부모클래스 : Parent
public class Child extends Parent {

	// is - A 관계 --상속관계
	// A Truck(자녀클레스) "is A" Car(부모클래스).
	// has-A : 집합(aggregation) 관계, 포함 관계. 맴버(소속)
	// A Child(단체/조직체) has A String(맴버)
	
		String str; // has - A 관계
		
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
 * super.ParentMethod(); System.out.println("자녀 클래스의 오버라이딩된 메서드"); }
 * 
 * @Override void abstractMethod() { // super.abstractMethod();
 * System.out.println("지시대로 수행하다."); }
 */