package p10;

import java.util.Scanner;

public class ChildEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// Child child = new Child(100, 100, 100);
		// Parent parent = child;
		// parent.tot(); - 200
		// parent.avg(); - 100.0
		// child.tot2(); - 300

		System.out.println("kor : ");
		int kor = sc.nextInt();
		System.out.println("mat : ");
		int eng = sc.nextInt();
		System.out.println("eng : ");
		int mat = sc.nextInt();
		Child child = new Child(kor, eng, mat);

		Parent parent = child;
		parent.tot();
		parent.avg(); // 자식쪽에서 재정의됨
		// parent.tot2(); 사용불가
		child.tot();
		child.tot2();
		child.avg();

	}

}
/*
 * Child child = new Child();
 * 
 * 
 * System.out.println(child.kor); System.out.println(child.eng);
 * child.method1(); child.method2(); child.method3();
 * 
 * // 부모클래스 자동 타입변환 child 클레스의 필드, 메소드 사용불가 Parent parent1 = child;
 * System.out.println(child.kor); parent1.method1();
 * 
 * Child2 child2 = new Child2(); System.out.println(child2.kor);
 * System.out.println(child2.mat);
 * 
 * Parent parent2 = new Child2(); System.out.println(parent2.kor); //
 * System.out.println(parent2.mat); parent2.method1(); parent2.method2();
 * child2.method4();
 */