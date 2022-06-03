import java.util.stream.IntStream;

public class FromIntERangeEx {
	public static int sum;
	
	public static void main(String[] args) {
		// 1~100까지의 합구하기
		IntStream stream = IntStream.rangeClosed(1, 100);
		stream.forEach(a -> sum += a);
		System.out.println("총합 : " + sum);
		
		// 총합 : 5050 출력
	}
}
