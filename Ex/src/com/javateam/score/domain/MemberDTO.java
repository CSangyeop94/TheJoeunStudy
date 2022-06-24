package com.javateam.score.domain;

import java.util.Date;
// 1) 맴버 필드 구성
// 2) 생성자 : 생성자 오버로딩(setter"s")
// 3) getter/setter
// 4) toString : getter"s"
//  	: 객체 맴버 필드(들) 조회

public class MemberDTO {
	public MemberDTO () {}
	// 복사 생성자
	public MemberDTO(MemberDTO memberDTO) {
		this.id = memberDTO.getId();
		// 이하 생략
	}
	
	public MemberDTO(String id, String pw, String name, String address, String string) {
	this.id = id;
	this.pw = pw;
	this.name = name;
	this.address = address;
	this.joinDate = joinDate;
	}
	// 회원 아이디
	private String id;
	// 회원 비밀번호
	private String pw;
	// 회원 이름
	private String name;
	// 회원 주소
	private String address;
	// 회원 가입 날짜
	private Date joinDate;
	
	// 맴버 필드들을 초기화
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	public static void main(String[] args) {
		MemberDTO obj = new MemberDTO("abcd", "1234","홍길동", "강남","주소");
		
		
	}
}
