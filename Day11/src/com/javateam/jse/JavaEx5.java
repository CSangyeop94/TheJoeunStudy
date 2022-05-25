package com.javateam.jse;
import com.javateam.jse.Child;
import com.javateam.jse.Parent;

public class JavaEx5 {
	
	public static void main(String[] args) {
		
		int num1 = 1;
		long num2 = num1; // 자동 형변환
		
		// num1 = num2 // 데이터탑이이 큰게 작은곳으로 갈수없음
		   num1 = (int) num2; // 따라서 형변환을 해줘야함
		   System.out.println("num1 : " + num1);
		   
		   // Parent p = new Parent(); - 에러를 유발한다
		   Parent p = new Child(); // 형변환 가능
		   Child c = new Child();
		   
		   p = c; // 자동 형변환
		   // 자녀 클래스 -> 부모 클래스 자동 형변환
		   
		   c = (Child)p; // 
		   // c = p; // (x)
		   // 작은(sub) => 큰(super) : promotion
		   // 큰(super) => 작은(sub) : casting
		   // 광의 형변환(casting) : promotion + casting
		   // 형변환(casting) 예외(오류)
		   
		   //컴파일 (o) => 실행시 예러
	}
}




