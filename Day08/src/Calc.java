import java.util.Scanner;

public class Calc {
	//�ʵ� ����
	int kor; int eng; int mat; int tot; double avg;
	String id; String pw;
	
	//������ ���� �����ε�
	Calc(String id, String pw){
		this.id = id;
		this.pw = pw;
	}
	
	Calc(int kor, int eng, int mat){
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	// �޼ҵ� 
	void gugudan() {
		for(int i=2;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				System.out.println(i + "*" + j + "=" + (i*j));
			}
		}
	}
	void sungjuk() {
		tot = kor + eng + mat;
		avg = tot / 3.0;
		System.out.println("���� :" + tot + " ��� :" + avg);
	}
	void idCheck() {
		if(id.equals("admin") && pw.equals("1111")) {
			System.out.println("�α��� ����");
		} else {
			System.out.println("�α��� ����");
		}
	}
}
/*
 * int plus(int x, int y) { int result = x + y; return result; }
 * 
 * double avg(int x, int y) { double sum = plus(x, y); double result = sum / 2;
 * return result; }
 * 
 * void excute () { double result = avg(7, 10); println("������ : " + result); }
 * 
 * void println(String message) { System.out.println(message); }
 */