
public class Forwhile {

	public static void main(String[] args) {
		int sum = 0;
		int sum1 = 0; // ¦���� ��
		int sum2 = 0; // Ȧ���� ��
		for(int i=1; i<=100; i++) {
			sum += i;
			if(i%2 == 0) {
				sum1 += i;
			}else {
				sum2 += i;
			}
			// �̷��� �ؼ� ���� ����ϸ� 1~100�� ��µ�
		}
		System.out.println("1~100������ �� : " + sum);
		System.out.println("¦�� �� �� : " + sum1);
		System.out.println("Ȧ�� ������ �� : " + sum2);
		
		
	}

}
