import java.util.Scanner;

public class ComputerEx {

	public static void main(String[] args) {
		Computer com1 = new Computer();
		Scanner sc = new Scanner(System.in);
		int[] values1 = new int[5];
		System.out.print("������ �Է����ּ��� : ");
		
		// �迭 �� �Է�
		for(int i=0; i<values1.length; i++) {
			System.out.println("values:["+(i+1)+"] ��");
			values1[i] = sc.nextInt();
		}
		int result1 = com1.tot(values1);
		double result2 = com1.avg();
		System.out.println("�迭 �� :");
		
		//�迭 �� ���
		for (int i =0; i<values1.length; i++) {
			System.out.print(values1[i]+",");
		} 
		System.out.println();
		System.out.println("���� : " + result1);
		System.out.println("��� : " + result2);
		// ù��° ���
		// int[] values1 = {1,2,3,4,5,6,7,8,9,10};

		// �ι��� ���
		// int[] values1 = new int[10];
		// for(int i =0; i<values1.length; i++) {
		// values1[i]=(i+1);
		// }

		// int result1 = com1.sum1(values1);
		// int result2 = com1.sum2(values1);
		// System.out.println("¦���� �� : " + result1);
		// System.out.println("Ȧ���� �� : " + result2);

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
