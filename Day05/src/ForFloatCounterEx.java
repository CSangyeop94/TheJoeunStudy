
public class ForFloatCounterEx {

	public static void main(String[] args) {
		/*
		 * for(float x =0.1f; x<=1.0f; x+=0.1f) { System.out.println(x); }
		 */
		int i;
		for(i=2; i<=9; i++) {
			System.out.println(i + "´Ü");
			for(int j=1; j<=9; j++) {
				System.out.println(i + "´Ü " + i + " * " + j +" = "+(i*j));
			}
		}
	}

}
