package work;

// �������̽�(intreface)
// ��� : ȫ��
// �볻 : ����/���
public interface Director {
//  abstract public interface Director { // o
//	public abstract interface Director { // o	
	// ���� : ���(constant) + �߻� �޼����θ� ������

	abstract void order(); // o

	void order2(); // o

	// �������̽��� public ���� �����ڸ� ���
	// ��ǥ�� => default / package ���� ������ (x)
	// => public ���� �����ڷ� ����

	// �������̽��� �ɹ� �ʵ�� ���(constant)�� ����Ѵ�
	// String name; (x) ���� ���� �ʴ°��� ��������ʴ´�.
	// String name = "java"; // (o)
	// -����� default �ΰ� ������ public�̴�.
	// private String name = "java"; // (x)
	// protected String name = "java"; // (x)
	// static String name = "java"; (o)
	// final static String name = "java"; (o)
	// static final String name = "java"; // (o)

	/*	- (x)
	 * { // �ν��Ͻ� �� }
	 * 
	 * static { // ������ }
	 */

	// void instanceMethod() {}

	// Director() { -�������̽��� �����ڸ� ������ ����.
	// System.out.println("�������̽� ������");
	// }
	static void staticMethod() {
		System.out.println("�������̽��� ���� �޼���");
	}

	public static void main(String[] args) {
		System.out.println("�������̽��� ����");
		Director.staticMethod();
		
	}
	
	default void defaultMethod() {
		System.out.println("����Ʈ �޼���");
	}
	
}
