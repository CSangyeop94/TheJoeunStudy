import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {

		/** ���� */
		byte korean = -1; // ����

		/** ���� */
		byte english = -1; // ����

		/** ���� */
		byte math = -1; // ����

		Scanner sc = null;

		// Q) �Ʒ��� ���� ���� ������ ���� ������ �迭�� �־��� ���� ���
		// �־��� ���ǰ� ���� �ڵ带 �ۼ��Ͻʽÿ�.
		String[] subjects = { "����", "����", "����" };
		byte[] scores = new byte[subjects.length];

		// TODO
		// 1) �� ���� ���� ���� �Է��� ���� ����ŭ �ݺ������� ���� �� �ֵ��� for loop�� Ȱ���Ͽ�
		// �Ʒ��� ������ �籸�� �Ͻʽÿ�.

		for (int i = 0; 1 <= subjects.length; i++) {
			while (true) {
				
				System.out.print(subjects[i] + " ���� �Է� : ");
				sc = new Scanner(System.in);
				
				try {

					scores[i] = sc.nextByte();
					// TODO
					// 2) ǥ�� �Է��� �޾Ƽ� �� ���� ���� �迭 ������ �����մϴ�.

				} catch (InputMismatchException e) {
					System.out.println(subjects[i] + " ������ �ٽ� �Է��Ͻʽÿ�.");
					continue;
				}
				// TODO
				// 3) �� ������� ���� ���� 0 ~ 100 ���̸� �б��ϵ��� ��ġ�ϰ�
				// �׷��� ������ "���� ������ 0~100 ������ ������ �Է��Ͻʽÿ�." �� ����
				// �� ���񺰷� �޽�¡�� �� �ֵ��� ��ġ�մϴ�.
				if (scores[i] >= 0 && scores[i] <= 100) {
					break;
				} else {
					System.out.println("������ ������ �ٸ��ϴ�.");
				}

			} // while

			// TODO
			// 4) �� ���� �ش�Ǵ� ���� �迭�� ��Ҹ� �� ���� �����մϴ�.
			korean = scores[0];
			english = scores[1];
			math = scores[2];
			System.out.println("korean : " + korean);
			System.out.println("english : " + english);
			System.out.println("math : " + math);

			sc.close();
		}
	}

}
