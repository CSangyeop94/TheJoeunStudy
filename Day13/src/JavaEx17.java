
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class JavaEx17 {
	String name;
	String address;
	
	void method() {
		
	}
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		// Class clazz = Class.forName("JavaEx17.class");
		Class clazz = JavaEx17.class;
		Field[] flds = clazz.getDeclaredFields();
		
		// �ɹ� �ʵ� �μ�
		for (Field f : flds) {
			System.out.println(f.getName());
		}
		System.out.println("--------------");
		Method[] mts = clazz.getDeclaredMethods();
		
		// foreach loop
		// ������ ��� ���� ���(next) �˻� ���
		// ���� ��� => �ݺ���(iterator) ���� ���
		
		for(Method m : mts) { // m -���� mts = �迭
			System.out.println(m);
		} 
		// ������ ����� ����
		
		for(int i=0; i<mts.length; i++) {
			// System.out.println(m);
			System.out.println(mts[i]);
		}
	}
}
