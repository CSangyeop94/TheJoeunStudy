package Day;

import java.util.Scanner;

public class Sung1 {
	
	
	String name = "ȫ�浿";
	int kor; int eng; int mat;
	int tot; double avg;
	
	
	public void tot (int kor, int eng, int mat) {
		this.eng = eng;
		this.kor = kor; 
		this.mat = mat;
	   tot = (this.kor+this.eng+this.mat);
		System.out.println("tot ���� : " + tot);
		}
	public  double avg() {
		
		double avg = (kor+eng+mat)/3.0;
		return avg;
	}
	public void print() {
		System.out.println("kor ���� : "+ kor);
		System.out.println("eng ���� : "+ eng);
		System.out.println("mat ���� : "+ mat);
		System.out.println("tot ���� : "+ tot);
		
	}
	
}
