import java.util.ArrayList;
import java.util.List;

public class ListEx {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("kim");
		list.add("kang");
		list.add("kim");
		
		System.out.println(list.size());
		// 리스트는 중복값으 들어갈수 있음
		
		for(int i =0; i< list.size(); i++) {
			String str = list.get(i);
			System.out.println(str);
		}
	}
}
