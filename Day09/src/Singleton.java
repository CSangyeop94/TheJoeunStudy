
public class Singleton {

	// ���� �ʵ�
	private static Singleton s1 = new Singleton();

	private Singleton() {
	} // �⺻ ������ ����
		// �⺻ �����ڸ� �ּ�ó���ϸ� Singleton s1 = new Singleton ���� ����������
		// ���ȼ��� ���� ����.
	
	// ���� ���ִ°�
	static Singleton gets1() {
		return s1;
	}
	static String name; // static �ʵ� ����
	static int kor;
	static int eng;
	static int mat;

	static { // static �� �ۼ�
		name = "ȫ�浿";
		kor = 100;
		eng = 80;
		mat = 60;
	}
	int tot () {
		return (kor + eng + mat);
	}
	double avg () {
		return (kor + eng + mat)/3.0;
	}
	
	
	}

