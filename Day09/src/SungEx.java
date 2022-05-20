
public class SungEx {

	public static void main(String[] args) {
		
		Sungjuk2 s1 = new Sungjuk2("홍길동", 50, 60);
		
		System.out.println(s1.name);
		System.out.println(s1.kor);
		System.out.println(s1.mat);
		s1.Tot(); // 부모클레스 상속
		s1.avg1(); 
		
		
		

	}

}
