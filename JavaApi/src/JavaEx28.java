import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class JavaEx28 {
	public static void main(String[] args) {

		String[] strArr = { "���", "�Ŷ��", "���ö�", "�ֵ���", "ġŲ����", "����", "�Ź�", "�����" };

		// List<String> list = Arrays.asList(strArr);
		List<String> list = new ArrayList<>();

		list.addAll(Arrays.asList(strArr));
		
		// ��ü ��� ����
		// list.clear();
		
		// list.add("�Ź�");
		// �Ϻ� ��ҵ� ���� - �ߺ����־ �ߺ� ���� ����
		// list.removeAll(Arrays.asList("�Ź�","���"));
		// ���� ��� ����
		// list.remove("�Ź�");
		// �ߺ� ��Ұ� �־ �Ѱ��� ����
		
		System.out.println("����Ʈ ũ�� : " + list.size());
		
		list.forEach(x -> System.out.print(x + " "));
		
		// ����� ���� ����
		// System.out.println("����� ���� ���� : " + list.contains("�Ź�"));
		// System.out.println("����� ���� ���� : " + list.contains("���"));
		
		System.out.println("���ڿ� ���ϵ� ��� ��ҵ��� ���� ���� :"  
				// �Ѱ��� ������ false�� ����
				+ list.containsAll(Arrays.asList("�Ŷ��","���")));
		
		list.forEach(x->System.out.print(x + " "));
		
		// System.out.println("retain(������) : " 
		// 		+ list.retainAll(Arrays.asList("�Ŷ��","�Ź�")));
		// ���� ���� ��ü ������ ������ ��ҵ�(���� ��ҵ�)�� ���
		// for (String s : list) { // ��ü ����
		// 	System.out.print(s + " ");
			// �Ŷ�� �Ź� ���
		// }
		/////////////////////////////////////////////////////
		
		// list.forEach(x->System.out.print(x + " "));
		
		// ��� ���� ȥ��(����)
		for (int i =0; i<5; i++) {
			Collections.shuffle(list);
			list.forEach(x -> System.out.print(x + " "));
			System.out.println();
		}
		
		
		
		
		
 }
}
