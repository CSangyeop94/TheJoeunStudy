
public class IfEx {
	
	public static void main(String[] args) {
		int kor = 40;
		int eng = 40;
		int mat = 40;
		
		int avg = (kor+eng+mat)/3;
		
		System.out.println("��� ���� : " + avg);
		if(avg>=90) {
			System.out.println("A���� �Դϴ�.");
		}
		else if(avg >= 80) {
			System.out.println("B���� �Դϴ�.");
		}
		else if (avg >= 70){
			System.out.println("C���� �Դϴ�.");
		}
		else if(avg >= 60) {
			System.out.println("D���� �Դϴ�.");
		}
		else {
			System.out.println("���հ�");
		}
		
	}
}
