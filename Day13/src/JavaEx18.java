

public class JavaEx18 {
	
	public static void main(String[] main) {
		
		// char ch1 = 'C';
		
		// char ch1 = 65; = A
		// char형은 문자열로도 보고 정수형으로도 본다.
		// int num1 = 'C';
		char ch1 = '\u0043';
		System.out.println(ch1);
		char ch2 = "C".charAt(0); //(o)
		
		// ()소괄호 {}중괄호 []대괄호
		// UTF-8 code chart 
		// : https://www.unicode.org/charts/PDF/UAC00.pdf
		
		// 배열
		
		// char []ch;
		//  char [] ch;
		 char ch[];
		// char ch [];
		// ch[] = {'a','b','c'}; (x)
		// char ch[] = {'a','b','c'}; (x)
		ch = new char[]{'j','a','v','a'}; // (o)
		// char ch = new char[4]{'j','a','v','a'}; // (o)
		// char ch[4] = {'j','a','v','a'}; (x)
		
		// 문자열
		String str = new String(ch);
		
		
		System.out.println("str : " + str);
		
		// 문자열의 대임
		String str2 = "java";
		String str3 = "java";
		// System.out.println(str2 == str3);
		// -true
		// 리터럴형테 에서만 true
		// 대소문자 구별함
		
		String str4 = new String("java");
		System.out.println(str == str4);
		
		str.equals(str4);
		System.out.println(str.equals(str4));
		// 값으로만 비교 한다. ||
		System.out.println(str.contentEquals(str4));
		// contentEquals 상속.구현관계에 있으면 자동형변환 가능
		System.out.println(str.compareTo(str4));
		
		
		String str5 = "java1234";
		String str6 = "java";
		System.out.println();
		
	
		
		
		
	}
}
