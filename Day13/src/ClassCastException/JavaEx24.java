package ClassCastException;

import java.math.BigDecimal;

public class JavaEx24 {

	public static void main(String[] args) {

		System.out.println("int 자료형의 바이트수 : "+ Integer.BYTES);
		System.out.printf("int의 범위 : %d ~ %d%n",
						 Integer.MIN_VALUE, 
						 Integer.MAX_VALUE);
		System.out.println("int 자료형의 비트(bit)수 : "
					 	+ Integer.SIZE);
		
		// int num = "123" + 1; // (X) 
		// int num = (int)"123" + 1; // (X)
		
		// int num = Integer.parseInt("A") + 1; // (X)
		// 예외 발생
		// java.lang.NumberFormatException: For input string: "A"
		
		// int num = Integer.parseInt("123") + 1; // (O)
		int num = Integer.valueOf("123") + 1; // (O)
		// Integer(클래스) => int(기본 자료형) : auto-unboxing
		
		// int num = new Integer("123") + 1; // (O)
		// 생성자를 활용한 형변환 => since Java 9 : 비추천(deprecated)
		
		System.out.println("num : " + num);
		
		Integer num1 = 1; // int(기본 자료형) => Integer(클래스)
		// 기본 자료형 => 클래스(box) : auto-boxing
		// String str = "abcd";
		
		System.out.println("num1 : " + num1);
		
		// 정수 진법 변환
		int num2 = 27;
		System.out.println("2진수 문자열 : " + Integer.toBinaryString(num2));
		System.out.println("8진수 문자열 : " + Integer.toOctalString(num2));
		System.out.println("16진수 문자열 : " + Integer.toHexString(num2));
		
		System.out.println(Integer.parseUnsignedInt("27")); // (O)
		// System.out.println(Integer.parseUnsignedInt("-27")); // (X)
		// 예외 발생
		// java.lang.NumberFormatException: 
		// Illegal leading minus sign on unsigned string -27.
		
		// 음수(negative number) = "-" signed number
		// 양수(positive number) = "-" 붙지 않음(unsigned) number
		
		// 기본 자료형 long 보다 큰/작은 범위의 정수 처리
		long longNum = Long.MAX_VALUE; // 9223372036854775807
		long longNum2 = Long.MIN_VALUE; 
		
		System.out.println("longNum : " + (longNum + 1));
		// -9223372036854775808 : 수체계의 순환
		// Long.MIN_VALUE
		
		System.out.println("longNum2 : " + longNum2);
		// -9223372036854775808
		//  9223372036854775807
		
		BigDecimal bigNum = new BigDecimal(longNum);
		BigDecimal result = bigNum.add(new BigDecimal(1));
		
		System.out.println("result : " + result);
		// 9223372036854775807 + 1 
		// = 9223372036854775808
		//   9223372036854775808
		
	}

}