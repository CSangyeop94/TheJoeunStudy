package Tj;

public class Static1 {
	// �ν��Ͻ� �ʵ�
	int f1;
	void method1(){};
	// ����
	static int f2;
	static void method2(){};
	
	// ���� ���
	static {
		// f1 = 10;
		// methor1(); // ���� �ʵ忡���� �ν��Ͻ� �ʵ带 ������������
			// ����ҷ��� Static1 str1 = new Static(); �۾��ؾ���
		f2 = 10;
		method2(); // ���� �ʵ�� �׳� �������� ����
	}
	// ���� �޼ҵ�
	static void method3() {
		Static1 st1 = new Static1(); // ** ��üȭ
		st1.f1 = 1;
		st1.method1();
		f2 = 10;
		method2();
	}
}
