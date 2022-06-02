
public class Forwhile {

	public static void main(String[] args) {
		int sum = 0;
		int sum1 = 0; // 짝수의 합
		int sum2 = 0; // 홀수의 합
		for(int i=1; i<=100; i++) {
			sum += i;
			if(i%2 == 0) {
				sum1 += i;
			}else {
				sum2 += i;
			}
			// 이렇게 해서 값만 출력하면 1~100합 출력됨
		}
		System.out.println("1~100까지의 합 : " + sum);
		System.out.println("짝수 의 합 : " + sum1);
		System.out.println("홀수 까지의 합 : " + sum2);
		
		
	}

}
