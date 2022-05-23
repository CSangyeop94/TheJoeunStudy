package p10;

public class Child extends Parent {
	// 필드
	int mat;

	// 생성자
	Child(int kor, int eng, int mat) {
		super(kor, eng);
		this.mat = mat;

	}

	// 메소드
	public void avg() { // 오버라이딩
		double avg = (kor + eng + mat) / 3.0;
		System.out.println("자식 평균 : " + avg);
	}

	public void tot2() {
		int tot = kor + eng + mat;
		System.out.println("자식 총점 : " + tot);
	}

}
/*
 * String name = "홍길순"; int eng = 100;
 * 
 * public void method3() { System.out.println("자식 method3"); } public void
 * method1() { System.out.println("자식 method1"); }
 */