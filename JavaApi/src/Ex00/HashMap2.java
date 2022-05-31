package Ex00;

import java.util.HashMap;
import java.util.Map;

public class HashMap2 {

	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<Student, Integer>();
		
		map.put(new Student(1, "È«±æµ¿"), 90);
		map.put(new Student(1, "È«±æ¼ø"), 95);
		
		System.out.println("ÃÑ entry : " + map.size());
		
		

	}

}
