package example;

public class IdCheck extends Check {
	

	// ������
	IdCheck(String id, String pw) {
		super(id, pw);
		
	}
	// �޼ҵ� ������
	 void Idc(Check check) {
		
		if(id.equals("admin") && pw.equals("1234")) {
			System.out.println("�ڽ�Ŭ����.�α��μ���");
		}else {
			System.out.println("�ڽ�Ŭ����.�α��ν���");
		}
	}

	
}
