import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// hash set
public class SetEx {

	public static void main(String[] args) {
		Set<String> set1 = new HashSet<>();
		boolean flag1 = set1.add("kang");
		boolean flag2 = set1.add("kim");
		boolean flag3 = set1.add("kang");
		
		// add로 값을 3개를 넣어짔만 
		// 중복값은 버려져서 크기는 2가됨
		System.out.println(set1.size());
		
		System.out.println(flag1);
		System.out.println(flag2);
		// 중복 값이기에 false가 나옴
		System.out.println(flag3);
		
		Iterator<String> iter = set1.iterator();
		while(iter.hasNext()) {
			String str = iter.next();
			// set자료구조에 있는 값을 모두 꺼내줌
			System.out.println(str);
			
		}
		
	}

}
