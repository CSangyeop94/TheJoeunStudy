
public class Calculator {
	static String name;
	static int kor;static int eng;static int mat;
	
	static int tot () {
		return kor+eng+mat;
	}
	static double avg( ) {
		
		return (kor+eng+mat)/3.0;
	}
	static String grade() {
		double avg = avg();
		if(avg >= 60 && kor >= 40 && eng >=40 && mat >=0) {
			return "합격";
		}else {
			return "불합격";
		}
	}

}
/*
 * static double pi = 3.14159;
 * 
 * static int plus(int x, int y) { return x + y; } static int minus(int x, int
 * y) { return x - y; }
 */