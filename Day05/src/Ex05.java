import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] jumsu = new int[5];
		System.out.println("점수를 입력 해주세요");
		int max=0; int min=1000;
		int sum=0;
		for(int i=0; i<5; i++) { 
			// i<=5를 하면 i를 6개를 받아 원래 데이터받는 길이보다 길어져 에러
			System.out.println("jumsu [" + (i+1) + "] : 입력");
			jumsu[i] = sc.nextInt(); //데이터 입력
			sum += jumsu[i];
			
			
			if(jumsu[i]>=max) { 
				//max 가 0이라 i에 점수가 입력되었을떄 재일 큰수가 조건을 만족해 출력
				max = jumsu[i];
			}
				
			if(jumsu[i]<=min) {
				// min 가 1000이라 i에 점수가 입력되었을떄 
				// min 보다 작은수가 조건을 만족해 출력 i 10입력후 i에 20을 입력하면
				// 10이 더작으므로 값에 변동없음
				min = jumsu[i];
				
			}
			
		}
		double avg =(double) sum/5;
		System.out.println("점수의 총 합 :" + sum);
		System.out.println("평균 : " + avg);
		System.out.println("최저값 : " + min);
		System.out.println("최고값 : " + max);
		
	}
}
