package TJ3;
// ex) class == ���赵
public class Student {
	
	//�ʵ� ����
	String name; // null�� �ڵ� ����
	int age = 10;
	double height = 100.0;
	double weight; // 0.0����
	int kor; int eng;
		//������ 
	Student(int aaa) {
		kor = aaa;
		} 
	// �⺻ ������ ����
	Student(){
		
	}
	//�޼ҵ�
	void print() {
		System.out.println("Ŭ���� ����");
	}
	int tot() { // �ʵ弱��
		int tot = kor + eng;
		return tot;
	}
	
}
