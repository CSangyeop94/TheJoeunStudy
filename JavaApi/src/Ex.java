import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		// String ��ü�� �����Ѵ�.
		// �迭�� 0���ͽ��� 
		// ex) 0.java 1.JDBC....
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");
		
		int size = list.size();
		System.out.println("�� ��ü�� : " + size);
		// ��ü���� 5���� ����
		
		String skill = list.get(2);
		// 2�� �ε����� ��ü ���
		System.out.println("2: " + skill);
		// list.add(2, "DAtabase"); = Dayabase���
		
		//����� �� ��ü�� ��ŭ ����
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(1 + ":" + str);
		// 0.JAVA 1.JDBC 2.Database 3.Servlet/Jsp
			// 4. iBATIS ��µ�
		}
		
		list.remove(2); // 2�� �ε��� ��ü Database ������
		list.remove(2); // �ڵ����� �и��鼭 servlet/JSP ��ü ����
		list.remove("iBATIS"); // iBATIS ��ü ����
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(1 + ":" + str);
			// 0.JAVA 1.JDBC ��µ�
		}
		
	}

}
