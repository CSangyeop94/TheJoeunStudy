import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		// String 객체를 저장한다.
		// 배열은 0부터시작 
		// ex) 0.java 1.JDBC....
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");
		
		int size = list.size();
		System.out.println("총 객체수 : " + size);
		// 객체수는 5개가 나옴
		
		String skill = list.get(2);
		// 2번 인덱스의 객체 얻기
		System.out.println("2: " + skill);
		// list.add(2, "DAtabase"); = Dayabase출력
		
		//저장된 총 객체수 만큼 루핑
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(1 + ":" + str);
		// 0.JAVA 1.JDBC 2.Database 3.Servlet/Jsp
			// 4. iBATIS 출력됨
		}
		
		list.remove(2); // 2번 인덱스 객체 Database 삭제됨
		list.remove(2); // 자동으로 밀리면서 servlet/JSP 객체 삭제
		list.remove("iBATIS"); // iBATIS 객체 삭제
		
		for(int i=0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(1 + ":" + str);
			// 0.JAVA 1.JDBC 출력됨
		}
		
	}

}
