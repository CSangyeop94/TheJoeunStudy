package com.dwit.ex03;
import com.dwit.ex01.*;
import com.dwit.ex02.*;
import com.dwit.ex03.*;

public class Result {
	
	public static void main(String[] args) {
		
		// import package�� ����ִ� class �� �����ҋ��� public �� �־����
		Sungjuk sung = new Sungjuk(100, 80, 60);
		
		IdCheck idc = new IdCheck("admin", "1111");
		
		int tot =  sung.getTot();
		System.out.println("���� : "+ tot);
		idc.getId();
		
		
		
	}
}
