import java.util.Arrays;
import java.util.List;

import jdk.internal.joptsimple.internal.Strings;

public class FilteringEx {

	public static void main(String[] args) {
		List<String> name = Arrays.asList("ȫ�浿 ","ȫ��� ","���� ","ȫ�� ","����ȣ ","ȫ�浿 ");
		System.out.println();
		
		name.stream().distinct() //�ߺ��� �����Ѵ�
		.forEach(x -> System.out.println(x));
		System.out.println();
		
		name.stream() // ���͸�
		.filter(x -> x.startsWith("ȫ"))
		.forEach(x -> System.out.println(x));
		System.out.println();
		
		name.stream()
		.distinct() // �ߺ��� �����ϰ� ���͸� ���ش�.
		.filter(x -> x.startsWith("ȫ"))
		.forEach(x -> System.out.println(x));
		
		
	

	}

}
