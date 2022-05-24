package book;

// 인터페이스는 데이터를 저장할수 없기 떄문에 
// 대이터를 저장할 필드를 선언할수없다.
// 대신 상수 필드만 선언할수 있다. 
// 상수는 public static final로 선언
public interface RemoteControl {
	// 인터페이스 상수는 static{}블록을  초기화 못하기 때문에
	// 선언가 동시에 초기값 선언.
	
	//상수
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	
	// 추상 메서드
	public void turnOn();
	public void turnOff();
	public void setVolume(int volume);
	// 메서드 선언부만 작성(추상 클레스 특징)
	
	// default Method - 실행 내용까지 저장
	// 자바8에서 추가된 인터페이스의 새로운 맴버
	// default Method는 public의 특징을 갖는다.
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		}else {
			System.out.println("무음 해제합니다.");
		}
	}
	// 정적 메서드
	// 형태는 클레스 메서드와 동일
	// 정적 메서드도 public 특징을 갖게됨
	static void chanegeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
