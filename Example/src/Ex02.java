import java.util.Scanner;

public class Ex02 {
	int kor; int eng; int mat;
	// ����
	static int tot(int kor, int eng, int mat) {
		return kor + eng + mat;
	}

	// ���
	static double avg(int kor, int eng, int mat) {
		return (kor + eng + mat) / 3;
	}

	static String grade(int kor, int eng, int mat) {
		
		String grade;
		if (avg(kor, eng, mat) >= 60 && kor >= 40 && eng >= 40 && mat >= 40) {
			 grade = "�հ�";
		} else {
			 grade = "���հ�";
		}
		return grade;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�̸� : ");
		String name = sc.next();
		System.out.println("���� ���� : ");
		int kor = sc.nextInt();
		System.out.println("���� ���� : ");
		int mat = sc.nextInt();
		System.out.println("���� ���� : ");
		int eng = sc.nextInt();
		int tot1 = tot(kor, eng, mat);
		double avg1 = avg(kor, eng, mat);
		String grade1 =grade(kor, eng, mat);

		System.out.println("===========================================================");
		System.out.println("�̸�"+"\t"+"����"+"\t"+"����"+
		"\t"+"����"+"\t"+"����"+"\t"+"���" + "\t"+ "�հݿ���");
		System.out.println("===========================================================");
		System.out.print(name+"\t" + kor+"\t" + mat+"\t" + eng+"\t" + tot1+"\t"
		+ avg1 +"\t"+grade1);
	}

}
