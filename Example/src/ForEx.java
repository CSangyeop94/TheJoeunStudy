
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
		System.out.println("1~100������ ���� : " +sum);
		System.out.println("1~100������ 3�� ����� ���� : " + sum1);
		System.out.println("1~100������ 4�� ����� ���� : " + sum2);
		System.out.println("1~100������ 3or4�� ����� ���� : " + (sum1+sum2));
	}

}
