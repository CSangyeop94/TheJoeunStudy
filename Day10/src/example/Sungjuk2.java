package example;

public class Sungjuk2 extends Sungjuk{
	//������
	Sungjuk2(int kor, int eng, int mat){
		super(kor,eng,mat);
		
	}
	//������
	Sungjuk2(String id, String pw) {
		super(id,pw);
	}
	public void tot () { // ���� �޼ҵ�
		int tot = kor+eng+mat;
		System.out.println("���� : " + tot);
	}
	public double avg () {
		double avg = (kor+eng+mat)/3.0;
		System.out.println("��� : " + avg);
		return avg;
	}
	public void grade () {
		double avg = avg();
		if(avg>=60 && kor >= 40 && eng >= 40 && mat >= 40) {
			System.out.println("�հ��Դϴ�");
		}else {
			System.out.println("���հ��Դϴ�");
		}
	}
	public void IdCheck() {
		if(id.equals("admin") && pw.equals("1234")) {
			System.out.println("�α��μ���");
		}else {
			System.out.println("�α��ν���");
		}
	}
}
