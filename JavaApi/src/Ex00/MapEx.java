package Ex00;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class MapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Ű�߽����� �������� ����
		NavigableMap<String, String> map = new TreeMap<>();
		map.put("����", "������");
		map.put("����", "��������");
		map.put("���", "������");
		map.put("������", "����");
		
		System.out.println("Entry �� : " + map.size());
		// Entry �� : 4 
		Set<String> keySet = map.keySet();
		// Iterator �̿�
		Iterator<String> keyit = keySet.iterator();
		while(keyit.hasNext()) {
			String key = keyit.next();
			String Value = map.get(key);
			System.out.println(key + ":" + Value);
		}
		
		System.out.println(map.get("����"));
		System.out.println(map.get("���"));
		
		// ��ü ��� ����
		Set<Entry<String, String>> entry = map.entrySet();
		
		Iterator<Entry<String, String>> it = entry.iterator();
		
		while(it.hasNext()) {
			Entry<String, String> ent = it.next();
			String key = ent.getKey();
			String val = ent.getValue();
			System.out.println(key +"="+ val);
					
		}
		// forEach���� �̿� ��� �������
		// map.entrySet().forEach(System.out::print);
		// map.entrySet().forEach(k -> System.out.print(k + " "));
		map.keySet().forEach(k->System.out.println(k+"="+map.get(k)));
		
		// key �鸸 ����
		map.keySet().forEach(System.out::println);
		
		// value �鸸 ����
		map.values().forEach(System.out::println);
		
		// �Ϻ� ���� ����
		// map.subMap("����", "�Ŵ�");
		// map.subMap("����", true, "�Ŵ�", true);
		// map.headMap("����");
		map.tailMap("����")
		.forEach((k, v) -> System.out.println(k+":"+v));
		
	}

}
