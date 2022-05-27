
public class Member {
	// 필드 생성
	public String id;
	// 생성자
	public Member(String id) {
		// this = 자기 자신의 객체를 참조하는 예약어
		// 즉 클래스 내부에서 자신의 클래스를 지칭하는 객체
		this.id = id;
	}
	@Override 
	public boolean equals(Object obj) {
		if(obj instanceof Member) { // <-매개값이 Member 타입인지 확인 
			Member member = (Member) obj; 
			// Member 타입으로 강제 타입 변환하고 id필드값이 동일한지
			// 검사한 후 동일하다면 true을 리턴해준다.
			if(id.equals(member.id)) {
				return true;
			}
		}// 매개값이 Member 타입이 아니거나 id 필드값이 다른 경우 false를 리턴해준다.
		return false;
	}
}
