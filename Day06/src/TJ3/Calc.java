package TJ3;

import java.util.Scanner;

public class Calc {
	
	// �ʵ� ����
	String name;
	int kor1; int eng1;
	static double PI = 3.141592;
	// static �� Ŭ������ �ٷ� ȣ�Ⱑ��
	public void ptint() {
		System.out.println("����Ʈ");
	}
	public void name(String name) {
		 
		this.name = name;
		
		System.out.println(this.name);
	}
	public int tot(int kor, int eng) {
		/*
		 * Student s1 = new Student(); s1.print(); this.ptint(); // ����2���� ���� int tot =
		 * kor + eng; double PI = Calc.PI;
		 */
		String name2 = "ȫ�浿2"; // name2�� ������ ���̾���
		this.name(name2);
		
		//Calc.name(name); // Ŭ������ ȣ��
		this.name(name); // �ν��Ͻ��� ȣ��
		this.kor1 = kor;
		this.eng1 = eng; // �� ��ü�� �޼ҵ��°��� ����
		return this.kor1 + this.eng1;
	}
	// ���� Ŭ���� �׿��� �����Ë��� this. ��밡��
}
