import java.awt.Toolkit;

public class BeepPrintEx {
	
	// ���� �����常 �̿��� ���
	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		// toolkit ��ü ���
		
		for(int i =0; i<5; i++) {
			toolkit.beep(); // ������ �߻�
			try {Thread.sleep(500);} catch(Exception e) {}
			 // Thread.sleep(500) - 0.5�ʰ� �Ͻ�����
		}
		for(int i=0; i<5; i++) {
			System.out.println("��");
			try {Thread.sleep(500);} catch(Exception e) {}
		}
	
	}
}
