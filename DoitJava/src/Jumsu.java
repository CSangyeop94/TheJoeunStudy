
public class Jumsu {

	public static void main(String[] args) {
		/*
		 * . ����, ���� ���� ���� 0~100�� ���̸� ������ ����ϰ�
		 *  �� ���� ������ �ƴϸ� "�߸��� ���� �Է� ���"
		 */

		int kor = 100;
		int eng = 70;
		int mat = 70;
		if (kor < 0 || kor > 100 || eng < 0 || eng > 100 || mat < 0 || mat > 100) {
			System.out.println("���� �߸� �Է�");
		} else {

			System.out.println("���� :" + (kor + eng + mat));
		}
	}

}
