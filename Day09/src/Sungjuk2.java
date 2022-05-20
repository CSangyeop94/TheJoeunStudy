
public class Sungjuk2 extends Sungjuk{

	
	
	double avg;
	
	// 생성자
	Sungjuk2(String name, int kor, int mat){
		this.name=name;
		this.kor=kor;
		this.mat=mat;
	}
	
	// 메소드
	void avg1() {
	 
		avg = (kor+mat)/2.0;
		System.out.println("평균 : " + avg);
	}

}
