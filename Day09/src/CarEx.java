
public class CarEx {

	public static void main(String[] args) {
		Car car = new Car();
		
		//�߸��� �ӵ� ����
		car.setSpeed(-50);
		System.out.println(car.getSpeed());
		
		car.setSpeed(60);
		System.out.println(car.getSpeed());
		
		System.out.println(!car.isStop());
		
		if(!car.isStop()) {
			car.setStop(true);
			return;
		}
		System.out.println(car.getSpeed());
		System.out.println(car.isStop());
	}

}
