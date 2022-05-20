import java.util.Scanner;

public class PersonEx {

		public static void main(String[] args) {
			Person ps = new Person();
			Scanner sc = new Scanner(System.in);
			System.out.println("월급입력 : ");
			
			Person.salary = sc.nextInt();
			
			int tax1 = (int)ps.getTax(); // 세금
			int tax2 = (int)ps.getTax2();
			System.out.println("월급 : " + ps.salary + "원");
			System.out.println("소득세 : "+ tax1 + "원"); // 소득세
			System.out.println("지방세 : " + tax2 + "원"); // 지방세
			System.out.println("총세금 : " + (tax1+tax2) + "원");
			System.out.println("실수령액 : " +(int)(ps.salary - (tax1 + tax2)) + "원" );
		}
}
