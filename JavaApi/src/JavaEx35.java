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
		
		// ù ��� ��ȸ
		System.out.println(set.first());
		// �빮�ڰ� ������� ����� ABCD~���߿� �������� �����
		
		// �� ���
		System.out.println(set.last());
		
		System.out.println("\n===================");
		
		// ��ü ��� ���� : �⺻������ �������� ����(asc sort)
		set.forEach(x->System.out.print(x + " "));
		System.out.println("\n===================");
		
		// ���� ���� ���� : (dasc sort)
		set.descendingSet().forEach(x->System.out.print(x + " "));
		System.out.println("\n===================");
		
		Iterator<String> it = set.descendingIterator();
		while(it.hasNext()) { // ��Ұ� ������ true�� ��ȯ�Ǿ� ��� ��Ұ� ���ö� ���� �۵�
			System.out.print(it.next() + " ");
			// ��Ҹ� �Ѱ� ������
		}
		System.out.println("\n===================");
		// set.subSet("JSP", "python");
		// set.subSet("JSP", "python").forEach(x -> System.out.print(x + " "));
		
		
		set.tailSet("Java", false).forEach(x -> System.out.print(x + " "));
		
	}
}
