
public class Ex03 {

	private static Object avg;
	public static void main(String[] args) {
		int kor = 80 ; int eng =100; int mat = 90;
		// ���� ����
		
		System.out.println("kor : " + kor);
		System.out.println("eng : " + eng);
		System.out.println("mat : " + mat);
		// System.out.println("tot : " + tot);
		String grade = grade2(kor, eng, mat);
		System.out.println(grade);
		}
	// kor.eng.mat �� ������ grade ���
	public static String grade2(int kor, int eng, int mat) {
		String grade; // String grade ����
		// ��հ� = ;
		double avg = (kor + eng + mat) / 3.0;
		if (avg >= 60) {
			grade = "�հ�";
		}else {
			grade = "���հ�";
		}
		// void ���� return (x)
		return grade;
	}
}
