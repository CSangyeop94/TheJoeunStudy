package com.javateam.jse;
import com.javateam.jse.Child;
import com.javateam.jse.Parent;

public class JavaEx5 {
	
	public static void main(String[] args) {
		
		int num1 = 1;
		long num2 = num1; // �ڵ� ����ȯ
		
		// num1 = num2 // ������ž���� ū�� ���������� ��������
		   num1 = (int) num2; // ���� ����ȯ�� �������
		   System.out.println("num1 : " + num1);
		   
		   // Parent p = new Parent(); - ������ �����Ѵ�
		   Parent p = new Child(); // ����ȯ ����
		   Child c = new Child();
		   
		   p = c; // �ڵ� ����ȯ
		   // �ڳ� Ŭ���� -> �θ� Ŭ���� �ڵ� ����ȯ
		   
		   c = (Child)p; // 
		   // c = p; // (x)
		   // ����(sub) => ū(super) : promotion
		   // ū(super) => ����(sub) : casting
		   // ���� ����ȯ(casting) : promotion + casting
		   // ����ȯ(casting) ����(����)
		   
		   //������ (o) => ����� ����
	}
}




