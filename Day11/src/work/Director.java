package work;

// 인터페이스(intreface)
// 대외 : 홍보
// 대내 : 지시/명령
public interface Director {
//  abstract public interface Director { // o
//	public abstract interface Director { // o	
	// 원래 : 상수(constant) + 추상 메서드들로만 구성됨

	abstract void order(); // o

	void order2(); // o

	// 인터페이스는 public 접근 제한자만 허용
	// 무표기 => default / package 접근 제한자 (x)
	// => public 접근 제한자로 간주

	// 인터페이스의 맴버 필드는 상수(constant)만 허용한다
	// String name; (x) 값을 넣지 않는것은 허용하지않는다.
	// String name = "java"; // (o)
	// -모양은 default 인거 같지만 public이다.
	// private String name = "java"; // (x)
	// protected String name = "java"; // (x)
	// static String name = "java"; (o)
	// final static String name = "java"; (o)
	// static final String name = "java"; // (o)

	/*	- (x)
	 * { // 인스턴스 블럭 }
	 * 
	 * static { // 정적블럭 }
	 */

	// void instanceMethod() {}

	// Director() { -인터페이스는 생성자를 가질수 없다.
	// System.out.println("인터페이스 생성자");
	// }
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
