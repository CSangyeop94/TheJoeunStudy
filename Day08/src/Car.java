
public class Car {
	
	// �ʵ�
	String company = "�����ڵ���";
    static String model;
	String color;
	int maxSpeed;
	
	// ������
	Car() {
		
	}
	Car(String model) {
		this(model, "����");
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
