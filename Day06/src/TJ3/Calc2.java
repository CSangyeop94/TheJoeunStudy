package TJ3;

public class Calc2 {
	
	String name;
	int kor; int eng; int mat; // 필드 생성
	int tot; 
	
	public void name(String name) {
		System.out.println(name);
	}
	
	public void tot(int kor, int eng, int mat) {
		int tot = (kor + eng + mat);
		System.out.println("총점 : " + tot);
	} // void 형은 리턴값이 없음
	
	
	public double avg1(int kor, int eng, int mat) {
		this.kor = kor; this.eng = eng; this.mat = mat;
		double avg = (this.kor + this.eng + this.mat)/3;
		
		return avg;
	}
	public void avg2() {
		double avg = this.avg1(kor, eng, mat); // 변수가 붙지않으면 필드선언 
		// 필드선언시 숫자 초기값은 0 String null
		
		System.out.println("평균2 : "+ avg);
	}
}
