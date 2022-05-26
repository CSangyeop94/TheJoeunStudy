

import java.util.Objects;

public class JavaEx14 {

	String name;
	String birthday;
	String kind;
	int age;

	@Override
	public int hashCode() {
		return Objects.hash(age, kind, name, birthday);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof JavaEx14))
			return false;
		JavaEx14 other = (JavaEx14) obj;
		return age == other.age && Objects.equals(kind, other.kind) && Objects.equals(name, other.name)
				&& Objects.equals(birthday, other.birthday);
	}

	public static void main(String[] args) {
		
		JavaEx14 o1 = new JavaEx14();
		o1.name = "백수";
		o1.kind = "불꽃효자";
		o1.birthday = "2016.09.13";
		o1.age = 10;
		
		System.out.println(o1);
		
		JavaEx14 o2 = new JavaEx14();
		o1.name = "백수";
		o1.kind = "불꽃효자";
		o1.birthday = "2016.09.13";
		o1.age = 10;
		System.out.println(o2);
		System.out.println(o1 ==  o2);
	}

}
