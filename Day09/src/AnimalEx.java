
public class AnimalEx {
	
	public static void main(String[] args) {
		Dog dog = new Dog("시추","하얀색",20); 
		System.out.println(dog.kind);
		System.out.println(dog.color);
		System.out.println(dog.age);
		
		dog.powerOn(); // 부모클래스 상속 메소드
		dog.showAge(); // 인스턴스 메소드
	}
}
