import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("001", "kim");
		map.put("002", "lee");
		map.put("003", "choi");
		
		map.put("001", "kang");
		System.out.println(map.size());
		
		System.out.println(map.get("001"));
		System.out.println(map.get("002"));
		
		Set<String> key= map.keySet(); 
		
		Iterator<String> iter = key.iterator();
		while(iter.hasNext()) {
			String key1 = iter.next();
			String value = map.get(key1);
			System.out.println(key1 +":"+ value);
		}
	}

}
