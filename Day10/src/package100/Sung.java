package package100;

public class Sung {
	// �ʵ����
	int kor; int eng; int mat; String id; String pw;
	
	// ������
	Sung(int kor, int eng, int mat, String id, String pw) {
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
		this.id = id;
		this.pw = pw;
	}
	// ���� �޼���
	public int getTot () {
		
		return (kor+eng+mat);
	}
	// ��� �޼���
	public double getAvg() {
		double avg = (double)getTot()/3.0;
		return avg;
	}
	// ��� �޼���
	public String getGrade() {
		double avg = getAvg();
		if(avg >=60 && kor >= 40 && eng >= 40 && mat >= 40) {
			return"�հ��Դϴ�.";
		}else {
			return"���հ��Դϴ�";
		}
	}	
	// idüũ �޼���
	public void getIdCheck(String id, String pw) {
		if(id.equals("admin") && pw.equals("1111")) {
			System.out.println("���̵� : "+ id +"��й�ȣ : " + pw);
			System.out.println("�α��� ����");
		}else {
			System.out.println("���̵� : "+ id +"��й�ȣ : " + pw);
			System.out.println("�α��� ����");
		}
	}
}
