package Day;

import java.util.Scanner;

public class Sung1 {
	
	
	String name = "홍길동";
	int kor; int eng; int mat;
	int tot; double avg;
	
	
	public void tot (int kor, int eng, int mat) {
		this.eng = eng;
		this.kor = kor; 
		this.mat = mat;
	   tot = (this.kor+this.eng+this.mat);
		System.out.println("tot 점수 : " + tot);
		}
	public  double avg() {
		
		double avg = (kor+eng+mat)/3.0;
		return avg;
	}
	public void print() {
		System.out.println("kor 점수 : "+ kor);
		System.out.println("eng 점수 : "+ eng);
		System.out.println("mat 점수 : "+ mat);
		System.out.println("tot 점수 : "+ tot);
		
	}
	
}
