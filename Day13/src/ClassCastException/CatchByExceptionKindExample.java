package ClassCastException;

public class CatchByExceptionKindExample {
	public static void main(String[] args) {
		
		try {
			//�迭����
			String data1 = args[0];
			String data2 = args[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println(data1 + "+" + data2 +"=" + result);
		} catch(ArrayIndexOutOfBoundsException e) {
			// �迭�� ���� �����ʾ� 
			// System.out.println("���� �Ű����� ���� �����մϴ�."); ����ɰ���
			System.out.println("���� �Ű����� ���� �����մϴ�.");
		}catch(Exception e) {
			System.out.println("���࿡ ������ �ֽ��ϴ�.");
		}finally {
			System.out.println("�ٽ� �����ϼ���.");
		}
	}
}
