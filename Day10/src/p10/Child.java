package p10;

public class Child extends Parent {
	// �ʵ�
	int mat;

	// ������
	Child(int kor, int eng, int mat) {
		super(kor, eng);
		this.mat = mat;

	}

	// �޼ҵ�
	public void avg() { // �������̵�
		double avg = (kor + eng + mat) / 3.0;
		System.out.println("�ڽ� ��� : " + avg);
	}

	public void tot2() {
		int tot = kor + eng + mat;
		System.out.println("�ڽ� ���� : " + tot);
	}

}
/*
 * String name = "ȫ���"; int eng = 100;
 * 
 * public void method3() { System.out.println("�ڽ� method3"); } public void
 * method1() { System.out.println("�ڽ� method1"); }
 */