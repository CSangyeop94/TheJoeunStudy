package package100;

public class Sung {
	// 필드생성
	int kor; int eng; int mat; String id; String pw;
	
	// 생성자
	Sung(int kor, int eng, int mat, String id, String pw) {
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.id = id;
		this.pw = pw;
	}
	// 총합 메서드
	public int getTot () {
		
		return (kor+eng+mat);
	}
	// 평균 메서드
	public double getAvg() {
		double avg = (double)getTot()/3.0;
		return avg;
	}
	// 결과 메서드
	public String getGrade() {
		double avg = getAvg();
		if(avg >=60 && kor >= 40 && eng >= 40 && mat >= 40) {
			return"합격입니다.";
		}else {
			return"불합격입니다";
		}
	}	
	// id체크 메서드
	public void getIdCheck(String id, String pw) {
		if(id.equals("admin") && pw.equals("1111")) {
			System.out.println("아이디 : "+ id +"비밀번호 : " + pw);
			System.out.println("로그인 성공");
		}else {
			System.out.println("아이디 : "+ id +"비밀번호 : " + pw);
			System.out.println("로그인 실패");
		}
	}
}
