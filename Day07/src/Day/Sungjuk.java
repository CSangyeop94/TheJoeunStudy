package Day;

public class Sungjuk {
	String name ="È«±æµ¿";
	int kor; int mat; int eng;
	int tot; double avg;
	
	
	int tot(int kor, int eng, int mat) {
		this.kor =kor; this.eng =eng; this.mat = mat;
		
		return kor+eng+mat;
	}
	double avg(int kor, int eng, int mat) {
		
		return (kor+eng+mat)/3.0;
	}
public void print() {
		
		System.out.println("=====================================");
		System.out.println("ÀÌ¸§ \t" + "±¹¾î\t"+"¿µ¾î\t"+"¼öÇÐ\t"+"ÃÑÁ¡\t"+"Æò±Õ\t");
		System.out.println("=====================================");
		System.out.print(name+"\t" + kor+"\t" + eng+"\t" + mat+"\t" + tot+"\t" + avg );
	}
	public static void main(String[] main) {
		Sungjuk s1 = new Sungjuk();
		s1.kor = 80; s1.eng = 80; s1.mat=80;
		int tot = s1.tot();
		//s1.avg();
		s1.print();
		
		
	}
}
