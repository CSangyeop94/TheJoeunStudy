import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class JavaEx26 {

	public static void main(String[] args) {

		// 옛날 방식
		// List list = new ArrayList();
		// List<Object> list = new ArrayList<Object>();

		// 제네릭 방식
		// List<int> list = new ArrayList(); //(x)
		// List<Integer> list = new ArrayList<Integer>();

		// Integer intArr[] = new Integer[10];
		// int intArr[] = new int[10];

		List<Integer> list = new ArrayList<>(); // (o)
		// List<> list = new ArratList<>(); // (x)
		// List<> list = new ArrayList<Integer>(); // (x)

		// ArrayList<Integer> list = new ArrayList<>();

		// E -> Integer : 요소
		// 요소 제한 => Integer + 처리 성능 강화
		// list.add("1"); // (x)
		// list.add((int)'c'); //(o)
		// list.add(new Integer("1")); // (o)
		// list.add(Integer.parseInt("1")); // (0)
		list.add(1); // (0)
		
		// 집체요소 추가
		// 제너릭스 (제너릭) : Generics : 자료형의 인자화
		// ex) T ... a : 가변인가(varargs)
		// 자료형의 인자화를 통해 무슨 자료를 사용하는지 가르쳐줌
		// list.addAll(Arrays.asList(1,2,3,4,5,6,7));
		// list.addAll(Arrays.asList(1,2,3));
		list.addAll(Arrays.asList(new Integer[] {1,2,3}));
		// 배열로 변환해줄때 new int (x) new Integer[] (o)
		// int 배열 => Integer 배열 (auto-baxing 정용이 안됨)
		// 개별요소 int => Integer (auto-baxing 적용)
		
		// 개별 요소 조회
		System.out.println("첫뻔째 요소 : " + list.get(0));
		System.out.println("마지막 요소 : " + list.get(list.size()-1));
		
		System.out.println("===============");
		
		
		// 전체/집체 나열(조회)
		for(int i =0; i<list.size(); i++) {
			System.out.print(list.get(i) +" ");
			System.out.println();
		}
		
		System.out.println("=============");
		
		for(int n : list) { // Integer이 정확하게는 맞지만 int도 호환해줌
			System.out.println(n + " ");
		}
		
		System.out.println("=============");
		
		// 정방향
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next() + " ");
		}
		System.out.println("=============");
		
		
		
	}

}
