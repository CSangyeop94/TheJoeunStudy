package com.dwit.ex02;

public class IdCheck {
	
	String id; String pw; 
	
	// ������
	public IdCheck(String id, String pw) {
		this.id =id;
		this.pw =pw;
	}
	
	
	public void getId() {

		if(id.equals("admin") && pw.equals("1111")) {
			System.out.println("���Ӽ���");
		}else {
			System.out.println("���ӽ���");
		}
	}
	
	
		
	}

