package TJ3;

public class Calc2 {
	
	String name;
	int kor; int eng; int mat; // �ʵ� ����
	int tot; 
	
	public void name(String name) {
		System.out.println(name);
	}
	
	public void tot(int kor, int eng, int mat) {
		int tot = (kor + eng + mat);
		System.out.println("���� : " + tot);
	} // void ���� ���ϰ��� ����
	
	
	public double avg1(int kor, int eng, int mat) {
		this.kor = kor; this.eng = eng; this.mat = mat;
		double avg = (this.kor + this.eng + this.mat)/3;
		
		return avg;
	}
	public void avg2() {
		double avg = this.avg1(kor, eng, mat); // ������ ���������� �ʵ弱�� 
		// �ʵ弱��� ���� �ʱⰪ�� 0 String null
		
		System.out.println("���2 : "+ avg);
	}
}
