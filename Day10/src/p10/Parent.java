package p10;

public class Parent {
	// 필드 생성
	int kor; int eng;
	
	//생성자
	Parent(int kor, int eng) {
		this.kor = kor;
		this.eng = eng;
	}
	//메소드
	public void tot() {
		int tot = kor + eng;
		System.out.println("부모 총점 : " + tot);
		
	}
	public void avg() {
		double avg = (kor + eng)/3.0;
		System.out.println("부모 평균 : " + avg);
		
	}
	
}/*
	 * String name = "홍길동"; int kor = 100;
	 * 
	 * public void method1() { System.out.println("부모 method1"); }
	 * 
	 * public void method2 () { System.out.println("부모 method2"); }
	 */