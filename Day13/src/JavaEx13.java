
import java.util.Objects;

public class JavaEx13 {

	String name;
	String food;
	String flavor;
	int year;
	
	
	@Override
	public int hashCode() {
		return Objects.hash(flavor, food, name, year);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof JavaEx13))
			return false;
		JavaEx13 other = (JavaEx13) obj;
		return Objects.equals(flavor, other.flavor) && Objects.equals(food, other.food)
				&& Objects.equals(name, other.name) && year == other.year;
	}






	public static void main(String[] args) {

		Object obj1 = new Object();
		Object obj2 = new Object();

		// obj1 = obj2;

		System.out.println(obj1.toString());
		// java.lang.Object@5e91993f
		System.out.println(obj2);
		// java.lang.Object@1c4af82c
		System.out.println(obj1.equals(obj2));
		// ��ü�� �������� ��
		
		// toString : �ǹ�) ��ü=> ���� ���� ��ȯ
		// : ��ü�� �ɵ���� ����(���ڿ��� ǥ��) Ȯ��
		// eqluals ������(�������̵�) ���
		// ��ҹ��� ������
		String str1 = "Java";
		// String str2 = "Java";
		String str2 = new String("java");

		// �� ������ ��(���ͷ�, �����)���� ��
		System.out.println(str1.equals(str2));
		
		///////////////////////////////////////
		
		JavaEx13 o1 = new JavaEx13();
		o1.name = "�ܹ���";
		o1.food = "�����߳� ��ġ�� �ܹ���";
		o1.flavor = "best";
		o1.year = 20;
		
		// ��ü�� �ɹ�(�ʵ�)���� ������ �Ѳ����� Ȯ��
		// System.out.println(obj.toString);
		System.out.println(o1);
		JavaEx13 o2 = new JavaEx13();
		o1.name = "�ܹ���";
		o1.food = "�����߳� ��ġ�� �ܹ���";
		o1.flavor = "best";
		o1.year = 20;
		// ��ü�� ������(hash code)
		// ������ => �뵵 ����) 
		// ��ü�� �ɹ�(�ʵ�)���� ������ �Ѳ����� ��
		
		System.out.println(o1);
		System.out.println(o2);
		System.out.println(o1.equals(obj2));
	}

}
