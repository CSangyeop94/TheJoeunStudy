

public class JavaEx20 {
	
	public static void main(String[] args) {
		
		String str = "    j a v a    ";
		System.out.println("��"+str+"��");
		System.out.println("��"+str.trim()+"��");
		// .trim() ���ڿ� �յ��� ������ �����Ѵ�.
		
		System.out.println("��"+str.replace(" ", "")+"��");
		// .replace() target �κ��� 
		// replacement �� ��ġ�� ���ο� ���ڿ��� �������ش�.
		// replacement = �ٲ���´�.
		// " " ������ ""���� �ٲ㼭 ������ ������°�
		
		int num1 = 1;
		
		// String str2 = String.valueOf(1);
		
		//String str2 = "" + 1;
		
		// ���ڿ� �ڿ� ���ڸ� �׳� �����ָ� ���ڿ��� �ν���
		// ���ڿ��� �ν� ��Ű�� �������� (�Ұ�ȣ) ���Ἥ ���� ���������� �ٿ��ش�.
		String str2 = 1 + 2 + "3" + 4 + 5;
		// ��� 3 3 4 5 �� ��µ�
		// ���ڿ����� ����̵Ǽ� 3�� �Ǿ����� 3���ʹ� ���ڿ��� �νĵǾ� 345����
		System.out.println(str2);
		
	}
}
