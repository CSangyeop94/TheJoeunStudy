import java.util.Objects;

public class Student {
	String name;
	String number;
	int birthyear;
	
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.name = "ȫ�浿";
		s1.number = "1234";
		s1.birthyear = 1995;
		
		Student s2 = new Student();
		s2.name = "ȫ�浿";
		s2.number = "1234";
		s2.birthyear = 1995;
		
		if(s1.equals(s2)) {
			System.out.println("s1 == s2");
		}else {
			System.out.println("s1 != s2");
		}
			
			System.out.println(s1.hashCode());
			System.out.println(s2.hashCode());
			System.out.println(s1);
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", number=" + number + ", birthyear=" + birthyear + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(number);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Student))
			return false;
		Student other = (Student) obj;
		return Objects.equals(number, other.number);
	}
	
		
}
