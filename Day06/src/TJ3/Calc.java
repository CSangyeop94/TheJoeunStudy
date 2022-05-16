package TJ3;

import java.util.Scanner;

public class Calc {
	
	// 필드 선언
	String name;
	int kor1; int eng1;
	static double PI = 3.141592;
	// static 는 클레스를 바로 호출가능
	public void ptint() {
		System.out.println("프린트");
	}
	public void name(String name) {
		 
		this.name = name;
		
		System.out.println(this.name);
	}
	public int tot(int kor, int eng) {
		/*
		 * Student s1 = new Student(); s1.print(); this.ptint(); // 위의2개랑 같음 int tot =
		 * kor + eng; double PI = Calc.PI;
		 */
		String name2 = "홍길동2"; // name2는 변수라 값이없음
		this.name(name2);
		
		//Calc.name(name); // 클레스를 호출
		this.name(name); // 인스턴스를 호출
		this.kor1 = kor;
		this.eng1 = eng; // 낸 객체의 메소드라는것을 선언
		return this.kor1 + this.eng1;
	}
	// 같은 클래스 네에서 가져올떄는 this. 사용가능
}
