
public class BoxEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Box box = new Box();
//		box.setObj(new Object());
//		Object obj = box.getObj();
//		
//		box.setObj("hello");
//		// ���ڿ��� ������ ���� ObjectŬ������ �ļ�Ŭ������ ��ΰ���
//		// ex) String, Integer
//		//box.getObj();
//		// String�� �־����� return �� Object�� 
//		String str = (String)box.getObj();
//		// ����ȯ�� ����� �մϴ�.
//		System.out.println(str);
//		
//		box.setObj(1);
//		int value = (int)box.getObj();
		// ������ �����ϰ� ����ȯ�� ����� �մϴ�. 
		
		// ���׸�����
		// ����ÿ��� ������ Ÿ���� �����ϰ�
		// ����Ҷ��� ��ü������ �������־ ����Ѵ�.
		Box<Object> box = new Box<>();
		box.setObj(new Object());
		Object obj = box.getObj();
		
		Box<String> box2 = new Box<>();
		// box2.setObj(3); 3�� ������ �ϸ� ��Ʈ���� ������� ����
		box2.setObj("hello");
		String str = box2.getObj();
		System.out.println(str);
		
		Box<Integer> box3 = new Box<>();
		box3.setObj(4);
		int v2 = box3.getObj();
		System.out.println(v2);
	}

}
