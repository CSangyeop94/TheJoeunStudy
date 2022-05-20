package com.dwit.ex03;
import com.dwit.ex01.*;
import com.dwit.ex02.*;
import com.dwit.ex03.*;

public class Result {
	
	public static void main(String[] args) {
		
		// import package에 들어있는 class 에 접근할떄는 public 가 있어야함
		Sungjuk sung = new Sungjuk(100, 80, 60);
		
		IdCheck idc = new IdCheck("admin", "1111");
		
		int tot =  sung.getTot();
		System.out.println("총점 : "+ tot);
		idc.getId();
		
		
		
	}
}
