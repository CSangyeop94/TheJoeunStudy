
public class Dog extends Animal{
	int age;
	
	// ������
	Dog(String kind, String color, int age){
		this.kind=kind;
		this.color=color;
		this.age=age;
	}
	void showAge() {
		System.out.println("������ ���� : " + age);
	}

}
