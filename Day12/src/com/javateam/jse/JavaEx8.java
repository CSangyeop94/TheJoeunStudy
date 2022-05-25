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
	// ����(��ø) Ŭ���� : �ν��Ͻ�(����) �ɹ� Ŭ����
	// has - A ���� 
	// ĸ��ȭ(encapsulation) : ���Ȱ� ��������
	class InnerClass {
		// private class InnerClass{
		String name;

		InnerClass() {
			System.out.println("���� Ŭ������ ������");
		}

		void method() {
			System.out.println("���� Ŭ������ �޼���");
		}
	}
	
	void localMethod() {
		
		class LodcalClass{
			String name;
			LodcalClass() {
				System.out.println("���� Ŭ���� ������");
			}
			void method() {
				System.out.println("���� Ŭ���� �޼���");
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
		
		// �͸� Ŭ����
		// ��ȸ�� => �Ӽ�
		// sortedClass obj2 = new sortedClass();
		// Collections.sort(list, obj2);
		
		/*
		 * Collections.sort(list, new Comparator<String>) {
		
			
		
		@Override
		public int compare(String o1, String o2){
			return o1.compareTo(o2); // �������� ����
			return o2.compareTo(o1); // �������� ����
		}
		});
		 */
		
		// list.sort(Comparator.naturalOrder()); -- ��������
		// list.sort(Comparator.reverseOrder()); -- ��������
		
		// list.sort((o1, o2-> o1.compareTo(o2)); -- ��������
		// list.sort((o1, o2-> o2.compareTo(o2)); -- ��������
		
		for (String s : list) {
			System.out.println(s + " ");
		}
	}
}
