package Tj;

public class Static1 {
	// 인스턴스 필드
	int f1;
	void method1(){};
	// 정적
	static int f2;
	static void method2(){};
	
	// 정적 블록
	static {
		// f1 = 10;
		// methor1(); // 정적 필드에서는 인스턴스 필드를 가져오지못함
			// 사용할려면 Static1 str1 = new Static(); 작업해야함
		f2 = 10;
		method2(); // 정적 필드는 그냥 가져오기 가능
	}
	// 정적 메소드
	static void method3() {
		Static1 st1 = new Static1(); // ** 객체화
		st1.f1 = 1;
		st1.method1();
		f2 = 10;
		method2();
	}
}
