package example;

import java.util.Scanner;

public class CheckEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("id 입력");
		String id = sc.next();
		System.out.println("pw 입력");
		String pw = sc.next();
		// 부모 클래스
		Check check1 = new Check(id, pw);
		check1.Idc(check1); // check1 이 주소번지를 넘김
		//자식 클레스 매게 변수 (클래스 변수) 대입해서 부모타입으로 자동 형변환
		
		Check check2 = new IdCheck(id, pw);
		check2.Idc(check2); // 위와 동일
		//필드는 못하지만 메소드는 재정의가 가능함
	
		
		
		
		
		

	}

}
