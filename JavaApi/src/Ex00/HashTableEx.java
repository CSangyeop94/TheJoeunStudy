package Ex00;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> map = new Hashtable<String, String>();
		// id와 pw을 미리 저장해둔다.
		map.put("Spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");  
		map.put("winter", "12345");
		Scanner sc =new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디와 비밀번호를 입력해주세요");
			System.out.println("아이디 : ");
			String id = sc.next();
			
			System.out.println("비밀번호 : ");
			String pw = sc.next();
			System.out.println();
			
			if(map.containsKey(id)) {
				if(map.get(id).equals(pw)) {
					System.out.println("로그인이 완료되어습니다.");
					break;
				} else {
					System.out.println("비밀번호가 다릅니다.");
					
				}
			}else {
				System.out.println("입력하신 아이디가 없습니다.");
			}
		}
		
	}

}
