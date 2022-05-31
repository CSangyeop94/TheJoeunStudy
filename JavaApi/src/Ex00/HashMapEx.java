package Ex00;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		// Map �÷��� ����
		Map<String, Integer> map = new HashMap<String, Integer>();
		// String - Key 	Integer - Value
		
		// ��ü ����
		map.put("ȫ�浿", 85);
		map.put("ȫ���", 75);
		map.put("ȫ����", 95);
		map.put("ȫ��ٴ�", 45);
		map.put("ȫ�浿", 55); 
		// "ȫ�浿" Ű�� ���� ������ ���� �������� ������ ������ ����ȴ�.
		System.out.println("�� Entry�� : " + map.size());
		// �� Entry�� : 4 ���
		
		// ��ü ã��
		System.out.println("\tȫ�浿 : " + map.get("ȫ�浿"));
		// �̸�(Ű)���� ����(��)�� �˻��Ѵ�.
		System.out.println();
		// 	ȫ�浿 : 55 ���
		
		
		// ��ü�� �ϳ��� ó��
		Set<String> KeySet = map.keySet();
		
		// for(String s : KeySet) {
		//  System.out.println(s + " ");
		// } -- �̸��� ����
		
		// Key Set ���
		Iterator<String> keyIterator = KeySet.iterator(); 
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + ":" + value);
		}
		System.out.println();
		// ȫ��ٴ�:45 / ȫ�浿:55 / ȫ���:75 / ȫ����:95 ��µȴ�.
		
		// ��ü ����
		map.remove("ȫ�浿");
		System.out.println("�� Entry �� : " + map.size());
		// �� Entry �� : 3 ���
		
		// ��ü�� �ϳ��� ó��
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		// Map.Entry Set���
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + ":" + value);
		}
		// ȫ��ٴ�:45 / ȫ���:75 / ȫ����:95 ��µ� ȫ�浿�� ������ ������ ����
		System.out.println();
		
		// ��ü ��ü ����
		map.clear(); // ��� Map.Entry����
		System.out.println("�� Entry �� : " + map.size());
		// �� Entry �� : 0 ���
	}
	

}
