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
				//���๮
			}
			public void turnOff() {
				//���๮
			}
			public void setVolume(int volume) {
				//���๮
			}
		};
	}

}
