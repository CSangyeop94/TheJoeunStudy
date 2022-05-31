import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class JavaEx34 {
	
	public static void main(String[] args) {
		
		// 순서(index) (x)
		// element 중복을 허용하지 않음
		Set<String> set = new HashSet<>();
		// HashSet은 순서의 개념이 x
		
		set.add("Java");
		set.add("Java");
		set.add("c#");
		set.add("JSP");
		set.add("python");
		
		System.out.println("set의 크기 : " + set.size());
		// 4 출력
		
		List<String> list = new ArrayList<>();
		list.addAll(set);
		System.out.println(list);
		// [c#, Java, python, JSP] 출력 결과로 알수있는것 순서의 개념 x 


		
		System.out.println();
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
		
		
		set.forEach(x -> System.out.print(x + " "));
		// set.forEach(x -> System.out::println);
		System.out.println();
		// 위에와 모두 같은 방식
		
		// 요소 포함 여부
		// System.out.println("요소 포함 여부 : " + set.containsAll(Arrays.asList("Java", "Servlet")));
		// 요소가 있다면 true 반환 없으면 false 반환
		
		
		
		set.forEach(x -> System.out.print(x + " "));
		// c# python JSP 출력 중복자체가 허용이 되지않아서 Java를 2개를 넣어도 차이없음
		
		// set.remove("Java");
		// System.out.println(set.removeAll(Arrays.asList()));
		
		// set.clear();
		System.out.println();
		// for (String s : list) {
		// 	System.out.print(s + " ");
		// }
		// 교집합 공통 요소만 남김
		// set.retainAll(Arrays.asList("Java","ptyhon","c#"));
		// set.forEach(x -> System.out.print(x + " "));
		
		// 배열로 치환
		String [] strArr = new String[set.size()];
		strArr = set.toArray(strArr);
		
		System.out.println("첫번째 요소 : " + strArr[0]);
		
		
	}
}
