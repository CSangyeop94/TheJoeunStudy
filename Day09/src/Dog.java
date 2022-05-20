
public class Dog extends Animal{
	int age;
	
	// 생성자
	Dog(String kind, String color, int age){
		this.kind=kind;
		this.color=color;
		this.age=age;
	}
	void showAge() {
		System.out.println("강아지 나이 : " + age);
	}

}
