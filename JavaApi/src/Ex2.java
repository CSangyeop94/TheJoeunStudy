import java.util.Arrays;
import java.util.List;

public class Ex2 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("ȫ�浿","ȫ���","ȫ�繫");
		// 3���� String��ü�� ������ list ����
		
		for(String name : list) {
			// ���� Ǫ���� �̿��Ͽ� list �� ����ϰ���
			System.out.println(name);
			// ȫ�浿 ȫ��� ȫ�繫 ��µ�
		}
		
		List<Integer> list1 = Arrays.asList(1, 2 ,3);
		// 3���� Integer��ü�� ������ list ����
		for(int value : list1) {
			System.out.println(value);
			// 1,2,3 ��µ˴ϴ�.
		}

	}

}
