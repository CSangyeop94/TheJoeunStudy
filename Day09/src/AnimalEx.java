
public class AnimalEx {
	
	public static void main(String[] args) {
		Dog dog = new Dog("����","�Ͼ��",20); 
		System.out.println(dog.kind);
		System.out.println(dog.color);
		System.out.println(dog.age);
		
		dog.powerOn(); // �θ�Ŭ���� ��� �޼ҵ�
		dog.showAge(); // �ν��Ͻ� �޼ҵ�
	}
}
