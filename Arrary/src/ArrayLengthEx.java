
public class ArrayLengthEx {

	public static void main(String[] args) {

		int[] scores = {100, 90, 80};
		
		int sum = 0;
		for(int i=0; i<4; i++) {
			// scores.length ���� 3�̶� ���� ������
			sum +=scores[i];
			// i�� 0���� 2���� �þ�״� ���� ������ �� 3����
			// �ߺҷ��ü�����
			// ���� Ǯ��� scores[0]+scores[1]+scores[2] �̷��� �Ǵ°���
		}
		System.out.println("�迭i�� �� : " + sum);
		double avg = sum/scores.length;
		System.out.println("�迭�� ���� ��� : " + avg);
	}

	

}
