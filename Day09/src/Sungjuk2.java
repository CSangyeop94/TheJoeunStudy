
public class Sungjuk2 extends Sungjuk{

	
	
	double avg;
	
	// ������
	Sungjuk2(String name, int kor, int mat){
		this.name=name;
		this.kor=kor;
		this.mat=mat;
	}
	
	// �޼ҵ�
	void avg1() {
	 
		avg = (kor+mat)/2.0;
		System.out.println("��� : " + avg);
	}

}
