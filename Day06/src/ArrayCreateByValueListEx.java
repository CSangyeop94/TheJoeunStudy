
public class ArrayCreateByValueListEx {

		public static void main(String[] atgs) {
			int[] scores;
			//배열 변수를 미리 선언한 후 값 목록들이 니중에 결정되논 상행 라면 다음과 같이 new 연산지를 
			//시용해서 값 목록을 지정해주면 된다. new 연산자 바로 뒤에는 배열 변수 선언에서 사용한 “타입[ 
			//]" 를 붙여주고 중괄호 {} 에는 값들을 나열
			scores = new int[] {83, 90, 87};
			int sum1 =0;
			for(int i=0; i<3; i++) {
				sum1 += scores[i];
			}
			System.out.println("총합 : " + sum1);
			
			int sum2 =add(new int[] {83, 90, 87});
			System.out.println("총합 : " + sum2);
			
		}
		public static int add(int[] scores) {
			int sum =0; //총합을 계산하는 메소드생성
			for(int i=0; i<3; i++) {
				sum += scores[i];
			}
			return sum;
		}
}
