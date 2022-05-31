package Ex00;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class MapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 키중심으로 오름차순 정렬
		NavigableMap<String, String> map = new TreeMap<>();
		map.put("종로", "설렁탕");
		map.put("무교", "낚지볶음");
		map.put("사당", "떡볶이");
		map.put("을지로", "고등어");
		
		System.out.println("Entry 수 : " + map.size());
		// Entry 수 : 4 
		Set<String> keySet = map.keySet();
		// Iterator 이용
		Iterator<String> keyit = keySet.iterator();
		while(keyit.hasNext()) {
			String key = keyit.next();
			String Value = map.get(key);
			System.out.println(key + ":" + Value);
		}
		
		System.out.println(map.get("종로"));
		System.out.println(map.get("사당"));
		
		// 전체 요소 나열
		Set<Entry<String, String>> entry = map.entrySet();
		
		Iterator<Entry<String, String>> it = entry.iterator();
		
		while(it.hasNext()) {
			Entry<String, String> ent = it.next();
			String key = ent.getKey();
			String val = ent.getValue();
			System.out.println(key +"="+ val);
					
		}
		// forEach문을 이용 모두 같은방법
		// map.entrySet().forEach(System.out::print);
		// map.entrySet().forEach(k -> System.out.print(k + " "));
		map.keySet().forEach(k->System.out.println(k+"="+map.get(k)));
		
		// key 들만 나열
		map.keySet().forEach(System.out::println);
		
		// value 들만 나열
		map.values().forEach(System.out::println);
		
		// 일부 추출 나열
		// map.subMap("종로", "신당");
		// map.subMap("종로", true, "신당", true);
		// map.headMap("종로");
		map.tailMap("종로")
		.forEach((k, v) -> System.out.println(k+":"+v));
		
	}

}
