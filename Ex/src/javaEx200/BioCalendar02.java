package javaEx200;
// non static �޼���(�ɹ�)
public class BioCalendar02 {
	// ���, ������� ������ �� ����.
	public static final int PHYSICAL = 23; 
	// static ���� ���� ���� ���
	// �ɹ� �޼���(non static) �޼��� ����
	public double getBioRhythm(long days, int index, int max) {
		return max*Math.sin((days % index)*2 * Math.PI / index);
	} 
	//Math.sin() �޼ҵ�� �μ��� ���޹��� ���� ����(sine) �Լ����� ��ȯ�մϴ�.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int days = 1200;
		BioCalendar02 bio = new BioCalendar02(); // ��ü�� ����
		// �ɹ� �޼��� ȣ��
		double phyval = bio.getBioRhythm(days, PHYSICAL, 100);
		System.out.printf("���� ��ü���� %1$.2f�Դϴ�.\n", phyval);
	}

}
