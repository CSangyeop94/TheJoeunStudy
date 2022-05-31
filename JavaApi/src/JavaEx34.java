import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class JavaEx34 {
	
	public static void main(String[] args) {
		
		// ����(index) (x)
		// element �ߺ��� ������� ����
		Set<String> set = new HashSet<>();
		// HashSet�� ������ ������ x
		
		set.add("Java");
		set.add("Java");
		set.add("c#");
		set.add("JSP");
		set.add("python");
		
		System.out.println("set�� ũ�� : " + set.size());
		// 4 ���
		
		List<String> list = new ArrayList<>();
		list.addAll(set);
		System.out.println(list);
		// [c#, Java, python, JSP] ��� ����� �˼��ִ°� ������ ���� x 


		
		System.out.println();
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()) {
			System.out.print(it.next() + " ");
		}
		System.out.println();
		
		
		set.forEach(x -> System.out.print(x + " "));
		// set.forEach(x -> System.out::println);
		System.out.println();
		// ������ ��� ���� ���
		
		// ��� ���� ����
		// System.out.println("��� ���� ���� : " + set.containsAll(Arrays.asList("Java", "Servlet")));
		// ��Ұ� �ִٸ� true ��ȯ ������ false ��ȯ
		
		
		
		set.forEach(x -> System.out.print(x + " "));
		// c# python JSP ��� �ߺ���ü�� ����� �����ʾƼ� Java�� 2���� �־ ���̾���
		
		// set.remove("Java");
		// System.out.println(set.removeAll(Arrays.asList()));
		
		// set.clear();
		System.out.println();
		// for (String s : list) {
		// 	System.out.print(s + " ");
		// }
		// ������ ���� ��Ҹ� ����
		// set.retainAll(Arrays.asList("Java","ptyhon","c#"));
		// set.forEach(x -> System.out.print(x + " "));
		
		// �迭�� ġȯ
		String [] strArr = new String[set.size()];
		strArr = set.toArray(strArr);
		
		System.out.println("ù��° ��� : " + strArr[0]);
		
		
	}
}
