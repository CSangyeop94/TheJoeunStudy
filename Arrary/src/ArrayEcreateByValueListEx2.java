
public class ArrayEcreateByValueListEx2 {

	public static void main(String[] args) {
		int[] scores;
		// �迭 ����
		scores = new int[] {83, 90, 87};
		// �迭�� ���� �־���
		int sum1 = 0;
		for(int i=0; i<scores.length; i++) {
			sum1 += scores[i];
		}
		System.out.println("���� : " + sum1);
		
		// ���ϵ� ������ sum2�� ����
		int sum2 = add(new int[] {83, 90, 87});
		System.out.println("���� : " + sum2);
		System.out.println();

	}
	public static int add(int[] scores) {
		// �޼ҵ� add ���� scores�� ���� �޾ƿ�
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		return sum;
	}

}
