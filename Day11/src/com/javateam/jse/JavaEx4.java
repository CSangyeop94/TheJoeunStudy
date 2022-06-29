package com.javateam.jse;

import com.javateam.jse.JavaEx3.DemoInterface;

public class JavaEx4 {
	public static void main(String[] args) {
		
		// new JavaEx3() => �͸� ��ü(�ν��Ͻ�)
		// DemoInterface obj = new JavaEx3();
		// obj.order();
		// �͸� ���� ��ü
		// �������̽� ������(x)
		// {...} : Ŭ����
		// DemoInterface => {...����...} : �͸�(����) Ŭ���� (��ü)
		// ��ü�, ��ȸ�� => ����
		// ���� ����
		// UI ���α׷��� ex) �ȵ���̵� ���ø����̼�
		DemoInterface obj2 = new DemoInterface() {
			
			@Override
			public void order() {
				
			}
		};
	}
}
