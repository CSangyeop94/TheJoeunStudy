package javaEx200;
// Math.sin(), s014.Math.toDegrees()
public class BioCalendar {
	// ���, ������� ���� �Ұ�
	public static final int PHYSICAL = 23; // ��� ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int index = PHYSICAL;	// ������ ����� ����
		int days = 1200;
		double phyval = 100*Math.sin((days % index) * 2 * Math.PI / index );
		System.out.printf("���� ��ü���� %1$.2f�Դϴ�.\n",phyval);
		// %1$ <- 1$s�� ù��° �μ��� �ǹ� = phyval
		// f�� �ε� �Ҽ��� 10������ ǥ�����ִµ� 2���ٿ� �Ҽ���2������ ��������
	}

}
