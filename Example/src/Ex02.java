import java.util.Scanner;

public class Ex02 {
	int kor; int eng; int mat;
	// 총합
	static int tot(int kor, int eng, int mat) {
		return kor + eng + mat;
	}

	// 평균
	static double avg(int kor, int eng, int mat) {
		return (kor + eng + mat) / 3;
	}

	static String grade(int kor, int eng, int mat) {
		
		String grade;
		if (avg(kor, eng, mat) >= 60 && kor >= 40 && eng >= 40 && mat >= 40) {
			 grade = "합격";
		} else {
			 grade = "불합격";
		}
		return grade;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 : ");
		String name = sc.next();
		System.out.println("국어 점수 : ");
		int kor = sc.nextInt();
		System.out.println("수학 점수 : ");
		int mat = sc.nextInt();
		System.out.println("영어 점수 : ");
		int eng = sc.nextInt();
		int tot1 = tot(kor, eng, mat);
		double avg1 = avg(kor, eng, mat);
		String grade1 =grade(kor, eng, mat);

		System.out.println("===========================================================");
		System.out.println("이름"+"\t"+"국어"+"\t"+"수학"+
		"\t"+"영어"+"\t"+"총점"+"\t"+"평균" + "\t"+ "합격여부");
		System.out.println("===========================================================");
		System.out.print(name+"\t" + kor+"\t" + mat+"\t" + eng+"\t" + tot1+"\t"
		+ avg1 +"\t"+grade1);
	}

}
