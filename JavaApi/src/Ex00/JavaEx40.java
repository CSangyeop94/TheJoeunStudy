package Ex00;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class JavaEx40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		String [] arr = {"����","����","�糪","ä��",
				"��ȿ","����","���","����","�̳�"};
		list.addAll(Arrays.asList(arr));
		// ����Ʈȭ

		list.stream().filter(t -> t.contains("��")) // "��"���� ������
		.sorted(Comparator.reverseOrder()) // ����Ʈ���� �������� ������
		.limit(2) // 2�� ������
		//.forEach(x -> System.out.println(x + " "));
		.forEach(System.out::println);
		// ��û ������ ���� ���� �޶�������
		
	}

}
