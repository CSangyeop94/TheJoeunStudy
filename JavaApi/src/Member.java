
public class Member {
	// �ʵ� ����
	public String id;
	// ������
	public Member(String id) {
		// this = �ڱ� �ڽ��� ��ü�� �����ϴ� �����
		// �� Ŭ���� ���ο��� �ڽ��� Ŭ������ ��Ī�ϴ� ��ü
		this.id = id;
	}
	@Override 
	public boolean equals(Object obj) {
		if(obj instanceof Member) { // <-�Ű����� Member Ÿ������ Ȯ�� 
			Member member = (Member) obj; 
			// Member Ÿ������ ���� Ÿ�� ��ȯ�ϰ� id�ʵ尪�� ��������
			// �˻��� �� �����ϴٸ� true�� �������ش�.
			if(id.equals(member.id)) {
				return true;
			}
		}// �Ű����� Member Ÿ���� �ƴϰų� id �ʵ尪�� �ٸ� ��� false�� �������ش�.
		return false;
	}
}
