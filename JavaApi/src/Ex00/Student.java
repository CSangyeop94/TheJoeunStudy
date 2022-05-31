package Ex00;

public class Student {
	// 필드생성
	public int sno;
	public String name;
	// 생성자
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
	
	public boolean equals(Object obj) {
		// 학번, 이름이 동일할경우 true를 리턴해줍니다.
		if(obj instanceof Student) {
			Student student = (Student) obj;
			return (sno == student.sno) && (name.equals(student.name));
		}else {
			return false;
		}
	}
	public int hashCode() {
		// 학번, 이름이 같다면 동일한 값을 리턴
		return sno + name.hashCode();
	}
}
