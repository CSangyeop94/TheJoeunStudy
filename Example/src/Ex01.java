
public class Ex01 {
	public static final int PHYSICAL = 23;     // ���(������ ����)
	// static �޼��� ����
	public static double getBioRhythm(long days, int index ,int max) {
		return max*Math.sin( (days % index) * 2 * Math.PI / index );
	}
	public static void main(String[] args) {
		int days=1200;     
		// �޼��� ȣ�� 
		double phyval=getBioRhythm( days,  PHYSICAL,     100);
		System.out.printf("���� ��ü���� %1$.2f�Դϴ�.\n",phyval);
	}

}