
public class ArrayLengthEx {

	public static void main(String[] args) {

		int[] scores = {100, 90, 80};
		
		int sum = 0;
		for(int i=0; i<4; i++) {
			// scores.length 에는 3이란 값이 들어가있음
			sum +=scores[i];
			// i가 0부터 2까지 늘어날테니 위에 변수의 값 3개를
			// 잘불러올수있음
			// 식을 풀어쓰면 scores[0]+scores[1]+scores[2] 이렇게 되는것임
		}
		System.out.println("배열i의 합 : " + sum);
		double avg = sum/scores.length;
		System.out.println("배열의 합의 평균 : " + avg);
	}

	

}
