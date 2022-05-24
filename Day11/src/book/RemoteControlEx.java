package book;

public class RemoteControlEx {

	public static void main(String[] args) {
		/*
		 * RemoteControl rc; 
		 * rc = new Television(); 
		 * rc = new Audio();
		 */
		RemoteControl rc = new RemoteControl() {

			public void turnOn() {
				//실행문
			}
			public void turnOff() {
				//실행문
			}
			public void setVolume(int volume) {
				//실행문
			}
		};
	}

}
