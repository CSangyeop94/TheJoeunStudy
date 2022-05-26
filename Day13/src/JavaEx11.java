import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class JavaEx11 {
	public static void main(String[] args) {

		// �ڿ� �ڵ� �ݳ�(close)
		// �ڿ� �ݳ� ���ϸ� �ڿ� ��ũ(resource leak) �߻�
		// �ý��� �ڿ�(�޸�, CPU, HDD, SSD, �ָ�ID ��ġ��.....)
		// �ڿ��� �ٸ� ���μ������ �����ؾ� ��
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("a.txt");
			int result = 0;

			while ((result = fis.read()) != -1) {
				System.out.print((char) result);

			}
			// fis.close(); // �ڿ��ݳ�

		} catch (FileNotFoundException e) {
			System.out.println("File : ������ ����");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("IOE : ID ���� �߻�");
			e.printStackTrace();
			/*
			 * } finally { try { if (fis != null) fis.close(); } catch (IOException e) {
			 * System.out.println("�ڿ� �ݳ� ����"); e.printStackTrace(); }
			 */
		}
	}
}
