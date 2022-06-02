
public class Ex01 {
	public static void main(String[] args) {
		// º¯¼ö¸¦ ¼±¾ðÇØÁÜ
		int kor = 80; int eng = 80; int mat = 20;
		int tot =(kor + eng + mat); 
		double avg = tot/3;
		String name = "È«±æµ¿";
		String grade; // or char grade;
		
		if(avg >= 60 && kor >=40 && eng >=40 && mat >=40) {
			grade = "P";
		}else {
			grade = "F";
		}
		System.out.println("name : " + name);
		System.out.println("kor : " + kor);
		System.out.println("eng : " + eng);
		System.out.println("mat : " + mat);
		System.out.println("tot : " + tot);
		System.out.println("avg : " + avg);
		System.out.println("grade : " + grade);
	}
}
