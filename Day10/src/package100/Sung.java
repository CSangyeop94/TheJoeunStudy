package package100;

public class Sung {
	String name; int kor; int eng; int mat;
	Sung() {
	}
	Sung(String name, int kor, int eng, int mat){
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.mat=mat;
	}
	
	int getTot() {
		int tot=kor+eng+mat;
		return tot;
	}
	double getAvg() {
		int tot=getTot();
		double avg=tot/3.0;
		return avg;
	}
	
	String getGrade() {
		double avg=getAvg();
		
		if(avg>=60.0 && this.kor >=40 && this.eng >=40 && this.mat >=40) {
			return "�հ�";
		}else {
			return "���հ�";
		}
	}
	void idCheck(String id, String pw) {
		if(id.equals("admin") && pw.equals("1111")) {
			System.out.println("�α��� ����");
		}else {
			System.out.println("�α��� ����");
		}
		
	}
}
