
public class JavaEx19 {

	public static void main(String[] args) {
		String str = "java developer";
		String str1 = "�ڹ� ������";
		
		byte[] byteArr = str1.getBytes();
		
		for (byte b : byteArr) {
			System.out.println(b + " ");
			System.out.println((char)b + " ");
		}
		// String str1 = "�ڹ� ������"; ���� ��������
		// �ѱ��� �ѱ��ڴ� 2byte��
		// 2byte -> 1byte : �ѱ� �ս�
		// ���� : 'a' = 97 => '\u0061' : 1byte�� ġȯ�Ǿ� �� �ս� ����
		
		
		// ���ڿ� => ������ �迭 ġȯ
		char []chArr = str.toCharArray();
		// �迭�� char�迭�� �ٲٴ� �޼���
		// chArr �迭�� String str = "java developer"; ��������
		
		// String str = "java developer";
		for(char ch : chArr)System.out.print(ch + " ");
		// j a v a   d e v e l o p e r ��� 
		// ���ڿ����� chArr �迭���� ���� ������
		System.out.println();
		
		// charAt (int index) = Ư�� ��ġ�� ���ڸ� ��ȯ��
		// ���ڿ��� ���̸�ŭ ���ư��µ� ���ڿ� Ư����ġ�� ���ڸ� ������� ��ȯ�ϴ�
		//  j a v a   d e v e l o p e r ����Ұ���
		for(int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i)+ " ");
			// j a v a   d e v e l o p e r  ���
		}
		System.out.println();
		System.out.print(str.substring(0, 6) + " ");
		// .substring ���ڿ��� ���� ���鵵 ���ڿ��� ħ
		// (0, 6) = 6�� ���ڿ� ���� ������ �ǹ�
		
		char []  chArr2
		= str.substring(0, 3).toCharArray();
		
		System.out.println();
	
		for (char ch : chArr2) {
			System.out.print((int)ch + " ");
		}
		// ���ڸ� ������ ����ȯ�ؼ� ��� ���� �ƽ�Ű �ڵ� ����
		
	}
}
