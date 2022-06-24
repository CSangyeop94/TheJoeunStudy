package com.javateam.score.domain;

public class SubjectDTO2 {
	private String name;
	private byte korean;
	private byte english;
	private byte math;
	private int sum;
	private float avg;
	
	
	@Override
	public String toString() {
		return "SubjectDTO2 [name=" + name + ", korean=" + korean + ", english=" + english + ", math=" + math + ", sum="
				+ sum + ", avg=" + avg + "]";
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public byte getKorean() {
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


	public int getSum(byte korean, byte english,byte math) {
		sum = korean+english+math;
		return sum;
	}


	public void setSum(int sum) {
		this.sum = sum;
	}


	public float getAvg(int sum) {
		avg = sum/3;
		return avg;
	}


	public void setAvg(float avg) {
		this.avg = avg;
	}


	
	}

