import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		/* -------------- ��/��/�� (�Էº�) -------------- */

		// TODO
		// ��/��/�� ���� �Է�
		// ����)
		// 1) �� ������ ������ �Է�
		// 2) ���� �Է� Ÿ��Ʋ(ǥ��) ���
		// ex) ���� ���� �Է� :
		// 3) �� ���� �Է°� => �� ���� ���� ����

		// TODO
		// ������ �Է� ��ȿ�� �˻�/���Է� ����
		// ����ó��(try ~ catch)
		// 0 ~ 100 ������ ���� �Է� �Ǹ� ��ȿ ����
		//
		// ���� ����/�б�

		int kor;
		int eng;
		int mat;
		Scanner sc = new Scanner(System.in);

		String subjects[] = { "����", "����", "����" };
		int[] scores = new int[subjects.length];

		for (int i = 0; i < subjects.length; i++) {

			while (true) {

				System.out.println(subjects[i] + "���� �Է����ּ���");

				try {
					scores[i] = sc.nextInt();

				} catch (InputMismatchException e) {
					// �߸��� ������ ���� �־��ָ� ���� �߻� 
					System.out.println("�߸��� ���� �Է��Դϴ�.");
					continue; 
					// ������ ���´ٰ� �������ʰ� continue;
				}
				// i�� 0~100 ���̷� ������ �˻�
				if (scores[i] >= 0 && scores[i] <= 100) {
					break;
				} else {
					System.out.println("�߸��� ���Դϴ�.");
				}

			}
		}
		kor = scores[0];
		eng = scores[1];
		mat = scores[2];
		System.out.println("kor : "+ kor);
		System.out.println("eng : "+eng);
		System.out.println("mat : "+mat);

		int tot = scores[0] + scores[1] + scores[2];
		double avg = tot / scores.length;
		System.out.println("tot : "+tot);
		System.out.println("avg : "+avg);
		sc.close();
	}	

}
