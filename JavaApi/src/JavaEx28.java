import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JavaEx28 {
	public static void main(String[] args) {

		String[] strArr = { "김밥", "컵라면", "도시락", "핫도그", "치킨조각", "우유", "컵밥", "음료수" };

		// List<String> list = Arrays.asList(strArr);
		List<String> list = new ArrayList<>();

		list.addAll(Arrays.asList(strArr));
		
		// 전체 요소 삭제
		// list.clear();
		
		// list.add("컵밥");
		// 일부 요소들 삭제 - 중복이있어도 중복 전부 삭제
		// list.removeAll(Arrays.asList("컵밥","김밥"));
		// 개별 요소 삭제
		// list.remove("컵밥");
		// 중복 요소가 있어도 한개만 삭제
		
		System.out.println("리스트 크기 : " + list.size());
		
		list.forEach(x -> System.out.print(x + " "));
		
		// 요소의 포함 여부
		// System.out.println("요소의 포함 여부 : " + list.contains("컵밥"));
		// System.out.println("요소의 포함 여부 : " + list.contains("백반"));
		
		System.out.println("인자에 수록된 모든 요소들의 포함 여부 :"  
				// 한개라도 빠지면 false가 나옴
				+ list.containsAll(Arrays.asList("컵라면","김밥")));
		
		list.forEach(x->System.out.print(x + " "));
		
		// System.out.println("retain(교집합) : " 
		// 		+ list.retainAll(Arrays.asList("컵라면","컵밥")));
		// 적용 이후 전체 나열시 교집합 요소들(공통 요소들)만 출력
		// for (String s : list) { // 전체 나열
		// 	System.out.print(s + " ");
			// 컵라면 컵밥 출력
		// }
		/////////////////////////////////////////////////////
		
		// list.forEach(x->System.out.print(x + " "));
		
		// 요소 임의 혼합(섞음)
		for (int i =0; i<5; i++) {
			Collections.shuffle(list);
			list.forEach(x -> System.out.print(x + " "));
			System.out.println();
		}
		
		
		
		
		
 }
}
