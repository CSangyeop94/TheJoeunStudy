package TJ2;
// ��Ű���ȿ� ������.����Ʈ�� �Լ� ����
public class Sungjuk { //--���� Ŭ����
	public void gugudan() {
		// �Լ� 1
		// static�� ������ ����ex���� ������������
		// static�� ������ ��ü�� instanceȭ ���� �޸𸮿� �Ҵ���Ѿ���
		for(int i=2; i<=9; i++) {
			System.out.println(i+"��");
			for(int j=1; j<=9; j++) {
				System.out.println(i + "*"+j + "=" + (i*j));
			}
		}
	}
	//�Լ�2
	public void print() {
		System.out.println("Test Print");
	}
}
