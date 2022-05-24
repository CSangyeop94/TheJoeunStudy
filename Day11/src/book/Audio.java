package book;

// ������ implements
public class Audio implements RemoteControl {
	
	// �ʵ� ����
	private int volume;
	
	// RemoteControl ���� �߻�޼ҵ尡 3���� �ֱ⶧����
	// �� �޼������ ���� ��ü �޼��带 �������־����
	@Override
	public void turnOn() {
		System.out.println("Audio �� �մϴ�.");
		 
	}

	@Override
	public void turnOff() {
		System.out.println("Audio �� ���ϴ�.");
		
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
		System.out.println("���� Audio ���� : "+volume);
	}

}
