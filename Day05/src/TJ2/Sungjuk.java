package TJ2;
// 패키지안에 구구단.프린트란 함수 생성
public class Sungjuk { //--참조 클레스
	public void gugudan() {
		// 함수 1
		// static가 없으면 성적ex에서 가져갈수없음
		// static가 없을때 객체를 instance화 시켜 메모리에 할당시켜야함
		for(int i=2; i<=9; i++) {
			System.out.println(i+"단");
			for(int j=1; j<=9; j++) {
				System.out.println(i + "*"+j + "=" + (i*j));
			}
		}
	}
	//함수2
	public void print() {
		System.out.println("Test Print");
	}
}
