package Ex00;

public class Member {
	// �ʵ����
	public String name;
	public int age;
	
	// ������
	public Member(String name, int age) {
		this.name = name;
		this.age =age;
	}
	@Override 
	public boolean equals(Object obj) {
		// name�� age�� ���� ������ true����ȯ
		if(obj instanceof Member) {
			// instanceof �����ڸ� �̿� 
			// object�� type�̰ų� type�� ��ӹ޴� Ŭ������� true�����Ұ���
			Member member = (Member) obj;
			return member.name.equals(name) && (member.age == age);
		}else {
			return false;
		}
	}
	@Override
	public int hashCode() { // name�� age�� ������ ������ hashcode�� �������ش�.
		return name.hashCode() + age;
	} 	// String�� hashCode() �̿��Ѵ�.
}
