
public class ChildEx {
	
public static void method1(Parent parent) {
	
	if(parent instanceof Child) {
		Child child = (Child) parent;
		System.out.println("m1 , ch ��ȯ ����");
	}else {
		System.out.println("m1 , ch ��ȯ ����");
	}
}
public static void method2(Parent parent) {
	
	if(parent instanceof Child) {
		Child child = (Child) parent;
		System.out.println("m2 , ch ��ȯ ����");
	}else {
		System.out.println("m2 , ch ��ȯ ����");
	}
	
}
	public static void main(String[] args) {
		
		Parent parentA = new Child();
		method1(parentA);
		method2(parentA);
		
		Parent parentB = new Parent();
		method1(parentB);
		method2(parentB);

	}

}
//PARENT PARENT = NEW CHILD();
//PARENT.F1 = "DATA1";
//PARENT.M1();
//PARENT.M2();
//// �θ�͸� �����
//
//// �ڽİ����� Ŭ���� ����ȯ
//CHILD CHILD = (CHILD) PARENT; // (CHILD) ����ȯ
//CHILD.F1 = "DATA2";
//CHILD.M1();  CHILD.M2();  CHILD.M3();
//// �ڽ�Ŭ������ ����ȯ�ϸ� �ڽ�Ŭ������ �ִ°͵鵵 ��밡��
//
//// �θ�� �ڵ� �� ��ȯ
//PARENT PARENT2 = NEW PARENT();
//CHILD CHILD2 = NEW CHILD();