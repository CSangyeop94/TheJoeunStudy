
public class Student extends People {
	public int StudentNo; // super �޼ҵ�� �θ� ������ ȣ��
	
	// �ް԰��� ������� �θ��ʿ��� ���� �־����
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn); // �θ�Ŭ���� ������ ȣ�� �������ؾ���
		this.StudentNo = studentNo;
	}
}
