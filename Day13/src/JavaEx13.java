
import java.util.Objects;

public class JavaEx13 {

	String name;
	String food;
	String flavor;
	int year;
	
	
	@Override
	public int hashCode() {
		return Objects.hash(flavor, food, name, year);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof JavaEx13))
			return false;
		JavaEx13 other = (JavaEx13) obj;
		return Objects.equals(flavor, other.flavor) && Objects.equals(food, other.food)
				&& Objects.equals(name, other.name) && year == other.year;
	}






	public static void main(String[] args) {

		Object obj1 = new Object();
		Object obj2 = new Object();

		// obj1 = obj2;

		System.out.println(obj1.toString());
		// java.lang.Object@5e91993f
		System.out.println(obj2);
		// java.lang.Object@1c4af82c
		System.out.println(obj1.equals(obj2));
		// 객체의 고유값을 비교
		
		// toString : 의미) 객체=> 문자 열로 변환
		// : 객체의 맴드들의 내용(문자열로 표현) 확인
		// eqluals 재정의(오버라이딩) 사례
		// 대소문자 구별함
		String str1 = "Java";
		// String str2 = "Java";
		String str2 = new String("java");

		// 두 변수의 값(리터럴, 상수값)으로 비교
		System.out.println(str1.equals(str2));
		
		///////////////////////////////////////
		
		JavaEx13 o1 = new JavaEx13();
		o1.name = "햄버거";
		o1.food = "데리야끼 햄치즈 햄버거";
		o1.flavor = "best";
		o1.year = 20;
		
		// 객체의 맴버(필드)들의 내용을 한꺼번에 확인
		// System.out.println(obj.toString);
		System.out.println(o1);
		JavaEx13 o2 = new JavaEx13();
		o1.name = "햄버거";
		o1.food = "데리야끼 햄치즈 햄버거";
		o1.flavor = "best";
		o1.year = 20;
		// 객체의 고유값(hash code)
		// 재정의 => 용도 변경) 
		// 객체의 맴버(필드)들의 내용을 한꺼번에 비교
		
		System.out.println(o1);
		System.out.println(o2);
		System.out.println(o1.equals(obj2));
	}

}
