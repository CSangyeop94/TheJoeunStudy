
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class JavaEx17 {
	String name;
	String address;
	
	void method() {
		
	}
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		// Class clazz = Class.forName("JavaEx17.class");
		Class clazz = JavaEx17.class;
		Field[] flds = clazz.getDeclaredFields();
		
		// 맴버 필드 인쇄
		for (Field f : flds) {
			System.out.println(f.getName());
		}
		System.out.println("--------------");
		Method[] mts = clazz.getDeclaredMethods();
		
		// foreach loop
		// 낱개의 요소 다음 요소(next) 검색 방식
		// 성능 향상 => 반복자(iterator) 패턴 방식
		
		for(Method m : mts) { // m -낱개 mts = 배열
			System.out.println(m);
		} 
		// 위에와 방식은 같음
		
		for(int i=0; i<mts.length; i++) {
			// System.out.println(m);
			System.out.println(mts[i]);
		}
	}
}
