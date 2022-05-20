package com.dwit.ex02;

public class IdCheck {
	
	String id; String pw; 
	
	// 积己磊
	public IdCheck(String id, String pw) {
		this.id =id;
		this.pw =pw;
	}
	
	
	public void getId() {

		if(id.equals("admin") && pw.equals("1111")) {
			System.out.println("立加己傍");
		}else {
			System.out.println("立加角菩");
		}
	}
	
	
		
	}

