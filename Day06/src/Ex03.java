import java.util.Scanner;

public class Ex03 {

	private static int i;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] jumsu=new int[5]; 
		// 입력부분
		for (int i=0;i<jumsu.length;i++ )
		{
			System.out.println("jumsu[" + (i+1) +"] :");
			jumsu[i]=sc.nextInt();
		}
		
		//함수 호출
		int tot = tot(jumsu);
		System.out.println("총점 : " + tot);	
	}
	public static int tot (int[] jumsu) {
		int tot =0;
		for(int i=0; i<5; i++) {
			tot +=jumsu[i];	
		}
		return tot;
	}
}
