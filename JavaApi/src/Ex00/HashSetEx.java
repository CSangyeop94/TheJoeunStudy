package Ex00;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("홍길동",15));
		set.add(new Member("홍길동",15));
		// 인스턴스는 다르지만 내부 데이터가 동일하여 한가지만 등록될것임
		
		System.out.println("총 객체수 : " + set.size());
	}

}
