
public class Singleton {

	// 선언 필드
	private static Singleton s1 = new Singleton();

	private Singleton() {
	} // 기본 생성자 선언
		// 기본 생성자를 주석처리하면 Singleton s1 = new Singleton 으로 가능해져서
		// 보안성에 좋지 않음.
	
	// 리턴 해주는것
	static Singleton gets1() {
		return s1;
	}
	static String name; // static 필드 선언
	static int kor;
	static int eng;
	static int mat;

	static { // static 블럭 작성
		name = "홍길동";
		kor = 100;
		eng = 80;
		mat = 60;
	}
	int tot () {
		return (kor + eng + mat);
	}
	double avg () {
		return (kor + eng + mat)/3.0;
	}
	
	
	}

