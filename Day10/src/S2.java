
public class S2 extends S1 {

	// �ʵ� ����
	public int mat;

	// ������
	public S2(String name, int kor, int eng, int mat) {
		super(name, kor, eng);
		this.mat = mat;
	}

	// �޼ҵ� ������
	// public void print() {
//		System.out.println("============����ó��===========");
	// }
	// ���� �޼ҵ�
	public void tot() {

		print();
		int tot = kor + mat + eng;
		System.out.println("name : " + name);
		System.out.println("���� : " + tot);
		return;
	}

	// ��� �޼ҵ�
	public void avg() {

		super.print();
		double avg = (kor + mat + eng) / 3.0;
		System.out.println("��� : " + avg);
		return;
	}

}
