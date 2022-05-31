package Ex00;

public class Member {
	// 필드생성
	public String name;
	public int age;
	
	// 생성자
	public Member(String name, int age) {
		this.name = name;
		this.age =age;
	}
	@Override 
	public boolean equals(Object obj) {
		// name과 age가 값이 같으면 true를반환
		if(obj instanceof Member) {
			// instanceof 연산자를 이용 
			// object가 type이거나 type을 상속받는 클래스라면 true리턴할것임
			Member member = (Member) obj;
			return member.name.equals(name) && (member.age == age);
		}else {
			return false;
		}
	}
	@Override
	public int hashCode() { // name과 age가 같으면 동일한 hashcode를 리턴해준다.
		return name.hashCode() + age;
	} 	// String의 hashCode() 이용한다.
}
