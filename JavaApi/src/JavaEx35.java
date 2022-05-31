import java.util.Arrays;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class JavaEx35 {
	public static void main(String[] args) {
		// Set<String> set = new TreeSet<>();
		// SortedSet<String> set = new TreeSet<>();
	    NavigableSet<String> set = new TreeSet<>();
		set.addAll(Arrays.asList(new String[] {"Java","ptyhon","JSP","C#","C++"}));
		
		// 첫 요소 조회
		System.out.println(set.first());
		// 대문자가 운선순위로 나요며 ABCD~순중에 빠른것이 운선순번
		
		// 끝 요소
		System.out.println(set.last());
		
		System.out.println("\n===================");
		
		// 전체 요소 나열 : 기본적으로 오름차순 정렬(asc sort)
		set.forEach(x->System.out.print(x + " "));
		System.out.println("\n===================");
		
		// 내림 차순 정렬 : (dasc sort)
		set.descendingSet().forEach(x->System.out.print(x + " "));
		System.out.println("\n===================");
		
		Iterator<String> it = set.descendingIterator();
		while(it.hasNext()) { // 요소가 있으면 true가 반환되어 모든 요소가 나올때 까지 작동
			System.out.print(it.next() + " ");
			// 요소를 한개 가져옴
		}
		System.out.println("\n===================");
		// set.subSet("JSP", "python");
		// set.subSet("JSP", "python").forEach(x -> System.out.print(x + " "));
		
		
		set.tailSet("Java", false).forEach(x -> System.out.print(x + " "));
		
	}
}
