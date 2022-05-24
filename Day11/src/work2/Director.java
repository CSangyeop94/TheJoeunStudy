package work2;

// 다중 상속

public interface Director 
	extends President, VicePresident {

	// 인터페이스가 구현을 한다. ! => default
	default void orderFromPresident() {
		
		System.out.println("부장님이 회장님의 지시대로 일하다.");
	}
	
}
