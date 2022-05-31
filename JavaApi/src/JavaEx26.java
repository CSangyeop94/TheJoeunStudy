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

		// ���� ���
		// List list = new ArrayList();
		// List<Object> list = new ArrayList<Object>();

		// ���׸� ���
		// List<int> list = new ArrayList(); //(x)
		// List<Integer> list = new ArrayList<Integer>();

		// Integer intArr[] = new Integer[10];
		// int intArr[] = new int[10];

		List<Integer> list = new ArrayList<>(); // (o)
		// List<> list = new ArratList<>(); // (x)
		// List<> list = new ArrayList<Integer>(); // (x)

		// ArrayList<Integer> list = new ArrayList<>();

		// E -> Integer : ���
		// ��� ���� => Integer + ó�� ���� ��ȭ
		// list.add("1"); // (x)
		// list.add((int)'c'); //(o)
		// list.add(new Integer("1")); // (o)
		// list.add(Integer.parseInt("1")); // (0)
		list.add(1); // (0)
		
		// ��ü��� �߰�
		// ���ʸ��� (���ʸ�) : Generics : �ڷ����� ����ȭ
		// ex) T ... a : �����ΰ�(varargs)
		// �ڷ����� ����ȭ�� ���� ���� �ڷḦ ����ϴ��� ��������
		// list.addAll(Arrays.asList(1,2,3,4,5,6,7));
		// list.addAll(Arrays.asList(1,2,3));
		list.addAll(Arrays.asList(new Integer[] {1,2,3}));
		// �迭�� ��ȯ���ٶ� new int (x) new Integer[] (o)
		// int �迭 => Integer �迭 (auto-baxing ������ �ȵ�)
		// ������� int => Integer (auto-baxing ����)
		
		// ���� ��� ��ȸ
		System.out.println("ù��° ��� : " + list.get(0));
		System.out.println("������ ��� : " + list.get(list.size()-1));
		
		System.out.println("===============");
		
		
		// ��ü/��ü ����(��ȸ)
		for(int i =0; i<list.size(); i++) {
			System.out.print(list.get(i) +" ");
			System.out.println();
		}
		
		System.out.println("=============");
		
		for(int n : list) { // Integer�� ��Ȯ�ϰԴ� ������ int�� ȣȯ����
			System.out.println(n + " ");
		}
		
		System.out.println("=============");
		
		// ������
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next() + " ");
		}
		System.out.println("=============");
		
		
		
	}

}
