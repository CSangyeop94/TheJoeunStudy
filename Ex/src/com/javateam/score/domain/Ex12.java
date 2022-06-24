package com.javateam.score.domain;

import java.util.ArrayList;
import java.util.Scanner;


/**
 * 국영수 총점/평균 프로그램
 * 
 * @author javateam 
 * @since 2022.6.14
 * @version 1.0
 */
public class Ex12 {
	
	public static void main(String[] args) { 

		/* --------------- 학생 인원수 입력부 --------------- */
		
		Scanner sc = new Scanner(System.in); // null 방지 패치
		ScoreService scoreSvc = new ScoreServiceImpl();
		
		int num = scoreSvc.inputNum(sc);
		System.out.println("성적 입력 인원수 : " + num);
		
		/* -------------- 국/영/수 성적 입력부 ---------------- */
		
		ArrayList<SubjectDTO2> subjectList = new ArrayList<>();
		subjectList = scoreSvc.inputScores(sc, subjectList, num);
			
		/* -------------- 전체 인원의 성적 개별 현황 인쇄 --------------  */
		
		System.out.println("\n--------------------- 전체 인원 개별 성적 현황 --------------------\n");
		
		subjectList.forEach(x->System.out.println(x));
		
		/* -------------- 전체 인원의 성적 총괄 현황 인쇄 --------------  */
		
		System.out.println("\n--------------------- 전체 인원 성적 총괄 현황 --------------------\n");
		
		scoreSvc.printScores(subjectList);
		
		System.out.println("\n-------------- 전체 인원 성적 현황 과목별 성적순 정렬 -----------------\n");
		
		scoreSvc.sortScores(sc, subjectList);
		
		sc.close();
	} //

}
