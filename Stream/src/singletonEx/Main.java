package singletonEx;

public class Main {
public static int num = 1;
	public static void main(String[] args) {
		 Runnable run = () -> {
			 num++;
			 Singleton sigleton = Singleton.getInstance(num);
			 System.out.println("instance : " + sigleton.getMsg());
		 };
		 for (int i = 0; i < 10; i++) {
			 Thread thread = new Thread(run);
			 thread.start();
		 }
	}

}
