package Ex00;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("ȫ�浿",15));
		set.add(new Member("ȫ�浿",15));
		// �ν��Ͻ��� �ٸ����� ���� �����Ͱ� �����Ͽ� �Ѱ����� ��ϵɰ���
		
		System.out.println("�� ��ü�� : " + set.size());
	}

}
