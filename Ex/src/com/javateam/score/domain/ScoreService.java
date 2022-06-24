package com.javateam.score.util;

import java.util.ArrayList;
import java.util.Scanner;

import com.javateam.score.domain.SubjectDTO2;

public interface ScoreService {
	
	/**
	 * 학생 인원수 입력
	 * 
	 * @param sc Scanner 객체
	 * @return 학생 인원수
	 */
	public int inputNum(Scanner sc);
	
	/**
	 * 학생 성적 현황 입력/계산
	 * 
	 * @param sc Scanner 객체
	 * @param subjectList 성적 현황 리스트
	 * @param num 학생 인원수
	 * @return (계산 처리된) 성적 현황 리스트
	 */
	public ArrayList<SubjectDTO2> inputScores(Scanner sc, ArrayList<SubjectDTO2> subjectList, int num);	
	
	/**
	 * 
	 * @param subjectList
	 */
	public void printScores(ArrayList<SubjectDTO2> subjectList);
	
	
	/**
	 * 학생 성적 현황 정렬
	 * 
	 * @param sc Scanner 객체
	 * @param subjectList 성적 현황 리스트
	 */
	public void sortScores(Scanner sc, ArrayList<SubjectDTO2> subjectList);
}