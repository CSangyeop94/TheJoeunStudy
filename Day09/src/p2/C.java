package p2;
import p1.*;

public class C {

	public C () {
		A a = new A();
		a.field1 = 1; // <== ��Ű���� �޶� public �ϳ�������
		// a.field2 = 1;
		// a.field3 = 1;
		
		a.method1(); // <== ��Ű���� �޶� public �ϳ�������
		//a.method2();
		//a.method3();
	}
}
