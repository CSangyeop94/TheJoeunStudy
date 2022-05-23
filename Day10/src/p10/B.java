package p10;

public class B {

	public void method() {
		// protected 같은 패키지네 사용 가능
		A a = new A();
		a.f1 = "value";
		a.method();
	}
}
