
public class ForEx {

	public static void main(String[] args) {
		int max =0; int min = 1000;
		for (int i =1; i<=100; i++) {
			//최대값1
			if(i>=max) {
				max = i;
			}
			if(i<=min) {
				min = i;
				
			}
		}
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}
}

