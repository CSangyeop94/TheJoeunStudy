package ClassCastException;

import java.math.BigDecimal;

public class JavaEx24 {

	public static void main(String[] args) {

		System.out.println("int �ڷ����� ����Ʈ�� : "+ Integer.BYTES);
		System.out.printf("int�� ���� : %d ~ %d%n",
						 Integer.MIN_VALUE, 
						 Integer.MAX_VALUE);
		System.out.println("int �ڷ����� ��Ʈ(bit)�� : "
					 	+ Integer.SIZE);
		
		// int num = "123" + 1; // (X) 
		// int num = (int)"123" + 1; // (X)
		
		// int num = Integer.parseInt("A") + 1; // (X)
		// ���� �߻�
		// java.lang.NumberFormatException: For input string: "A"
		
		// int num = Integer.parseInt("123") + 1; // (O)
		int num = Integer.valueOf("123") + 1; // (O)
		// Integer(Ŭ����) => int(�⺻ �ڷ���) : auto-unboxing
		
		// int num = new Integer("123") + 1; // (O)
		// �����ڸ� Ȱ���� ����ȯ => since Java 9 : ����õ(deprecated)
		
		System.out.println("num : " + num);
		
		Integer num1 = 1; // int(�⺻ �ڷ���) => Integer(Ŭ����)
		// �⺻ �ڷ��� => Ŭ����(box) : auto-boxing
		// String str = "abcd";
		
		System.out.println("num1 : " + num1);
		
		// ���� ���� ��ȯ
		int num2 = 27;
		System.out.println("2���� ���ڿ� : " + Integer.toBinaryString(num2));
		System.out.println("8���� ���ڿ� : " + Integer.toOctalString(num2));
		System.out.println("16���� ���ڿ� : " + Integer.toHexString(num2));
		
		System.out.println(Integer.parseUnsignedInt("27")); // (O)
		// System.out.println(Integer.parseUnsignedInt("-27")); // (X)
		// ���� �߻�
		// java.lang.NumberFormatException: 
		// Illegal leading minus sign on unsigned string -27.
		
		// ����(negative number) = "-" signed number
		// ���(positive number) = "-" ���� ����(unsigned) number
		
		// �⺻ �ڷ��� long ���� ū/���� ������ ���� ó��
		long longNum = Long.MAX_VALUE; // 9223372036854775807
		long longNum2 = Long.MIN_VALUE; 
		
		System.out.println("longNum : " + (longNum + 1));
		// -9223372036854775808 : ��ü���� ��ȯ
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