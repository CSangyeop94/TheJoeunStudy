// ���� Ŭ����
public class PhoneEx {

	public static void main(String[] args) {
	//	Phone phone = new Phone("aaa"); �߻�Ŭ������ ��äȭ ��ų������.
		
		SmartPhone smartPhone = new SmartPhone("ȫ�浿");
		
		smartPhone.turnOn(); // phone �޼ҵ�
		smartPhone.internetSearch();
		smartPhone.turnOff(); // phone �޼ҵ�
		smartPhone.owner = "ȫ���";
		System.out.println(smartPhone.owner);
		smartPhone.sound(); 

	}

}
