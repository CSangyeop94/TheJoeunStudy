
public class ArrayCreateByValueListEx {

		public static void main(String[] atgs) {
			int[] scores;
			//�迭 ������ �̸� ������ �� �� ��ϵ��� ���߿� �����ǳ� ���� ��� ������ ���� new �������� 
			//�ÿ��ؼ� �� ����� �������ָ� �ȴ�. new ������ �ٷ� �ڿ��� �迭 ���� ���𿡼� ����� ��Ÿ��[ 
			//]" �� �ٿ��ְ� �߰�ȣ {} ���� ������ ����
			scores = new int[] {83, 90, 87};
			int sum1 =0;
			for(int i=0; i<3; i++) {
				sum1 += scores[i];
			}
			System.out.println("���� : " + sum1);
			
			int sum2 =add(new int[] {83, 90, 87});
			System.out.println("���� : " + sum2);
			
		}
		public static int add(int[] scores) {
			int sum =0; //������ ����ϴ� �޼ҵ����
			for(int i=0; i<3; i++) {
				sum += scores[i];
			}
			return sum;
		}
}
