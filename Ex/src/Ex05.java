import java.util.Scanner;

public class Ex05 {
	public static void main (String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("�޴� \n" + "1. ��� ���\n"+"2. ���� ó��\n");
		
		int kor; int eng; int mat; 
		String name;
		int num;
		int sum = 0; // ���
		int sum1 = 0; // Ȧ���� ��
		int sum2 = 0; // ¦���� ��
		int sum3 = 0; // 4�� �������
		num = sc.nextInt();
		switch(num) {
		case 1
		: System.out.println("��� ���");
		for(int i=5; i<20; i++) {
			sum += i;
			if (sum % 3 == 0) {
				sum1 += i;
			}else {
				sum2 += i;
			}
			if(sum % 4 == 0) {
				sum3 += i;
			}
		}
		System.out.println("Ȧ���� �� : " + sum1);
		System.out.println("¦���� �� : " + sum2);
		System.out.println("3.4����� �� : " +(sum1+sum3));
		break;
		case 2
		: 
			System.out.println("�̸���?");
		name = sc.next();
		System.out.println("kor ������ �Է����ּ���");
		kor = sc.nextInt();
		System.out.println("eng ������ �Է����ּ���");
		eng = sc.nextInt();
		System.out.println("mat ������ �Է����ּ���");
		mat = sc.nextInt();
		int tot = kor+eng+mat; 
		double avg = tot/3.0;
		System.out.println("�̸� : " + name);
		System.out.println("kor : " + kor);
		System.out.println("eng : " + eng);
		System.out.println("mat : " + mat);
		System.out.println("tot : " + tot);
		System.out.println("avg : " + avg);
		if(avg>=60 && kor>=40 && eng>=40 && mat>=40) {
			System.out.println("�հ��Դϴ�.");
		}else {
			System.out.println("���հ��Դϴ�.");
		}
		break;
		}
		 
		
			
		
	}
}
