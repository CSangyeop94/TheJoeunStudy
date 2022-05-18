import java.util.Scanner;

public class CalculatorEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("name : ");
		Calculator.name = sc.next();
		System.out.println("kor : ");
		Calculator.kor = sc.nextInt();
		System.out.println("eng : ");
		Calculator.eng = sc.nextInt();
		System.out.println("mat : ");
		Calculator.mat = sc.nextInt();
		
		
		int tot = Calculator.tot();		
		double avg = Calculator.avg();
		String grade = Calculator.grade();
		System.out.println("¿Ã∏ß :" + Calculator.name + "\n√—¡° :" + tot + "\n∆Ú±’ :" + avg);
		System.out.println("«’∞›ø©∫Œ :" + grade);
		
	}
}
/*
 * double result1 = 10 * 10 * Calculator.pi;
 * 
 * int result2 = Calculator.plus(10, 5);
 * 
 * int result3 = Calculator.minus(10, 5);
 * 
 * System.out.println("result1 : " + result1); System.out.println("result2 : " +
 * result2); System.out.println("result3 : " + result3); }
 */