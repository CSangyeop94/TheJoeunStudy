
public class AdvancedForEx {
	public static void main(String[] args) {
		int[] scores = {80, 50, 40, 90, 100};
		
		int sum =0;
		for(int score : scores) {
			sum = sum + score;
			// score-Ÿ�Ժ��� scores-�迭
			// Ÿ�Ժ����� �迭���� �׸��� �����ϸ� �������� �����Ŵ 
			// �ٽ� scores �迭�� �ִ� ������ �����ͼ� ���� 
			// ������ ������ ���� ��� ��������
		}
		System.out.println("���� ���� =" + sum);
		
		double avg = (double) sum / scores.length;
		
		System.out.println("���� ��� =" + avg);
		
	}
}
