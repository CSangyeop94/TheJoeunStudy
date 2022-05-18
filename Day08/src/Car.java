
public class Car {
	
	// 필드
	String company = "현대자동차";
    static String model;
	String color;
	int maxSpeed;
	
	// 생성자
	Car() {
		
	}
	Car(String model) {
		this(model, "은색");
	}
	Car(String moedl, String color){
		this(model, color, 250);
	}
	Car(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
