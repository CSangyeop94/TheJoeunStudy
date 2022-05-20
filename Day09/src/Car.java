
public class Car {
	
	// 필드
	private int speed;
	private boolean stop;
	
	// 생성자
	
	// 메소드 get <-필드에 저장된값을 리턴한다.
	public int getSpeed() {
		return speed; // <- geter는 리턴
	}
	
	// seter <- 값을 받아 필드에 저장시킨다.
	public void setSpeed(int speed // 스피드를 가져와야함
			) {
		if(speed < 0) {
			this.speed = 0;
			return;
		}else {
			this.speed = speed;
		}
	}
	// seter
	public boolean isStop() { // is를 앞에 붙이는것은 관례
		return stop;
	}
	// geter
	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}
}
