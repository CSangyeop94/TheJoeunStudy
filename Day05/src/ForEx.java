
public class ForEx {

	public static void main(String[] args) {
		int max =0; int min = 1000;
		for (int i =1; i<=100; i++) {
			//�ִ밪1
			if(i>=max) {
				max = i;
			}
			if(i<=min) {
				min = i;
				
			}
		}
		System.out.println("�ִ밪 : " + max);
		System.out.println("�ּҰ� : " + min);
	}
}

