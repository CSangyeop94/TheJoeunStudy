package example;

public class Sungjuk {
	// �ʵ�
	int kor; int eng; int mat;
	String id; String pw;
	
	// ������
	Sungjuk(int kor, int eng, int mat) {
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		
	}
	// ������
	Sungjuk(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
}
