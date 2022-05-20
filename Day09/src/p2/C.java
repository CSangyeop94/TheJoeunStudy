package p2;
import p1.*;

public class C {

	public C () {
		A a = new A();
		a.field1 = 1; // <== 패키지가 달라서 public 하나만가능
		// a.field2 = 1;
		// a.field3 = 1;
		
		a.method1(); // <== 패키지가 달라서 public 하나만가능
		//a.method2();
		//a.method3();
	}
}
