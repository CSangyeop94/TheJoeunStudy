
public class S1 {

	// �ʵ�
	String name;
	public int kor;
	public int eng;

	// ������
	public S1(String name, int kor, int eng) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;

	}

	// �޼ҵ�
	public final void print() {
		// final�� ����ϸ� overr��ding ����
		System.out.println("===����ó��===");

		return;
	}
}
