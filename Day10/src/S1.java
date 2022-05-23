
public class S1 {

	// 필드
	String name;
	public int kor;
	public int eng;

	// 생성자
	public S1(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;

	}

	// 메소드
	public final void print() {
		// final을 사용하면 overrㅑding 못함
		System.out.println("===성적처리===");

		return;
	}
}
