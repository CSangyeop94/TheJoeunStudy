package Day;

public class Sungjuk {
	String name ="ȫ�浿";
	int kor; int mat; int eng;
	int tot; double avg;
	
	
	int tot(String name,int kor, int eng, int mat) {
		this.name=name; this.kor =kor; this.eng =eng; this.mat = mat;
		int tot = kor+eng+mat;
		return tot;
	}
	double avg(int kor, int eng, int mat) {
		double avg =(kor+eng+mat)/3.0;
		return avg;
	}
	String grade() {
		String grade="";
		double avg=(this.kor+this.eng+this.mat) / 3.0;
		if(avg>=60) {
			grade="�հ�";
		}else {
			grade="���հ�";
		}
		return grade;
	}
	
public void print() {
		
		System.out.println("=====================================");
		System.out.println("�̸� \t" + "����\t"+"����\t"+"����\t"+"����\t"+"���\t");
		System.out.println("=====================================");
		System.out.print(name+"\t" + kor+"\t" + eng+"\t" + mat+"\t" + tot+"\t" + avg );
	}
	public static void main(String[] main) {
		Sungjuk s1 = new Sungjuk();
		int result1=s1.tot("ȫ�浿",80,80,80);
		double result2=s1.avg(80,80,80);
		String result3=s1.grade();
		System.out.println(s1.name + "\t" + s1.kor + "\t" + s1.eng + "\t" + s1.mat + "\t" + result1 + "\t" + result2 + "\t" + result3);
}
	
}
