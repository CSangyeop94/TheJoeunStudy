
public class AdvancedForEx {
	public static void main(String[] args) {
		int[] scores = {80, 50, 40, 90, 100};
		
		int sum =0;
		for(int score : scores) {
			sum = sum + score;
			// score-타입변수 scores-배열
			// 타입변수가 배열에서 항목이 존재하면 가져오고 실행시킴 
			// 다시 scores 배열의 있는 변수를 가져와서 실행 
			// 가져올 변수가 없을 경우 실행종료
		}
		System.out.println("점수 총합 =" + sum);
		
		double avg = (double) sum / scores.length;
		
		System.out.println("점수 평균 =" + avg);
		
	}
}
