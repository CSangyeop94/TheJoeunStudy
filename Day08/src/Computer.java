
public class Computer {
	int tot;

	int tot(int[] values) {

		for (int i = 0; i < values.length; i++) {
			tot += values[i];
		}
		return tot;
	}

	double avg() {

		double avg = (double) tot/ 5.0;
		return avg;

	}
}

// Â¦¼öÀÇ ÇÕ
/*
 * int sum1(int[] values) { int sum = 0; int sum2=0; int sum3=0; for(int i = 0;
 * i<values.length; i++) { if(values[i]%2==0) { sum += values[i];
 * 
 * }
 * 
 * } return sum; } // È¦¼öÀÇ ÇÕ int sum2(int[] values) { int sum = 0; int sum2=0;
 * int sum3=0; for(int i = 0; i<values.length; i++) { if(values[i]%2 !=0) { sum
 * += values[i];
 * 
 * }
 * 
 * } return sum;
 * 
 */

/*
 * int sum1(int[] values) { int sum = 0; for(int i =0; i<values.length; i++) {
 * sum += values[i]; } return sum; }
 * 
 * int sum2(int ... values) { int sum = 0; for(int i=0; i<values.length; i++) {
 * sum += values[i]; } return sum; }
 */
//}
