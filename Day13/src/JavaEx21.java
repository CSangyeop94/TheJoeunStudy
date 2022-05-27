import java.util.Scanner;
import java.util.regex.Pattern;

public class JavaEx21 {
	
	public static void main(String[] args) {
		
		// 전화번호 ex) 010-1234-5678
		// 정규(표현)식 : regular expression (regex)
		// http://rad-software-regular-expression-designer.software.informer.com/download/
		// 정수 : [0-9] or \\d
		
		System.out.println("입력 : ");
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		System.out.println("입력 : " + input);
		String regex = "010-\\d{4}-\\d{4}";
		//  \\d - 숫자(0~9) {}안에 숫자를 넣으면 정확이 몇개라는뜻
		// {4} = 정확하게 4개      {4.} = 최소한 4개
		// {n. m} = n개부터 m개 까지
		boolean flag = Pattern.matches(regex, input);
		
		System.out.println(flag == true ? "유효" : "무효");
		
		sc.close();
	}
}
