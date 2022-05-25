

public interface Director {

	abstract void order(); 

	void order2(); 
	static void staticMethod() {
		System.out.println("인터페이스의 정적 메서드");
	}

	public static void main(String[] args) {
		System.out.println("인터페이스의 실행");
		Director.staticMethod();
		
	}
	
	default void defaultMethod() {
		System.out.println("디폴트 메서드");
	}
}
