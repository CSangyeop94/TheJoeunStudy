
public class ArrayEcreateByValueListEx2 {

	public static void main(String[] args) {
		int[] scores;
		// 배열 생성
		scores = new int[] {83, 90, 87};
		// 배열에 값을 넣어줌
		int sum1 = 0;
		for(int i=0; i<scores.length; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합 : " + sum1);
		
		// 리턴된 총합을 sum2에 저장
		int sum2 = add(new int[] {83, 90, 87});
		System.out.println("총합 : " + sum2);
		System.out.println();

	}
	public static int add(int[] scores) {
		// 메소드 add 생성 scores의 값을 받아옴
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}
		return sum;
	}

}
