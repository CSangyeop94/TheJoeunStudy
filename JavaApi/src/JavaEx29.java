import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaEx29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] strArr = { "���", "�Ŷ��", "���ö�", "�ֵ���", "ġŲ����", "����", "�Ź�", "�����" };
		List<String> list = new ArrayList<>();
		list.addAll(Arrays.asList(strArr));
		
		// �迭�� ġȯ
		String[] strArr2 = new String[list.size()];
		
		// strArr2 = (String[])list.toArray(); (x)
		strArr2 = list.toArray(strArr); // (o)
		
		System.out.println(strArr2[0]);
		
		for(String s : strArr2) {
			System.out.print(s + " ");
		}
	}

}
