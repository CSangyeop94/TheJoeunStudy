import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] jumsu = new int[5];
		System.out.println("������ �Է� ���ּ���");
		int max=0; int min=1000;
		int sum=0;
		for(int i=0; i<5; i++) { 
			// i<=5�� �ϸ� i�� 6���� �޾� ���� �����͹޴� ���̺��� ����� ����
			System.out.println("jumsu [" + (i+1) + "] : �Է�");
			jumsu[i] = sc.nextInt(); //������ �Է�
			sum += jumsu[i];
			
			
			if(jumsu[i]>=max) { 
				//max �� 0�̶� i�� ������ �ԷµǾ����� ���� ū���� ������ ������ ���
				max = jumsu[i];
			}
				
			if(jumsu[i]<=min) {
				// min �� 1000�̶� i�� ������ �ԷµǾ����� 
				// min ���� �������� ������ ������ ��� i 10�Է��� i�� 20�� �Է��ϸ�
				// 10�� �������Ƿ� ���� ��������
				min = jumsu[i];
				
			}
			
		}
		double avg =(double) sum/5;
		System.out.println("������ �� �� :" + sum);
		System.out.println("��� : " + avg);
		System.out.println("������ : " + min);
		System.out.println("�ְ� : " + max);
		
	}
}
