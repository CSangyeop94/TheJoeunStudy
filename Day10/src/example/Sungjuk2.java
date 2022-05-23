package example;

public class Sungjuk2 extends Sungjuk{
	//생성자
	Sungjuk2(int kor, int eng, int mat){
		super(kor,eng,mat);
		
	}
	//생성자
	Sungjuk2(String id, String pw) {
		super(id,pw);
	}
	public void tot () { // 구현 메소드
		int tot = kor+eng+mat;
		System.out.println("총점 : " + tot);
	}
	public double avg () {
		double avg = (kor+eng+mat)/3.0;
		System.out.println("평균 : " + avg);
		return avg;
	}
	public void grade () {
		double avg = avg();
		if(avg>=60 && kor >= 40 && eng >= 40 && mat >= 40) {
			System.out.println("합격입니다");
		}else {
			System.out.println("불합격입니다");
		}
	}
	public void IdCheck() {
		if(id.equals("admin") && pw.equals("1234")) {
			System.out.println("로그인성공");
		}else {
			System.out.println("로그인실패");
		}
	}
}
