package com.javateam.score.domain;

public class SubjectDTO {
	
	// 필드 생성

	private byte korean;
	private byte english;
	private byte math;
	private int sum;
	private float avg;
	
	// 기본 생성자
	public SubjectDTO() {

	}
	// 오버로딩 생성자
	public SubjectDTO(byte korean, byte english, byte math) {
		this.korean = korean;
		this.english = english;
		this.math = math;
	}

	public int getKorean() {
		return korean;
	}

	public void setKorean(byte korean) {
		this.korean = korean;
	}

	public byte getEnglish() {
		return english;
	}

	public void setEnglish(byte english) {
		this.english = english;
	}

	public byte getMath() {
		return math;
	}

	public void setMath(byte math) {
		this.math = math;
	}

	public int getSum() {
		return (korean + english + math);
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public float getAvg() {
		return ((float) sum / 3);
	}

	public void setAvg(float avg) {
		this.avg = avg;
	} 

	public void setSum(byte korean, byte english, byte math) {
		this.sum = this.korean + this.english + this.math;
	}

	public float getAvg(float avg, int n) {
		
		float power = (float) Math.pow(10, n - 1);
		this.avg = (float) Math.round(avg * power) / power;
		return this.avg;
	}
	@Override
	public String toString() {
		return "학생 개인 성적 현황 : 국어=" + korean + ", 영어=" + english + ", 수학=" + math + ", 총점=" + sum + ", 평균="
				+ avg;
	}


}
