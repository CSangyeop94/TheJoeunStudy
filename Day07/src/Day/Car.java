package Day;

public class Car {
	String name = "TJ";
	String model;
	String color;
	int max;
	
	Car(){
		
	}
	Car(String model) {
		this.model = model;
	}
	Car(String model, String color) {
		this.model = model;
		this.color = color;
	}
	Car(int max) {
		this.max = max;
	}
	Car(String model, String color, int max) {
		this.model = model;
		this.color = color;
		this.max = max;
		
	}
	
	
	/*// �ʵ� ����
	String color; int cc;
	// ������
	Car() {
	
	}
	Car(String color, int cc) {
		// �ʵ� ���� ���������� ���� �ʱ�ȭ��
		this.color = color;
		this.cc = cc; //�ʵ�� �ްԺ����� �̸��� �ٸ��� �����ҋ� this�Ƚᵵ�µ�
		//Car(String c, int b){
		//	color = c; cc = b; �� ����
		//	}
	}
	public void ptint() {
		// String color ="aaa"; �� ���� �ʾ� �ʵ忡 �ִ� ���� �����پ�
		System.out.println(color);
		System.out.println(cc);
	}*/
	
}
