package p10;

public class Parent {
	// �ʵ� ����
	int kor; int eng;
	
	//������
	Parent(int kor, int eng) {
		this.kor = kor;
		this.eng = eng;
	}
	//�޼ҵ�
	public void tot() {
		int tot = kor + eng;
		System.out.println("�θ� ���� : " + tot);
		
	}
	public void avg() {
		double avg = (kor + eng)/3.0;
		System.out.println("�θ� ��� : " + avg);
		
	}
	
}/*
	 * String name = "ȫ�浿"; int kor = 100;
	 * 
	 * public void method1() { System.out.println("�θ� method1"); }
	 * 
	 * public void method2 () { System.out.println("�θ� method2"); }
	 */