

public class JavaEx18 {
	
	public static void main(String[] main) {
		
		// char ch1 = 'C';
		
		// char ch1 = 65; = A
		// char���� ���ڿ��ε� ���� ���������ε� ����.
		// int num1 = 'C';
		char ch1 = '\u0043';
		System.out.println(ch1);
		char ch2 = "C".charAt(0); //(o)
		
		// ()�Ұ�ȣ {}�߰�ȣ []���ȣ
		// UTF-8 code chart 
		// : https://www.unicode.org/charts/PDF/UAC00.pdf
		
		// �迭
		
		// char []ch;
		//  char [] ch;
		 char ch[];
		// char ch [];
		// ch[] = {'a','b','c'}; (x)
		// char ch[] = {'a','b','c'}; (x)
		ch = new char[]{'j','a','v','a'}; // (o)
		// char ch = new char[4]{'j','a','v','a'}; // (o)
		// char ch[4] = {'j','a','v','a'}; (x)
		
		// ���ڿ�
		String str = new String(ch);
		
		
		System.out.println("str : " + str);
		
		// ���ڿ��� ����
		String str2 = "java";
		String str3 = "java";
		// System.out.println(str2 == str3);
		// -true
		// ���ͷ����� ������ true
		// ��ҹ��� ������
		
		String str4 = new String("java");
		System.out.println(str == str4);
		
		str.equals(str4);
		System.out.println(str.equals(str4));
		// �����θ� �� �Ѵ�. ||
		System.out.println(str.contentEquals(str4));
		// contentEquals ���.�������迡 ������ �ڵ�����ȯ ����
		System.out.println(str.compareTo(str4));
		
		
		String str5 = "java1234";
		String str6 = "java";
		System.out.println();
		
	
		
		
		
	}
}
