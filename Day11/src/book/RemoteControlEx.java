package book;

public class RemoteControlEx {

	public static void main(String[] args) {
		/*
		 * RemoteControl rc; 
		 * rc = new Television(); 
		 * rc = new Audio();
		 */
		RemoteControl rc = null; // <-인터페이스 변수 선언
		
		rc = new Television(); // <- Television 객체를 인터페이스 타입에 대입
		
		rc.turnOff();
		rc.turnOn(); // <-인터페이스의 turnOn(),turnOff() 호출
		
		rc = new Audio(); // <- Audio 객체를 인터페이스 타입에 대입함
		
		rc.turnOn();
		rc.turnOff(); //<-인터페이스의 turnOn(),turnOff() 호출

	}
}