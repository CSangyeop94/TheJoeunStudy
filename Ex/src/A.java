/**�ٱ� Ŭ����**/
public class A {
	int field1;
	void method1 () {}
	
	static int field2;
	static void method2() {}
	
	class B {
		void method() {
			field1 = 10;
			method1();
			
			field2 = 10;
			method2();
		}
	}
	static class C {
		void method() {
			// field1 = 10;
			// method1();
			
			field2 = 10;
			method2();
		}
	}
}
/**
 * A() {System.out.println("A ��ü�� ������");}
	
	
	class B {
		B() {System.out.println("B ��ü�� ������");}
		int field1;
		// static int field2;
		void method1 () {}
		// static void method2() {}
	}
	
	
	static class C {
		C() {System.out.println("C ��ü�� ������");}
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
	}
	
	void method () {
		
		class D {
			D() {System.out.println("D ��ü�� ������");}
			int field1;
			// static int field2;
			void method1 () {}
			// static void method2 () {}
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
 * 
 * 
 */
 