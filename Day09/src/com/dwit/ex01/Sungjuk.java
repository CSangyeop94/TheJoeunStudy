package com.dwit.ex01;

public class Sungjuk {
	int kor; int eng; int mat;
	
	// ������
	public Sungjuk(int kor, int eng, int mat){
		this.kor =kor;
		this.eng = eng;
		this.mat = mat;
	}
	public int getTot () {
		return (kor+eng+mat);
		}
	
	
}

