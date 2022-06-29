import java.util.Arrays;

public class ArEx00 {

	public static void main(String[] args) {
		int max = 0;
		int[] array = {1, 5, 3, 8, 2};
		
		//작성 위치
		for(int i=0; i<array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		System.out.println("max : "+max);
		
		
		// 다른 예시 sort 사용시
		// Arrays.sort(배열명); 을 해주면 자동으로 정렬됨
		// 최댓값을 가져올려면 배열 끝 값을 최소면 처음값을 가져오면 됩니다.
		System.out.println("Arrays.sort사용");
		Arrays.sort(array);
		System.out.println("최댓값 : " + array[array.length-1]);
		// -1 을 해주는 이유 배열 길이는 5지만 array[5]는 값이 존재하지않음
		// 배열이 0~ 부터 시작이라 배열 -1을 해주는겁니다.
		System.out.println("최소값 : " + array[0]);
		
		// Stream을 이용한 방법
		System.out.println("Stream을 이용한 방법");
		// Arrays.stream(배열명) 으로 배열 생성
		System.out.println("최댓값 : " + Arrays.stream(array).max().getAsInt());
		System.out.println("최소값 : " + Arrays.stream(array).min().getAsInt());
	}

}
