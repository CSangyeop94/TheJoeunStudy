
public class Car {
	
	// �ʵ�
	private int speed;
	private boolean stop;
	
	// ������
	
	// �޼ҵ� get <-�ʵ忡 ����Ȱ��� �����Ѵ�.
	public int getSpeed() {
		return speed; // <- geter�� ����
	}
	
	// seter <- ���� �޾� �ʵ忡 �����Ų��.
	public void setSpeed(int speed // ���ǵ带 �����;���
			) {
		if(speed < 0) {
			this.speed = 0;
			return;
		}else {
			this.speed = speed;
		}
	}
	// seter
	public boolean isStop() { // is�� �տ� ���̴°��� ����
		return stop;
	}
	// geter
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
}
