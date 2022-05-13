package TJ3;

public class SungjukEx {

	public static void main(String[] args) {
		Sungjuk ss1 = new Sungjuk();
		Sungjuk ss2 = new Sungjuk();
		
		ss1.name = "홍길동";
		ss1.kor = 50; ss1.eng = 60; ss1.mat = 70;
		System.out.println("이름 : "+ ss1.name);
		System.out.println("kor점수 : "+ ss1.kor);
		System.out.println("eng점수 : "+ ss1.eng);
		System.out.println("mat점수 : "+ ss1.mat);
		
		System.out.println();
		System.out.println("=======================");
		ss2.name = "홍길순";
		ss2.kor = 80; ss2.eng = 90; ss2.mat = 100;
		System.out.println("이름 : "+ ss2.name);
		System.out.println("kor점수 : "+ ss2.kor);
		System.out.println("eng점수 : "+ ss2.eng);
		System.out.println("mat점수 : "+ ss2.mat);
		ss2.tot();
		System.out.println("총점수 : "+ ss2.tot());
		ss2.avg();
		System.out.println("평균 점수 : "+ ss2.avg());
	}

}
