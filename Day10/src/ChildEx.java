
public class ChildEx {
	
public static void method1(Parent parent) {
	
	if(parent instanceof Child) {
		Child child = (Child) parent;
		System.out.println("m1 , ch 변환 성공");
	}else {
		System.out.println("m1 , ch 변환 실패");
	}
}
public static void method2(Parent parent) {
	
	if(parent instanceof Child) {
		Child child = (Child) parent;
		System.out.println("m2 , ch 변환 성공");
	}else {
		System.out.println("m2 , ch 변환 실패");
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
//// 부모것만 사용중
//
//// 자식것으로 클래스 형변환
//CHILD CHILD = (CHILD) PARENT; // (CHILD) 형변환
//CHILD.F1 = "DATA2";
//CHILD.M1();  CHILD.M2();  CHILD.M3();
//// 자식클래스로 형변환하면 자식클래스에 있는것들도 사용가능
//
//// 부모로 자동 형 변환
//PARENT PARENT2 = NEW PARENT();
//CHILD CHILD2 = NEW CHILD();