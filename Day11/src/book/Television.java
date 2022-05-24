package book;

// 구현부 implements
public class Television implements RemoteControl {
	
	// 필드 선언
	private int volume;
	
	// RemoteControl 에는 추상메소드가 3개가 있기때문에
	// 이 메서드들의 대한 실체 메서드를 가지고있어야함
	@Override
	public void turnOn() {
		System.out.println("Tv를 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Tv를 끕니다.");
		
	}

	@Override
	// 인터페이스 상수를 이용해서 volume필드의 값을 제한함
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : "+volume);
	}

}
