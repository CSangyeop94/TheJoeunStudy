import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		int[] scores = new int[2];
		System.out.println(scores[0]);
		System.out.println(scores[1]);
		scores[0] = 80;
		scores[1] = 60;
		Scanner sc = new Scanner(System.in);
		
		// int sum = scores[0] + scores[1];
		int sum=0;
		for(int i=0; i<2; i++) {
			System.out.println("scores [" + (i+1) + "] : ют╥б");
			scores[i] = sc.nextInt();
			sum +=scores[i];
		}
		System.out.println(sum);
		System.out.println(scores[0]);
		System.out.println(scores[1]);
	}
	
}
