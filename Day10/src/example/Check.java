package example;

public class Check {

	// �ʵ�
	String id;
	String pw;
	
	// ������
	Check(String id, String pw) {
		this.id = id;
		this.pw = pw;
	}
	void Idc (Check check) { // Check check Ŭ���� ����
		if(id.equals("admin") && pw.equals("1111")) {
			System.out.println("�θ�Ŭ����.�α��μ���");
		}else {
			System.out.println("�θ�Ŭ����.�α��ν���");
		}
	}
}
