// 실행 클레스
public class PhoneEx {

	public static void main(String[] args) {
	//	Phone phone = new Phone("aaa"); 추상클레스라서 객채화 시킬수없음.
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn(); // phone 메소드
		smartPhone.internetSearch();
		smartPhone.turnOff(); // phone 메소드
		smartPhone.owner = "홍길순";
		System.out.println(smartPhone.owner);
		smartPhone.sound(); 

	}

}
