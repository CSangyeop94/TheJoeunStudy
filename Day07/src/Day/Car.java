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
	
	
	/*// 필드 선언
	String color; int cc;
	// 생성자
	Car() {
	
	}
	Car(String color, int cc) {
		// 필드 선언 하지않으면 값이 초기화됨
		this.color = color;
		this.cc = cc; //필드와 메게변수의 이름이 다르면 선언할떄 this안써도는됨
		//Car(String c, int b){
		//	color = c; cc = b; 는 가능
		//	}
	}
	public void ptint() {
		// String color ="aaa"; 을 하지 않아 필드에 있는 값을 가져다씀
		System.out.println(color);
		System.out.println(cc);
	}*/
	
}
