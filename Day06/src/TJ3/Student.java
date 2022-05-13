package TJ3;
// ex) class == 설계도
public class Student {
	
	//필드 선언
	String name; // null값 자동 저장
	int age = 10;
	double height = 100.0;
	double weight; // 0.0저장
	int kor; int eng;
		//생성자 
	Student(int aaa) {
		kor = aaa;
		} 
	// 기본 생성자 선언
	Student(){
		
	}
	//메소드
	void print() {
		System.out.println("클래스 연습");
	}
	int tot() { // 필드선언
		int tot = kor + eng;
		return tot;
	}
	
}
