package work2;

// ���� ���

public interface Director 
	extends President, VicePresident {

	// �������̽��� ������ �Ѵ�. ! => default
	default void orderFromPresident() {
		
		System.out.println("������� ȸ����� ���ô�� ���ϴ�.");
	}
	
}
