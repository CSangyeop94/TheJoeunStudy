package book;

public class RemoteControlEx {

	public static void main(String[] args) {
		/*
		 * RemoteControl rc; 
		 * rc = new Television(); 
		 * rc = new Audio();
		 */
		RemoteControl rc = null; // <-�������̽� ���� ����
		
		rc = new Television(); // <- Television ��ü�� �������̽� Ÿ�Կ� ����
		
		rc.turnOff();
		rc.turnOn(); // <-�������̽��� turnOn(),turnOff() ȣ��
		
		rc = new Audio(); // <- Audio ��ü�� �������̽� Ÿ�Կ� ������
		
		rc.turnOn();
		rc.turnOff(); //<-�������̽��� turnOn(),turnOff() ȣ��

	}
}