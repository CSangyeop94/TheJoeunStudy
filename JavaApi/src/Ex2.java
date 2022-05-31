import java.util.Arrays;
import java.util.List;

public class Ex2 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("홍길동","홍길순","홍당무");
		// 3개의 String객체를 가지는 list 생성
		
		for(String name : list) {
			// 향상된 푸문을 이용하여 list 를 출력하게함
			System.out.println(name);
			// 홍길동 홍길순 홍당무 출력됨
		}
		
		List<Integer> list1 = Arrays.asList(1, 2 ,3);
		// 3개의 Integer객체를 가지는 list 생성
		for(int value : list1) {
			System.out.println(value);
			// 1,2,3 출력됩니다.
		}

	}

}
