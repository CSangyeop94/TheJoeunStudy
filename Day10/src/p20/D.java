package p20;

import p10.*;

public class D extends A {
	// protected는 상속받은 패키지에서는 사용가능함
	public D() {
		super();
		this.f1 = "value";
		this.method();
		method();
	}
}
