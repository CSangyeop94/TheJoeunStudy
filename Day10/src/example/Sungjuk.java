package example;

public class Sungjuk {
	// 琶球
	int kor; int eng; int mat;
	String id; String pw;
	
	// 持失切
	Sungjuk(int kor, int eng, int mat) {
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		
	}
	// 持失切
	Sungjuk(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
}
