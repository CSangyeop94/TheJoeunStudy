

public interface Director {

	abstract void order(); 

	void order2(); 
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
