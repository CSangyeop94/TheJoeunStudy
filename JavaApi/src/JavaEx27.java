import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

public class JavaEx27 {

	public static void main(String[] args) {

		String[] strArr = { "���", "�Ŷ��", "���ö�", "�ֵ���", "ġŲ����", "����", "�Ź�", "�����" };

		// List<String> list = Arrays.asList(strArr);
		List<String> list = new ArrayList<>();

		list.addAll(Arrays.asList(strArr));

		// Arrays.asList ��°�� ���� => ��� �߰� / ����(x)
		// ����) java.lang.UnsupportedOperationException
		// list.add("�ҽ���"); (x)
		// ������ ����
		// list.remove(0); (x)

		// list.set(0, "������");

		// System.out.println(list.get(0));

		list.add("�ֹ�"); // ���ϱ�
		list.add(1, "�Ź�"); // ���� (�߰��̱������� �߰��� �����Ͱ� ��)
		// list.remove(0);

		// forEach �޼��� => ���� => �Լ��� �������̽� => ���� ���
		// �Լ��� �������̽� : @FunctionalInterface
		// ������ �߻� �޼��尡 �� �� ����
		// ex)
		// @FunctionalInterface
		// public interface Runnable
		list.forEach(x -> System.out.print(x + " "));

		System.out.println("\n============================");

		for (String s : list) { // ��ü ����
			System.out.print(s + " ");
		}
		list.forEach(System.out::println);
		// list.forEach(System.out::println);

		System.out.println("\n================");
		
		// ����(sort, order)
		// ��������(ascending sort) : �ڵ��(encoding)
		
		// ex) UTF-8, MS-949 ....
		
		// list.sort(Comparator.naturalOrder());
		// ��������
		
		list.sort(Comparator.reverseOrder());
		
		// �͸� Ŭ������ ���̱� ���� ���ٰ� ����
		
		/*
		 * list.sort(new Comparator<String>() {
		 * 
		 * @Override
		 *  public int compare(String o1, String o2) {
		 *   // returno2.compareTo(o1); �������� (asc) 
		 *   return o1.compareTo(o2); // �������� (desc)
		 *    } });
		 */
		
		list.forEach(x->System.out.print(x+ " "));
		
		// ����(reverse) ����
				ListIterator<String> lit  = list.listIterator(list.size());
				
				while(lit.hasPrevious()) {
					System.out.println(lit.previous() +  " ");
				}
				System.out.println("=============");
				
				// �Ϻκ� ���� ����
				
				for(String n : list.subList(1, 4)) {
					
					// index 1~3 
					// ����) ������ ����(index)�� ����(exclusive)
					System.out.println(n + " ");
				}
				System.out.println("=============");
				
				// Collection
				Collections.sort(list); // �������� (asc)
				Collections.sort(list, Comparator.reverseOrder());
				
				list.forEach(x -> System.out.print(x + " "));
	}
}
