package Day;

public class CarEx {

	public static void main(String[] args) {
	
		Car car1 = new Car();
		Car car2 = new Car("아반떼");
		Car car3 = new Car("소나타","파란색",200);
		Car car4 = new Car(500);
		System.out.println(car1.name);
		System.out.println(car2.model);
		System.out.println(car3.model);
		System.out.println(car3.max);
		System.out.println(car4.max);
		

	}

}
