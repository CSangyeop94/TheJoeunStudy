package Ex00;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new Hashtable<String, String>();
		// id�� pw�� �̸� �����صд�.
		map.put("Spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");  
		map.put("winter", "12345");
		Scanner sc =new Scanner(System.in);
		
		while(true) {
			System.out.println("���̵�� ��й�ȣ�� �Է����ּ���");
			System.out.println("���̵� : ");
			String id = sc.next();
			
			System.out.println("��й�ȣ : ");
			String pw = sc.next();
			System.out.println();
			
			if(map.containsKey(id)) {
				if(map.get(id).equals(pw)) {
					System.out.println("�α����� �Ϸ�Ǿ���ϴ�.");
					break;
				} else {
					System.out.println("��й�ȣ�� �ٸ��ϴ�.");
					
				}
			}else {
				System.out.println("�Է��Ͻ� ���̵� �����ϴ�.");
			}
		}
		
	}

}
