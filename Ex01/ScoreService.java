package com.javateam.score.util;

import java.awt.TextField;
import java.nio.file.FileStore;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
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
	 * 학생 성적 현황 입력/계산 (AWT GUI 입력)
	 * 
	 * @param tf 텍스트 필드(입력란)
	 * @param scoresStr 성적 현황
	 * @return (계산 처리된) 성적 현황
	 */
	public SubjectDTO2 inputScore(TextField tf, String scoresStr);	
	
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
	
	
	/**
	 * 학생 성적 현황 파일 저장
	 * 
	 * @param filename 저장 파일명
	 * @param subjetList 성적 현황 리스트
	 */
	public void storeScoresFile(ArrayList<SubjectDTO2> subjectList, String filename);

	/**
	 * 학생 성적을 서버에 전송
	 * 
	 * @param subjectList 성적 현황 리스트
	 */
	public void sendScores(ArrayList<SubjectDTO2> subjectList);
	
	/**
	 * 개별 학생 성적을 서버에 전송
	 * 
	 * @param subjectDTO2 개별 성적 현황
	 */
	public void sendScores(SubjectDTO2 subjectList);
	
	/**
	 * 학생 성적 현황 파일 저장 (서버)
	 * 
	 * @param filename 저장 파일명
	 * @param subjetList 클라리언트에서 전송된 성적 현황 리스트
	 */
	public void storeScoresFileByServer(List<String> subjectList, String filename);
	
	/**
	 * 학생 성적 현황 파일 저장 (서버)
	 * 
	 * @param filename 저장 파일명
	 * @param subjetList 클라리언트에서 전송된 성적 현황 리스트
	 * @param fileOption 파일 옵션 ex) StandardOpenOption.CREATE
	 */
	public void storeScoresFileByServer(List<String> subjectList, String filename, StandardOpenOption fileOption);
	
	/**
	 * 학생 성적 현황 파일 저장 (서버) : 인코딩 지원
	 * 
	 * @param filename 저장 파일명
	 * @param subjetList 클라리언트에서 전송된 성적 현황 리스트
	 * @param encoding 인코딩 방식 ex) UTF-8, MS949
	 * @param fileOption 파일 옵션 ex) StandardOpenOption.CREATE
	 */
	public void storeScoresFileByServer(List<String> subjectList, String filename, 
									    String encoding, StandardOpenOption fileOption);
	
}
