package com.javateam.score.domain;

import java.util.Date;
// 1) �ɹ� �ʵ� ����
// 2) ������ : ������ �����ε�(setter"s")
// 3) getter/setter
// 4) toString : getter"s"
//  	: ��ü �ɹ� �ʵ�(��) ��ȸ

public class MemberDTO {
	public MemberDTO () {}
	// ���� ������
	public MemberDTO(MemberDTO memberDTO) {
		this.id = memberDTO.getId();
		// ���� ����
	}
	
	public MemberDTO(String id, String pw, String name, String address, String string) {
	this.id = id;
	this.pw = pw;
	this.name = name;
	this.address = address;
	this.joinDate = joinDate;
	}
	// ȸ�� ���̵�
	private String id;
	// ȸ�� ��й�ȣ
	private String pw;
	// ȸ�� �̸�
	private String name;
	// ȸ�� �ּ�
	private String address;
	// ȸ�� ���� ��¥
	private Date joinDate;
	
	// �ɹ� �ʵ���� �ʱ�ȭ
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
		MemberDTO obj = new MemberDTO("abcd", "1234","ȫ�浿", "����","�ּ�");
		
		
	}
}
