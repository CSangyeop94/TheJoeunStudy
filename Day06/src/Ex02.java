import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		//Scanner sc = new Scanner(System.in);
		// �迭 ����
		String[] name = new String[3];
		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] tot = new int[3];
		double[] avg = new double[3];
		/*
		 * System.out.println("�̸�. ������ �Է����ּ���"); // �Է� �κ� for(int i=0; i<3; i++) {
		 * System.out.println("�̸� : "); name[i] = sc.next();
		 * System.out.println("kor ���� : "); kor[i] = sc.nextInt();
		 * System.out.println("eng ���� : "); eng[i] = sc.nextInt(); tot[i] = kor[i] +
		 * eng[i]; System.out.println("�� ���� : " +tot[i]); avg[i] =tot[i]/2;
		 * System.out.println("��� ���� : "+avg[i]); }
		 * System.out.println("======================================");
		 * System.out.println("�̸�"+"\t"+"kor"+"\t"+"eng"+"\t"+"tot"+"\t"+"avg");
		 * System.out.println("======================================"); // ��� �κ�
		 * for(int i=0; i<3; i++) {
		 * System.out.println(name[i]+"\t"+kor[i]+"\t"+eng[i]+"\t"+tot[i]+"\t"+avg[i]);
		 * System.out.println("======================================"); }
		 */
		for(int i =0; i<3; i++) {
			
			System.out.println(name[i]);
			System.out.println(kor[i]);
			System.out.println(eng[i]);
			System.out.println(avg[i]);
			
		}
		System.out.println(name.length + "," + kor.length);
		
	}
}
