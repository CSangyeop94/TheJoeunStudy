

public class JavaEx22 {
	
	public static void main(String[] args) {
		
		String str = "�����ٶ�1234\\d";
		
		System.out.println(str.replaceAll("\\d", ""));
		System.out.println(str.replace("\\d", ""));
		// \\d = ���ڿ� replaceAll �� n�� m���� �ٲٶ�¸�
		// ����� ���ڰ� ������� �����ٶ� ���
	
		
	}
}
