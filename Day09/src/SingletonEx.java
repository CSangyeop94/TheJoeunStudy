
public class SingletonEx {

	public static void main(String[] args) {
	
		Singleton obj1 = Singleton.gets1();
		System.out.println("�̸� : " +obj1.name);
		System.out.println("���� : " +obj1.kor);
		System.out.println("���� : " +obj1.eng);
		System.out.println("���� : " +obj1.mat);
		System.out.println("���� : " +obj1.tot());
		System.out.println("��� : " +obj1.avg());
		
		
		
		
	}

}
/* 	private�̱� ������ �ܺο��� ���ٺҰ�
 * Singleton obj1 = new Singleton(); // ������ ����
 * Singleton obj2 = new Singleton(); // ������ ����
 * */

/*
 * Singleton obj1 = Singleton.getInstance(); Singleton obj2 =
 * Singleton.getInstance();
 * 
 * System.out.println(obj1.kor); // ���ϰ� �ּ� (��������) if(obj1 == obj2) {
 * System.out.println("���� ��ü �Դϴ�."); }else { System.out.println("�ٸ� ��ü �Դϴ�."); }
 */