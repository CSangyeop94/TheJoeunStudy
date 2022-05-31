import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class JavaEx27 {

	public static void main(String[] args) {

		String[] strArr = { "김밥", "컵라면", "도시락", "핫도그", "치킨조각", "우유", "컵밥", "음료수" };

		// List<String> list = Arrays.asList(strArr);
		List<String> list = new ArrayList<>();

		list.addAll(Arrays.asList(strArr));

		// Arrays.asList 통째로 대입 => 요소 추가 / 삭제(x)
		// 주의) java.lang.UnsupportedOperationException
		// list.add("소시지"); (x)
		// 에러가 나옴
		// list.remove(0); (x)

		// list.set(0, "떡볶이");

		// System.out.println(list.get(0));

		list.add("핫바"); // 더하기
		list.add(1, "컵밥"); // 삽입 (추가이긴하지만 중간에 데이터가 들어감)
		// list.remove(0);

		// forEach 메서드 => 인자 => 함수형 인터페이스 => 람다 대수
		// 함수형 인터페이스 : @FunctionalInterface
		// 구현할 추상 메서드가 한 개 존재
		// ex)
		// @FunctionalInterface
		// public interface Runnable
		list.forEach(x -> System.out.print(x + " "));

		System.out.println("\n============================");

		for (String s : list) { // 전체 나열
			System.out.print(s + " ");
		}
		list.forEach(System.out::println);
		// list.forEach(System.out::println);

		System.out.println("\n================");
		
		// 정렬(sort, order)
		// 오름차순(ascending sort) : 코드순(encoding)
		
		// ex) UTF-8, MS-949 ....
		
		// list.sort(Comparator.naturalOrder());
		// 내림차순
		
		list.sort(Comparator.reverseOrder());
		
		// 익명 클래스를 줄이기 위해 람다가 형성
		
		/*
		 * list.sort(new Comparator<String>() {
		 * 
		 * @Override
		 *  public int compare(String o1, String o2) {
		 *   // returno2.compareTo(o1); 내림차순 (asc) 
		 *   return o1.compareTo(o2); // 오름차순 (desc)
		 *    } });
		 */
		
		list.forEach(x->System.out.print(x+ " "));
		
		// 역순(reverse) 나열
				ListIterator<String> lit  = list.listIterator(list.size());
				
				while(lit.hasPrevious()) {
					System.out.println(lit.previous() +  " ");
				}
				System.out.println("=============");
				
				// 일부분 추출 나열
				
				for(String n : list.subList(1, 4)) {
					
					// index 1~3 
					// 주의) 마지막 인자(index)는 제외(exclusive)
					System.out.println(n + " ");
				}
				System.out.println("=============");
				
				// Collection
				Collections.sort(list); // 오름차순 (asc)
				Collections.sort(list, Comparator.reverseOrder());
				
				list.forEach(x -> System.out.print(x + " "));
	}
}
