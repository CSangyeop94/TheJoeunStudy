package ClassCastException;

public class JavaEx25 {
	public static void main(String[] args) {

		// float result = 251 /3; // 83
		float result = (float) 251 / 3F; // 83.666664

		System.out.println("result : " + result);

		// �ݿø�(round) �Ҽ��� ���ڸ� = 10�� 1��
		float roundResult = (float) Math.round(result * 10) / 10;
		// *10 /10 �� �ϴ������� �Ҽ��� ���� �ݿø��ϰ�;.
		// ���� ���� 84�� ������ �Ȼ��� 83.7�̳���
		System.out.println("result : " + roundResult);

		// �ݿø�(round) �Ҽ��� ���ڸ� = 10�� 2��
		float roundResult2 = (float) Math.round(result * 100) / 100;
		System.out.println("result : " + roundResult2);
		// result : 83.67

		// �ݿø�(round) �Ҽ��� ���ڸ� = 10�� 3��
		float roundResult3 = (float) Math.round(result * 1000) / 1000;
		System.out.println("result : " + roundResult3);
		// result : 83.667
	}
}
