import java.util.Arrays;

public class ArEx00 {

	public static void main(String[] args) {
		int max = 0;
		int[] array = {1, 5, 3, 8, 2};
		
		//�ۼ� ��ġ
		for(int i=0; i<array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("max : "+max);
		
		
		// �ٸ� ���� sort ����
		// Arrays.sort(�迭��); �� ���ָ� �ڵ����� ���ĵ�
		// �ִ��� �����÷��� �迭 �� ���� �ּҸ� ó������ �������� �˴ϴ�.
		System.out.println("Arrays.sort���");
		Arrays.sort(array);
		System.out.println("�ִ� : " + array[array.length-1]);
		// -1 �� ���ִ� ���� �迭 ���̴� 5���� array[5]�� ���� ������������
		// �迭�� 0~ ���� �����̶� �迭 -1�� ���ִ°̴ϴ�.
		System.out.println("�ּҰ� : " + array[0]);
		
		// Stream�� �̿��� ���
		System.out.println("Stream�� �̿��� ���");
		// Arrays.stream(�迭��) ���� �迭 ����
		System.out.println("�ִ� : " + Arrays.stream(array).max().getAsInt());
		System.out.println("�ּҰ� : " + Arrays.stream(array).min().getAsInt());
	}

}
