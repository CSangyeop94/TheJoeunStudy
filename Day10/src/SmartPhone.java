// 추상클레스를 구체화시키는 실체 클레스
public class SmartPhone extends Phone {
	// 생성자
	public SmartPhone(String owner) {
		super(owner);
	}
	// 메소드
	public void internetSearch() {
		System.out.println("인터넷 검색을 합니다.");
		
	}
	// 오버라이징
	public void sound() {
		System.out.println("야옹야옹");
	}
}
