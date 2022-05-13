import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
		//Scanner sc = new Scanner(System.in);
		// 배열 생성
		String[] name = new String[3];
		int[] kor = new int[3];
		int[] eng = new int[3];
		int[] tot = new int[3];
		double[] avg = new double[3];
		/*
		 * System.out.println("이름. 점수를 입력해주세요"); // 입력 부분 for(int i=0; i<3; i++) {
		 * System.out.println("이름 : "); name[i] = sc.next();
		 * System.out.println("kor 점수 : "); kor[i] = sc.nextInt();
		 * System.out.println("eng 점수 : "); eng[i] = sc.nextInt(); tot[i] = kor[i] +
		 * eng[i]; System.out.println("총 점수 : " +tot[i]); avg[i] =tot[i]/2;
		 * System.out.println("평균 점수 : "+avg[i]); }
		 * System.out.println("======================================");
		 * System.out.println("이름"+"\t"+"kor"+"\t"+"eng"+"\t"+"tot"+"\t"+"avg");
		 * System.out.println("======================================"); // 출력 부분
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
