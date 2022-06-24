
public class ForEx {

	public static void main(String[] args) {
		int sum =0;
		int sum1 = 0;
		int sum2 = 0;
		for(int i =1; i<=100; i++) {
			sum += i;
			
			if(i%3 ==0) {
				sum1 += i;
			}else if (i%4 ==0) {
				sum2 += i;
			}
		}
		System.out.println("1~100까지의 총합 : " +sum);
		System.out.println("1~100까지중 3의 배수의 총합 : " + sum1);
		System.out.println("1~100까지중 4의 배수의 총합 : " + sum2);
		System.out.println("1~100까지중 3or4의 배수의 총합 : " + (sum1+sum2));
	}

}
