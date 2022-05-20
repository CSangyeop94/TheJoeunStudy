
public class SingletonEx {

	public static void main(String[] args) {
	
		Singleton obj1 = Singleton.gets1();
		System.out.println("이름 : " +obj1.name);
		System.out.println("국어 : " +obj1.kor);
		System.out.println("영어 : " +obj1.eng);
		System.out.println("수학 : " +obj1.mat);
		System.out.println("총점 : " +obj1.tot());
		System.out.println("평균 : " +obj1.avg());
		
		
		
		
	}

}
/* 	private이기 떄문에 외부에서 접근불가
 * Singleton obj1 = new Singleton(); // 컴파일 에러
 * Singleton obj2 = new Singleton(); // 컴파일 에러
 * */

/*
 * Singleton obj1 = Singleton.getInstance(); Singleton obj2 =
 * Singleton.getInstance();
 * 
 * System.out.println(obj1.kor); // 리턴값 주소 (참조번지) if(obj1 == obj2) {
 * System.out.println("같은 객체 입니다."); }else { System.out.println("다른 객체 입니다."); }
 */