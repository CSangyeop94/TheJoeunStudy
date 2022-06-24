package com.javateam.score.domain;

public class SubjectDTO {
	
	// �ʵ� ����

	private byte korean;
	private byte english;
	private byte math;
	private int sum;
	private float avg;
	
	// �⺻ ������
	public SubjectDTO() {

	}
	// �����ε� ������
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
		return "�л� ���� ���� ��Ȳ : ����=" + korean + ", ����=" + english + ", ����=" + math + ", ����=" + sum + ", ���="
				+ avg;
	}


}
