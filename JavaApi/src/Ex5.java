import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex5 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("Spring");
		set.add("JSP");
		set.add("Java");
		set.add("phyton");
		// Java는 중복이라 하나의 객체만 저장될것임
		int size = set.size(); // 저장된 객체 수 얻기
		System.out.println("set의 사이즈 : " + set.size());
		
		Iterator<String> it = set.iterator(); // 반복자 생성
		while(it.hasNext()) { // it의 객체수만큼 반복한다
			String element = it.next(); //한개의 객체만 들고온다.
			System.out.println("\t"+element);
		}
		set.remove("JSP"); // 한개의 객체 삭제
		set.remove("phyton"); // 한개의 객체 삭제
		
		System.out.println("총 객체수 : " + set.size());
		// 저장된 객체수 얻기
		
		it = set.iterator(); // 반복자 얻기
		
		while(it.hasNext()) { // it의 객체수만큼 반복
			String element = it.next(); //한개의 객체만 들고온다.
			System.out.println("\t"+element);
		}
		
		set.clear(); // 모든 객체를 제거하고 비웁니다.
		if(set.isEmpty()) {
			System.out.println("비어 있습니다.");
		}
		
		
		
		
		
		

	}

}
