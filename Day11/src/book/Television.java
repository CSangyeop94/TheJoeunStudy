package book;

// ������ implements
public class Television implements RemoteControl {
	
	// �ʵ� ����
	private int volume;
	
	// RemoteControl ���� �߻�޼ҵ尡 3���� �ֱ⶧����
	// �� �޼������ ���� ��ü �޼��带 �������־����
	@Override
	public void turnOn() {
		System.out.println("Tv�� �մϴ�.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Tv�� ���ϴ�.");
		
	}

	@Override
	// �������̽� ����� �̿��ؼ� volume�ʵ��� ���� ������
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("���� TV ���� : "+volume);
	}

}
