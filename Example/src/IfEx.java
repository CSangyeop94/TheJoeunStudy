
public class IfEx {
	
	public static void main(String[] args) {
		int kor = 40;
		int eng = 40;
		int mat = 40;
		
		int avg = (kor+eng+mat)/3;
		
		System.out.println("평균 점수 : " + avg);
		if(avg>=90) {
			System.out.println("A학점 입니다.");
		}
		else if(avg >= 80) {
			System.out.println("B학점 입니다.");
		}
		else if (avg >= 70){
			System.out.println("C학점 입니다.");
		}
		else if(avg >= 60) {
			System.out.println("D학점 입니다.");
		}
		else {
			System.out.println("불합격");
		}
		
	}
}
