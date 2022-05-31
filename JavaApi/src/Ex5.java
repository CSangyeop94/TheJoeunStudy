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
		// Java�� �ߺ��̶� �ϳ��� ��ü�� ����ɰ���
		int size = set.size(); // ����� ��ü �� ���
		System.out.println("set�� ������ : " + set.size());
		
		Iterator<String> it = set.iterator(); // �ݺ��� ����
		while(it.hasNext()) { // it�� ��ü����ŭ �ݺ��Ѵ�
			String element = it.next(); //�Ѱ��� ��ü�� ���´�.
			System.out.println("\t"+element);
		}
		set.remove("JSP"); // �Ѱ��� ��ü ����
		set.remove("phyton"); // �Ѱ��� ��ü ����
		
		System.out.println("�� ��ü�� : " + set.size());
		// ����� ��ü�� ���
		
		it = set.iterator(); // �ݺ��� ���
		
		while(it.hasNext()) { // it�� ��ü����ŭ �ݺ�
			String element = it.next(); //�Ѱ��� ��ü�� ���´�.
			System.out.println("\t"+element);
		}
		
		set.clear(); // ��� ��ü�� �����ϰ� ���ϴ�.
		if(set.isEmpty()) {
			System.out.println("��� �ֽ��ϴ�.");
		}
		
		
		
		
		
		

	}

}
