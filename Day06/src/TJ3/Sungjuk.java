package TJ3;

public class Sungjuk {
	String name;
	int kor; int eng; int mat;
	
	
	int tot() {
		int tot =  kor + eng + mat;
		return tot;
	}
	double avg() {
		double avg = (double) tot()/3;
		return avg;
	}
}
