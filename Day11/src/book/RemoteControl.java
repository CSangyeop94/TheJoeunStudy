package book;

// �������̽��� �����͸� �����Ҽ� ���� ������ 
// �����͸� ������ �ʵ带 �����Ҽ�����.
// ��� ��� �ʵ常 �����Ҽ� �ִ�. 
// ����� public static final�� ����
public interface RemoteControl {
	// �������̽� ����� static{}�����  �ʱ�ȭ ���ϱ� ������
	// ���� ���ÿ� �ʱⰪ ����.
	
	//���
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	// �߻� �޼���
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	// �޼��� ����θ� �ۼ�(�߻� Ŭ���� Ư¡)
	
	// default Method - ���� ������� ����
	// �ڹ�8���� �߰��� �������̽��� ���ο� �ɹ�
	// default Method�� public�� Ư¡�� ���´�.
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("���� ó���մϴ�.");
		}else {
			System.out.println("���� �����մϴ�.");
		}
	}
	// ���� �޼���
	// ���´� Ŭ���� �޼���� ����
	// ���� �޼��嵵 public Ư¡�� ���Ե�
	static void chanegeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
}
