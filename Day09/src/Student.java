
public class Student extends People {
	public int StudentNo; // super 메소드는 부모 생성자 호출
	
	// 메게값이 있을경우 부모쪽에도 값이 있어야함
	
	public Student(String name, String ssn, int studentNo) {
		super(name, ssn); // 부모클레스 생성자 호출 무조건해야함
		this.StudentNo = studentNo;
	}
}
