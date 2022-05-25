package com.javateam.jse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class JavaEx8 {
	// public static class JavaEx8 { 	(x)
	// protected class JavaEx8 { 	(x)
	// private class JavaEx8 {	  (x)
	// 내부(중첩) 클레스 : 인스턴스(내부) 맴버 클래스
	// has - A 관계 
	// 캡슐화(encapsulation) : 보안과 관련있음
	class InnerClass {
		// private class InnerClass{
		String name;

		InnerClass() {
			System.out.println("내부 클래스의 생성자");
		}

		void method() {
			System.out.println("내부 클래스의 메서드");
		}
	}
	
	void localMethod() {
		
		class LodcalClass{
			String name;
			LodcalClass() {
				System.out.println("지역 클레스 생성자");
			}
			void method() {
				System.out.println("지욕 클레스 메서드");
			}
		}
				
	}

	public static void main(String[] args) {
		
		// InnerClass inner = new InnerClass(); // (x)
		JavaEx8.InnerClass inner 
			= new JavaEx8().new InnerClass(); // (o)
		
		JavaEx8.InnerClass inner2 
		= new JavaEx8().new InnerClass(); // (o)
		
		JavaEx8 outer = new JavaEx8();
		InnerClass inner3 = outer.new InnerClass(); // (o)
		
		// StaticClass stClass = new StaticClass()
		// JavaEx8.StaticClass stClass
		// = new StaticClass(); // (o)
		
		// JavaEx8.StaticClass stClass
		// = new JavaEx8().new StaticClass(); // (o)
		
		JavaEx8 obj = new JavaEx8();
		obj.localMethod();
		
		List<String> list = new ArrayList<>();
		list = Arrays.asList(new String[] {"java","python","c+"});
		
		// 익명 클래스
		// 일회성 => 속성
		// sortedClass obj2 = new sortedClass();
		// Collections.sort(list, obj2);
		
		/*
		 * Collections.sort(list, new Comparator<String>) {
		
			
		
		@Override
		public int compare(String o1, String o2){
			return o1.compareTo(o2); // 오름차순 정렬
			return o2.compareTo(o1); // 내림차순 정렬
		}
		});
		 */
		
		// list.sort(Comparator.naturalOrder()); -- 오름차순
		// list.sort(Comparator.reverseOrder()); -- 내림차순
		
		// list.sort((o1, o2-> o1.compareTo(o2)); -- 오름차순
		// list.sort((o1, o2-> o2.compareTo(o2)); -- 내림차순
		
		for (String s : list) {
			System.out.println(s + " ");
		}
	}
}
