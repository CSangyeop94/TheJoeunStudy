package TJ3;

public class SungjukEx {

	public static void main(String[] args) {
		Sungjuk ss1 = new Sungjuk();
		Sungjuk ss2 = new Sungjuk();
		
		ss1.name = "ȫ�浿";
		ss1.kor = 50; ss1.eng = 60; ss1.mat = 70;
		System.out.println("�̸� : "+ ss1.name);
		System.out.println("kor���� : "+ ss1.kor);
		System.out.println("eng���� : "+ ss1.eng);
		System.out.println("mat���� : "+ ss1.mat);
		
		System.out.println();
		System.out.println("=======================");
		ss2.name = "ȫ���";
		ss2.kor = 80; ss2.eng = 90; ss2.mat = 100;
		System.out.println("�̸� : "+ ss2.name);
		System.out.println("kor���� : "+ ss2.kor);
		System.out.println("eng���� : "+ ss2.eng);
		System.out.println("mat���� : "+ ss2.mat);
		ss2.tot();
		System.out.println("������ : "+ ss2.tot());
		ss2.avg();
		System.out.println("��� ���� : "+ ss2.avg());
	}

}
