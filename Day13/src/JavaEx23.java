import java.util.Arrays;

public class JavaEx23 {
	
	public static void main(String[] args) {
		
		int a;
		// String str[] = new String[5];
		String strArr[] = {"java", "python", "�ڹ�", "���̽�",};
		float arr[] = new float[5];
		
		// String �� �ʱⰪ�� null
		
		// Arrays.fill(strArr, "jsp");
		// Arrays.fill �迭�� ���� �ʱ�ȭ ���ش�.
			
		Arrays.sort(strArr, 0, strArr.length-1);
		
		// �������� ����(ascending sort(order))
		for(String s : strArr) {
			System.out.println(s);
		}
		
		
	}
}
