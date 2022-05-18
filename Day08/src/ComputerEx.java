import java.util.Scanner;

public class ComputerEx {

	public static void main(String[] args) {
		Computer com1 = new Computer();
		Scanner sc = new Scanner(System.in);
		int[] values1 = new int[5];
		System.out.print("점수를 입력해주세요 : ");
		
		// 배열 값 입력
		for(int i=0; i<values1.length; i++) {
			System.out.println("values:["+(i+1)+"] 값");
			values1[i] = sc.nextInt();
		}
		int result1 = com1.tot(values1);
		double result2 = com1.avg();
		System.out.println("배열 값 :");
		
		//배열 값 출력
		for (int i =0; i<values1.length; i++) {
			System.out.print(values1[i]+",");
		} 
		System.out.println();
		System.out.println("총점 : " + result1);
		System.out.println("평균 : " + result2);
		// 첫번째 방법
		// int[] values1 = {1,2,3,4,5,6,7,8,9,10};

		// 두번쨰 방법
		// int[] values1 = new int[10];
		// for(int i =0; i<values1.length; i++) {
		// values1[i]=(i+1);
		// }

		// int result1 = com1.sum1(values1);
		// int result2 = com1.sum2(values1);
		// System.out.println("짝수의 합 : " + result1);
		// System.out.println("홀수의 합 : " + result2);

		/*
		 * int[] values1 = {1, 2, 3}; int result1 = myCom.sum1(values1);
		 * System.out.println("result1 : " + result1);
		 * 
		 * int result2 = myCom.sum1(new int[] {1, 2, 3, 4, 5});
		 * System.out.println("result2 : " + result2);
		 * 
		 * int result3 = myCom.sum2(1, 2, 3); System.out.println("result3 : " +
		 * result3);
		 * 
		 * int result4 = myCom.sum2(1, 2, 3, 4, 5); System.out.println("result4 : " +
		 * result4);
		 */
	}

}
