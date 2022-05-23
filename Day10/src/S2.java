
public class S2 extends S1 {

	// 필드 생성
	public int mat;

	// 생성자
	public S2(String name, int kor, int eng, int mat) {
		super(name, kor, eng);
		this.mat = mat;
	}

	// 메소드 재정의
	// public void print() {
//		System.out.println("============성적처리===========");
	// }
	// 총점 메소드
	public void tot() {

		print();
		int tot = kor + mat + eng;
		System.out.println("name : " + name);
		System.out.println("총점 : " + tot);
		return;
	}

	// 평균 메소드
	public void avg() {

		super.print();
		double avg = (kor + mat + eng) / 3.0;
		System.out.println("평균 : " + avg);
		return;
	}

}
